package com.company;

//The parameter weekday is true if it is a weekday,//
//and the parameter vacation is true if//
//we are on vacation. We sleep in if it is not a weekday//
//or we're on vacation. Return true//
//if we sleep in.//

//Test Cases://
//sleepIn(false, false) → true//
//sleepIn(true, false) → false//
//sleepIn(false, true) → true//
//Psuedocode://

//weekday = true if it is a weekday//
//vacation = true if we are on vacation//
//sleep in = true if it is not a weekday or we are on vacation//

//if it is not a weekday or we are on vacation then it is true that we sleep in.//

    public boolean sleepIn(boolean weekday,boolean vacation){
        if(!weekday||vacation){
        return true;
        }
        return false;
        }

// Solution notes: better to write "vacation" than "vacation == true"//
// though they mean exactly the same thing.//
// Likewise "!weekday" is better than "weekday == false".//
// This all can be shortened to: return (!weekday || vacation);//
// Here we just put the return-false last, or could use an if/else.//
// "||" is the or operator//