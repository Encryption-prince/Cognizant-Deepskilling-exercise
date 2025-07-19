package com.cognizant.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{number}")
    public Account getAccountDetails(@PathVariable String number) {
        return new Account(number, "savings", 234343);
    }

    // could have also created a separate model class for Account
    // but for simplicity I am using an inner class here
    static class Account {
        private String number;
        private String type;
        private double balance;

        public Account(String number, String type, double balance) {
            this.number = number;
            this.type = type;
            this.balance = balance;
        }

        public String getNumber() {
            return number;
        }

        public String getType() {
            return type;
        }

        public double getBalance() {
            return balance;
        }
    }
}
