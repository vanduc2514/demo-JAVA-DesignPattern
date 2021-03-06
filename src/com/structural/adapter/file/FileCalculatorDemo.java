package com.structural.adapter.file;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

import java.util.Scanner;

public class FileCalculatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file or folder path: ");
        String path = scanner.nextLine();
        FileCalculator calculator = new FileCalculatorUseLibs();
        FileCalculatorAdapter fileCalculatorAdapter = new FileCalculatorAdapter(calculator);
        fileCalculatorAdapter.printFileSize(path);
    }
}
