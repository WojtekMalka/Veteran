package wojtekMalka.Veteran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    @Autowired
    public DataSourceProperties dataSourceProperties;
    @Value("${my.prop}")
    public String myProp;

    @GetMapping("/info/url")
    String url() {
        return dataSourceProperties.getUrl();
    }

    @GetMapping("/info/prop")
    String myProp() {
        return myProp;
    }
}
