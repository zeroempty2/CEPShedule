package com.example.cepscheduler.product.repository;

import com.example.cepscheduler.product.entity.Product;
import com.example.cepscheduler.util.enums.ConvenienceClassification;
import java.util.List;
import org.springframework.data.repository.Repository;


public interface ProductRepository  extends Repository<Product, Long>, ProductRepositoryCustom{
  void save(Product product);
  List<Product> findByProductNameInAndEventClassificationInAndConvenienceClassificationIn(List<String> productNames, List<String> eventClassifications,
      List<ConvenienceClassification> convenienceClassifications);
  void deleteAllByConvenienceClassification(ConvenienceClassification convenienceClassification);
}
