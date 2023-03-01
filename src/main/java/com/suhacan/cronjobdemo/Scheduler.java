package com.suhacan.cronjobdemo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Scheduler {
    @Scheduled(cron = "*/5 * * * * *") // Every 5 seconds
    public void everySecond() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String date = dateFormat.format(now);
        System.out.println("Cron second job is running this time: " + date);
    }

    @Scheduled(cron = "0 */2 * * * *") // Every 2 minutes
    public void everyMinute() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String date = dateFormat.format(now);
        System.out.println("Cron minute job is running this time: " + date);
    }
}
//    Examples of cron expressions:
//    "0 0 * * * *" = the top of every hour of every day.
//    "*/10 * * * * *" = every ten seconds.
//    "0 0 8-10 * * *" = 8, 9 and 10 o'clock of every day.
//    "0 0 6,19 * * *" = 6:00 AM and 7:00 PM every day.
//    "0 0/30 8-10 * * *" = 8:00, 8:30, 9:00, 9:30, 10:00 and 10:30 every day.
//    "0 0 9-17 * * MON-FRI" = on the hour nine-to-five weekdays
//    "0 0 0 25 12 ?" = every Christmas Day at midnight
