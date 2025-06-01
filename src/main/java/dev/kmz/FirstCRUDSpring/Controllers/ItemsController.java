package dev.kmz.FirstCRUDSpring.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class ItemsController {
    @GetMapping("/kmz")
    public String bemVindo() {
        return "";
    }
}

