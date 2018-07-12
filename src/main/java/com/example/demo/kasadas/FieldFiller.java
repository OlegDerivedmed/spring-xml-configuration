package com.example.demo.kasadas;

import java.util.*;

public class FieldFiller {

    private Field fieldField;
    private HashMap<Integer, Cell> field;

    public FieldFiller(Field field) {
        fieldField = field;
        this.field = field.getField();
        fillField();
    }

    public Field getFilledField(){
        return fieldField;
    }

    private void fillField() {
        fieldField.setShips(List.of(getShip(generateRandomCellId())
                ,getShip(generateRandomCellId()),getShip(generateRandomCellId())));

    }

    private int generateRandomCellId() {
        int row = new Random().nextInt((7 - 1) + 1) + 1;
        int column = new Random().nextInt((7 - 1) + 1) + 1;
        return Integer.parseInt(String.valueOf(row) + column);
    }

    private Ship getShip(int cellId) {
        var shipp = new Ship();
        var ship = new ArrayList<Cell>();
        Cell cell = field.get(cellId);
        ship.add(cell);
        var direction = getRandomDirection();
        if (direction.equals(Directions.UP)) {
            var second = new Cell(cell.getRow() + 1, cell.getColumn());
            var third = new Cell(second.getRow() + 1, second.getColumn());
            ship.add(second);
            ship.add(third);
        }
        if (direction.equals(Directions.DOWN)) {
            var second = new Cell(cell.getRow() - 1, cell.getColumn());
            var third = new Cell(second.getRow() - 1, second.getColumn());
            ship.add(second);
            ship.add(third);
        }
        if (direction.equals(Directions.LEFT)) {
            var second = new Cell(cell.getRow(), cell.getColumn() - 1);
            var third = new Cell(second.getRow(), second.getColumn() - 1);
            ship.add(second);
            ship.add(third);
        }
        if (direction.equals(Directions.RIGHT)) {
            var second = new Cell(cell.getRow(), cell.getColumn() + 1);
            var third = new Cell(second.getRow(), second.getColumn() + 1);
            ship.add(second);
            ship.add(third);
        }

        if (isValid(ship)) {
            ship.forEach(s -> s.setHasShipPart(true));
            ship.forEach(s -> field.get(s.getId()).setHasShipPart(true));
            shipp.setShipParts(ship);
            System.out.println("!!!!!!!");
            ship.forEach(System.out::println);
            System.out.println("!!!!!!!");
            return shipp;
        }
        return getShip(cellId);
    }

    private boolean isValid(List<Cell> ship) {
        return ship.stream()
                .filter(c -> field.containsKey(c.getId()))
                .filter(c -> !field.get(c.getId()).isHasShipPart())
                .count() == ship.size();
    }

    private Directions getRandomDirection() {
        int rand = new Random().nextInt((4 - 1) + 1) + 1;
        if (rand == 1) {
            return Directions.DOWN;
        }
        if (rand == 2) {
            return Directions.LEFT;
        }

        if (rand == 3) {
            return Directions.RIGHT;
        }
        return Directions.UP;
    }
}
