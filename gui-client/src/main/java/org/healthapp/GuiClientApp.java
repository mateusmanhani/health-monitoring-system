package org.healthapp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"org.healthapp"})
public class GuiClientApp{
    public static void main(String[] args) {
        SpringApplication.run(GuiClientApp.class, args);
    }


}