package com.example.demo.kasadas;

import lombok.Data;

@Data
public class Cell {

    private int id;
    private int column;
    private int row;
    private boolean hasShipPart;

    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
        String s = new StringBuilder().append(row).append(column).toString();
        id = Integer.parseInt(s);
    }
}
