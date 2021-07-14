package com.company;

public class Main {

    public static void main(String[] args) {

    	//new instances of the Camera class
	    Camera canon = new Camera();
	    Camera pentax = new Camera();
	    Camera nikon = new Camera();
	    Camera insta360 = new Camera();
	    Camera gopro = new Camera();
	    Camera leica = new Camera();
	    Camera hasselblad = new Camera();
		Camera dji = new Camera();

		//using a setter to set the model assigned to gopro
	    gopro.setModel("session");

	    //printing out the model of gopro
	    System.out.println("Model is " + gopro.getModel()".");
    }
}
