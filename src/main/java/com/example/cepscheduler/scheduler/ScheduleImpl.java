package com.example.cepscheduler.scheduler;

import com.example.cepscheduler.product.service.interfaces.ProductCrawlService;
import com.example.cepscheduler.product.service.interfaces.ProductService;
import com.example.cepscheduler.util.enums.ConvenienceClassification;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ScheduleImpl implements Schedule{
  private final ProductService productService;
  private final ProductCrawlService productCrawlService;
  @Override
  public void startCrawl(ConvenienceClassification convenienceClassification) {
    productService.deleteAllByConvenienceClassification(convenienceClassification);
    switch (convenienceClassification) {
      case CU -> System.out.println(productCrawlService.crawlCuProducts());
      case GS25 -> System.out.println(productCrawlService.crawlGsProducts());
      case EMART24 -> System.out.println(productCrawlService.crawlEmartProducts());
    }
  }

  @Override
  public void CuCrawl() {
    productCrawlService.crawlCuProducts();
  }

  @Override
  public void GsCrawl() {
    productCrawlService.crawlGsProducts();
  }

  @Override
  public void EmartCrawl() {
    productCrawlService.crawlEmartProducts();
  }
}
