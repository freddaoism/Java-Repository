package com.company;


//EXERCISE:
//We have two monkeys, a and b, and the parameters
// aSmile and bSmile indicate if each is smiling.
// We are in trouble if they are both smiling or if
// neither of them is smiling. Return true if we are in trouble.


        //monkeyTrouble(true, true) → true
        //monkeyTrouble(false, false) → true
        //monkeyTrouble(true, false) → false

public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
        return true;
        }
        if (!aSmile && !bSmile) {
        return true;
        }
        return false;

        }

//Pseudocode:
//We have monkeys a and b
//parameters aSmile and bSmile indicate if each is smiling
//We are in trouble if both are smiling
//We are in trouble if both are not smiling
//if one is smiling and the other isn't then we are not in trouble

//Shortened Pseudocode:
// if aSmile is equal to bSmile then we return true
// if aSmile is equal to bSmile then we return false

// Solution Notes:
// The above can be shortened to:
// return ((aSmile && bSmile) || (!aSmile && !bSmile));
// Or this very short version (think about how this is the same as the above)
// return (aSmile == bSmile);