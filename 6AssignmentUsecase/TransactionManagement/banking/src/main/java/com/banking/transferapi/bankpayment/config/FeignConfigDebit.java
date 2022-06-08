package com.banking.transferapi.bankpayment.config;



import com.company.paymentapi.bankpayment.service.debit.MyDebitFallBack;

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
public class FeignConfigDebit {
   @Autowired
   private CircuitBreakerRegistry registry; 
    @Autowired
    private MyDebitFallBack fallBack;
    

   @Bean
   @Scope("prototype")
   public Feign.Builder feignBuilder_Debit(){
       CircuitBreaker circuitBreaker = CircuitBreaker.ofDefaults("debit-service");
       RateLimiter rateLimiter=RateLimiter.ofDefaults("debit-service");
       FeignDecorators decorators = FeignDecorators.builder().withRateLimiter(rateLimiter).withCircuitBreaker(circuitBreaker).withFallback(fallBack).build();
      return Resilience4jFeign.builder(decorators);
    }
}
