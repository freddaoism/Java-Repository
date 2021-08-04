package com.company;

//Exercise:
//Given two int values,
//return their sum.
//Unless the two values are the same,
//then return double their sum.

//Test Cases:
//sumDouble(1, 2) → 3
//sumDouble(3, 2) → 5
//sumDouble(2, 2) → 8

//Answer:

public int sumDouble(int a, int b) {
        int sum = a + b;

        if (a == b){
        sum = sum * 2;
        }
        return sum;

        }

//Pseudocode:
// we have two int values (a and b)
// we want to return their sum (a + b)
// sum should be announced as a new variable since it is used multiple times within the expression (new variable)
// if the two values are the same then we want to return double their sum (if statement)
