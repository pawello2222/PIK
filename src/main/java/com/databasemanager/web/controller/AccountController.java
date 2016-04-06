package com.databasemanager.web.controller;

import com.databasemanager.domain.model.Account;
import com.databasemanager.domain.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @RequestMapping("/login")
    public String login() {
        Account account = this.accountService.getAccountByUsername("User1");
        return "account/login";
    }

    @RequestMapping("/create")
    public String create() {
        return "account/create";
    }
}