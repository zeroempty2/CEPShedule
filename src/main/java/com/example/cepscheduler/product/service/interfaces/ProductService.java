package com.example.cepscheduler.product.service.interfaces;


import com.example.cepscheduler.product.entity.Product;
import com.example.cepscheduler.util.enums.ConvenienceClassification;
import java.util.List;
import org.springframework.data.domain.Page;

public interface ProductService {
  List<Product> findByProductNameInAndEventClassificationInAndConvenienceClassificationIn(List<String> productNames, List<String> eventClassifications,
      List<ConvenienceClassification> convenienceClassifications);
  void deleteAllByConvenienceClassification(ConvenienceClassification convenienceClassification);
  void deleteAllProduct();
}
