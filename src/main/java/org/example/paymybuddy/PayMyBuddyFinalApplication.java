package org.example.paymybuddy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"paymybuddy.controller", "paymybuddy.repository"})
public class PayMyBuddyFinalApplication {
    public static void main(String[] args) {
        try {
            SpringApplication.run(PayMyBuddyFinalApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
