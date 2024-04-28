package com.air.plane;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * APP
 *
 */
@SpringBootApplication(scanBasePackages = {

})
// @MapperScan(basePackages = PackageConstants.MODELS)
@EnableTransactionManagement
@EnableScheduling
public class App
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class);
    }
}