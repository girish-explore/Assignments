package com.banking.transferapi.bankpayment.config;



import com.company.paymentapi.bankpayment.service.forex.MyForexFallBack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import feign.Feign;
import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import io.github.resilience4j.ratelimiter.RateLimiter;

import io.github.resilience4j.feign.FeignDecorators;
import io.github.resilience4j.feign.Resilience4jFeign;

@Configuration
public class FeignConfig {
   @Autowired
   private CircuitBreakerRegistry registry; 
    @Autowired
    private MyForexFallBack fallBack;
    

   @Bean
   @Scope("prototype")
   public Feign.Builder feignBuilder(){
       CircuitBreaker circuitBreaker = CircuitBreaker.ofDefaults("forex-service");
       RateLimiter rateLimiter=RateLimiter.ofDefaults("forex-service");
       FeignDecorators decorators = FeignDecorators.builder().withRateLimiter(rateLimiter).withCircuitBreaker(circuitBreaker).withFallback(fallBack).build();
      return Resilience4jFeign.builder(decorators);
    }
}
