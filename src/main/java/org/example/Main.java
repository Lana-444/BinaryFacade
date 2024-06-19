package org.example;

public class Main {
    public static void main(String[] args) {

        BinOps bins = new BinOps();

        String binaryA = "10";
        String binaryB = "11";

        String sumResult = bins.sum(binaryA, binaryB);
        String multResult = bins.mult(binaryA, binaryB);

        System.out.println("Сумма: " + sumResult);
        System.out.println("Произведение: " + multResult);
    }
}