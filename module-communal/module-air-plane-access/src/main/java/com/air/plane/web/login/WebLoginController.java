package com.air.plane.web.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web/auth")
public class WebLoginController {

    @GetMapping("/test")
    public Object test() {
        return "TEST";
    }
}
