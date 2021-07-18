package com.company;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        //Asking user for the amount of minutes they would like to convert
        System.out.println("How many minutes would you like to convert to years and days?");
        Long minutes = scanner.nextLong();
        scanner.nextLine();

        MinutesToYearsDaysCalculator(minutes);

    }

    //Method used to convert minutes to years and days
    public static long MinutesToYearsDaysCalculator(long minutes){
        //this if statement ensures that the user inputs more than 0 minutes
        if (minutes <0) {
            System.out.println("Invalid Value");

        //This part of the method runs calculations that return the converted value of the minutes to a year and days
        } else {
            long years = minutes / 525600;
            long minutesRemaining = (minutes - (years * 525600));
            long daysRemaining = minutesRemaining / 1440;

            System.out.println(minutes + " minutes = " + years + " years and " + daysRemaining + " days");
        }
        return minutes;
    }



}