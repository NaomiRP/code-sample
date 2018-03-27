package com.charter.enterprise.motd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class MotdController {

    @Value("${message.daily}")
    private String messageOfTheDay;

    @GetMapping
    public String getMotd() {
        return messageOfTheDay;
    }

}
