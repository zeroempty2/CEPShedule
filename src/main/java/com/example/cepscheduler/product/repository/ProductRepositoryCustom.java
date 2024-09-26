package com.example.cepscheduler.product.repository;

import com.example.cepscheduler.product.entity.Product;
import java.util.List;

public interface ProductRepositoryCustom {
  void saveAll(List<Product> products);
}
