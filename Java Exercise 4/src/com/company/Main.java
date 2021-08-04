package com.company;


//Problem:
//We have a loud talking parrot.
// The "hour" parameter is the current hour time in the range 0..23.
// We are in trouble if the parrot is talking and the hour is before 7 or after 20.
// Return true if we are in trouble.

//Test Cases:
//parrotTrouble(true, 6) → true
//parrotTrouble(true, 7) → false
//parrotTrouble(false, 6) → false


public boolean parrotTrouble(boolean talking, int hour) {
        if ((talking) && (hour<7 || hour>20)){
        return true;
        }return false;
        }



//Pseudocode:
//We have a parrot
//The hour parameter is the current hour in the rante of 0-23 (index of an array)
//We are in trouble if the hour is less than (<) 7 or greater than (>) 20
//We want to return true if we are in trouble