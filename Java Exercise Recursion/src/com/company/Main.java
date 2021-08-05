package com.company;

//Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).

//Test Cases:
//factorial(1) → 1
//factorial(2) → 2
//factorial(3) → 6
//factorial(4) -> 24
//factorial(5) -> 120



public int factorial(int n) {
  if (n == 1) return 1;
  return n * factorial(n-1);
}


//this function takes in int n as an argument
// otherwise it will return this simplified factorial that recursively restarts the function
// n==1 is a taken as a condition that returns one if true

////Pseudocode:
////use recursion (a function that calls itself)
////n is one or more
////return the factorial of n
////it is n*(n-1) * (n-2)