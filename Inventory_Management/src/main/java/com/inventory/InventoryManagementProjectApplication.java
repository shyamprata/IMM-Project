package com.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.inventory.controller", "com.inventory.repo","com.inventory.service"})
public class InventoryManagementProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryManagementProjectApplication.class, args);
    }
}
