package com.example.cepscheduler.scheduler;

import com.example.cepscheduler.util.enums.ConvenienceClassification;

public interface Schedule {
  void startCrawl(ConvenienceClassification convenienceClassification);
  void CuCrawl();
  void GsCrawl();
  void EmartCrawl();
}
