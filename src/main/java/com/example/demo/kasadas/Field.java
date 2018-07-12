package com.example.demo.kasadas;

import lombok.Data;

import java.util.HashMap;
import java.util.List;

@Data
public class Field {

    private HashMap<Integer, Cell> field;

    private List<Ship> ships;

    public Field() {
        initField();
    }

    private void initField() {
        field = new HashMap<>();
        for (int c = 1; c < 8; c++) {
            for (int i = 1; i < 8; i++) {
                var cell = new Cell(c, i);
                field.put(cell.getId(), cell);
            }
        }
    }
}
