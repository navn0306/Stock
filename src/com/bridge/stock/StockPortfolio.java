package com.bridge.stock;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class StockPortfolio {
    public static void main(String[] args) throws FileNotFoundException {

       
        File readData = new File("C:\\Users\\Navneet\\Documents\\StockInfo\\Stock.txt");
        Scanner scan = new Scanner(readData);

        while (scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }

    }
}
