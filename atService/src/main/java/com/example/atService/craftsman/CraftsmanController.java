package com.example.atService.craftsman;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "worker/")
public class CraftsmanController {

    private final CraftsmanService craftsmanService;

    @Autowired
    public CraftsmanController(CraftsmanService craftsmanService){

        this.craftsmanService = craftsmanService;
    }

    @GetMapping("/")
    public List<Craftsman> getCraftsman() {
        return craftsmanService.getCraftsman();
    }

}
