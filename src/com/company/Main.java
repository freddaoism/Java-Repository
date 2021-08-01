package com.company;

public class Main {

    public static void main(String[] args) {
	//Create a for statement using a range of numbers from 1 to 1000 inclusive
    //Sum all the numbers that can be divided with both 3 and also 5

        //declare the count and sum
        int count = 0;
        int sum = 0;

        //iterate using a for loop
        for(int i = 1; i <= 1000; i++) {
            //set constraints within if statement
            if((i % 3 ==0) && (i % 5 == 0)) {
                //set count to increment by one if constraints are met
                count++;
                //add i to sum variable
                sum += i;
                //print the number to the console
                System.out.println("found number = " + i);
            }
            //stop the process if the count equals five
            if(count == 5) {
                break;
            }
        }
        //print the sum
        System.out.println("Sum =" + sum);
    }
}
