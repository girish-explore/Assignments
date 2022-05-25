package com.usecase.stock.repository;

import com.usecase.stock.domain.Product;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
