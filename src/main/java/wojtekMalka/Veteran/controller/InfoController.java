package wojtekMalka.Veteran.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    @Value("${spring.datasource.url}")
    public String url;
    @Value("${my.prop}")
    public String myProp;

    @GetMapping("/info/url")
    String url() {
        return url;
    }

    @GetMapping("/info/prop")
    String myProp() {
        return myProp;
    }
}
