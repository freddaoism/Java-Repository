package com.company;

//Problem:
//The fibonacci sequence is a famous bit of mathematics,
// and it happens to have a recursive definition.
// The first two values in the sequence are 0 and 1 (essentially 2 base cases).
// Each subsequent value is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
// Define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing the start of the sequence.

//Test Cases:
//fibonacci(0) → 0
//fibonacci(1) → 1
//fibonacci(2) → 1

public int fibonacci(int n) {
        //base case 1
        if (n == 0) return 0;
        //base case 2
        else if (n == 1) return 1;
        //recursive method?
        return fibonacci(n-1) + fibonacci(n-2);
        }

//Pseudocode:
//Base Case 1: if statement with n = 0 as the condition (returns 0)
//Base Case 2: else if statement with n = 1 (returns 1)
//Otherwise: will return n after passing through the recursive method

//Example 1:
//(fibonacci(2-1))) subtracting 1 while
//adding that to another instance of the same method (fibonacci(2-2))
//resulting in 1 being the result if 2 is passed through recursively

//Example 2:
//n = 3
//fibonacci(3-1) + fibonacci(3-2)
//result 2 + 1 = 3

//Example 3:
//n = 1
//passes through else-if

//Example 4:
//n = 0
//passes through if