package com.company;

import java.util.Locale;

public class Camera {

    //private variables that can only be accessed within the class
    private int price;
    private int megapixels;
    private String model;
    private String maxISO;
    private String bodyType;

    //setter with validation that only prints models recognized within constraints
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if (validModel.equals("k-x") || validModel.equals("session")){
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }


    public String getModel(){
        return this.model;
    }
}
