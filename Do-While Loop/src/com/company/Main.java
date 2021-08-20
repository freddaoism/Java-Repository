package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
	int count = 0;

        System.out.println("What would you like to count to?");
        int countTo = obj.nextInt();

        do {
            count++;
            System.out.println(count);
        }while (count < countTo);

    }
}

