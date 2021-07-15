package com.company;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Stream;



public class Main {

    public static void main(String[] args) {

    //List used to create an array as a list containing bingo numbers
	List<String> someBingoNumbers = Arrays.asList(
	        "N40", "N36",
            "B12", "B6",
            "G53", "G49", "G60", "g64",
            "I26", "I17", "I29",
            "O71");

	//This is used to hold only the numbers beginning with the letter G
	List <String> gNumbers = new ArrayList<>();

		//This for-each loop is used to filter out the numbers beginning with G
//	    someBingoNumbers.forEach(number -> {
//	        if(number.toUpperCase().startsWith("G")) {
//	            gNumbers.add(number);
//	                System.out.println(number);
//            }
//        });
//
		//sorts the numbers according to letter
//	    gNumbers.sort((String s1, String s2) -> s1) -> s1.compareTo(s2));
//		gNumbers.forEach((String s) -> System.out.println(s));

		//
		someBingoNumbers
				//streams are a set of object references
				//must be non-interfering (don't change the source in any way)
				//must be stateless (can't depend on any state outside of the operation)
				.stream()
				//:: notation is called a method reference
				//we can use them when we call an existing method
				.map(String::toUpperCase)
				//this .filter method contains a lambda function
				//it is filtering s's that start with the letter "G"
				.filter(s->s.startsWith("G"))
				//this is where we sort the items
				//sorts the items by the natural order in the stream
				.sorted()
				//here we are printing the results using the for-each method
				//returns methods from the stream class
				.forEach(System.out::println);

		//Stream of string objects (can't have mixed types)
		Stream<String> ioNumberStream = Stream.of("I26", "I17", "I29", "O71");
		//Another stream of string objects
		Stream<String> inNumberStream = Stream.of("N40", "N36", "I26", "I17", "I29", "O71");
		//This is where we concatonate the streams together using the .concat method
		Stream<String> concatStream = Stream.concat(ioNumberStream, inNumberStream);

		System.out.println("----------------------------");
		//This is where we return the concatonated stream
		System.out.println(concatStream
				.distinct()
				//here we print the results of each operation
				//the peek method accepts a consumer argument
				.peek(System.out::println)
				.count());
    }
}
