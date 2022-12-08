package com.example.atService.craftsman;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CraftsmanService {

    public List<Craftsman> getCraftsman() {
        return List.of(
                new Craftsman(
                        1L,
                        "Rohim",
                        "plumber",
                        "Rangpur",
                        "+88017231652",
                        "Morning",
                        true,
                        "Super effective"
                )
        );
    }

}
