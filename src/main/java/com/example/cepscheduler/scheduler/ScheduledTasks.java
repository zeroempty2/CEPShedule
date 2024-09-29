package com.example.cepscheduler.scheduler;

import com.example.cepscheduler.util.enums.ConvenienceClassification;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
@RequiredArgsConstructor
public class ScheduledTasks {

  private final Schedule schedule;

  @Scheduled(cron = "0 0 0 * * ?", zone = "Asia/Seoul")
  public void runApiWithAdministratorRole() {
    callSchedule();
  }

  public void callSchedule() {
    ConvenienceClassification[] arr = {ConvenienceClassification.CU,ConvenienceClassification.GS25,ConvenienceClassification.EMART24};
    for(ConvenienceClassification c : arr) schedule.startCrawl(c);
  }

}
