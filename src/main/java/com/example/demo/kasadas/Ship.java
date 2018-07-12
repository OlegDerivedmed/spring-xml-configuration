package com.example.demo.kasadas;

import lombok.Data;

import java.util.List;

@Data
public class Ship {

    private boolean isDestroyed;
    private List<Cell> shipParts;
}
