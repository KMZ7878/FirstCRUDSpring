package dev.kmz.FirstCRUDSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class Controller {
    @GetMapping("/kmz")
    public String bemVindo() {
        return "";
    }
}

