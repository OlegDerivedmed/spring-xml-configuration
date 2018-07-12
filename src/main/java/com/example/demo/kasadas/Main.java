package com.example.demo.kasadas;


public class Main {
    public static void main(String[] args) {
        var field = new FieldFiller(new Field()).getFilledField();
        field.getShips().forEach(System.out::println);
        field.getField().values().forEach(System.out::println);
        for (int i = 1; i <8 ; i++) {
            for (int j = 1; j <8 ; j++) {
                int cell = Integer.parseInt(new StringBuilder().append(i).append(j).toString());
                if (field.getField().get(cell).isHasShipPart()){
                    System.out.print("X");
                }else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
