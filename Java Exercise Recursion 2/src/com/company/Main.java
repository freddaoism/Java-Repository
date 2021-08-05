package com.company;

//Problem:
//We have a number of bunnies and each bunny has two big floppy ears.
//We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

//Test Case:
//bunnyEars(0) → 0
//bunnyEars(1) → 2
//bunnyEars(2) → 4

public int bunnyEars(int bunnies) {

        if (bunnies == 0) return 0;
        return 2 + bunnyEars(bunnies-1);

        }



        ///Pseudocode:
//each bunny has two floppy ears ( 1 bunny == 2 ears )
//if we have 0 bunnies we have 0 ears
//we want to compute total number of ears recursively
// 2 + (bunnies-1) is recursive and the proper amount of ears

//Example:
//we have two bunnies (bunnyEars(int bunnies))
//it is not 0 so we do not return zero
//instead we return (2 + (2-1)) -> which makes bunnyEars (int 3) but while it makes a recursive call towards the base case it fixes what it returns
//bunnyEars(int 3)  next step -> (2 + (3-1)) -> 4

//Example 2:
//we now have a test case of 4 bunnies  (bunnyEars(int 4))
//it is not 0 so we do not return zero
//instead we return (2 + (4-1)) -> which makes bunnyEars (int 5) but while it makes a recursive call towards the base case it fixes what it returns
//bunnyEars(int 5) next step -> (2 + (5-1)) -> 6