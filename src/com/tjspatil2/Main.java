package com.tjspatil2;

 public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car hyundai = new Car();
        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}