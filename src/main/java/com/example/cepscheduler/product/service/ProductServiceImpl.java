package com.example.cepscheduler.product.service;


import com.example.cepscheduler.product.entity.Product;
import com.example.cepscheduler.product.repository.ProductRepository;
import com.example.cepscheduler.product.service.interfaces.ProductService;
import com.example.cepscheduler.util.enums.ConvenienceClassification;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
  private final ProductRepository productRepository;

  @Override
  public List<Product> findByProductNameInAndEventClassificationInAndConvenienceClassificationIn(List<String> productNames, List<String> eventClassifications,
      List<ConvenienceClassification> convenienceClassifications) {
    return productRepository.findByProductNameInAndEventClassificationInAndConvenienceClassificationIn(productNames,eventClassifications,convenienceClassifications);
  }

  @Override
  @Transactional
  public void deleteAllByConvenienceClassification(
      ConvenienceClassification convenienceClassification) {
    productRepository.deleteAllByConvenienceClassification(convenienceClassification);
  }

  @Override
  @Transactional
  public void deleteAllProduct() {
    deleteAllByConvenienceClassification(ConvenienceClassification.CU);
    deleteAllByConvenienceClassification(ConvenienceClassification.GS25);
    deleteAllByConvenienceClassification(ConvenienceClassification.EMART24);
  }
}
