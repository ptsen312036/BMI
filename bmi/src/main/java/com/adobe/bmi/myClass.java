package com.adobe.bmi;

public class myClass {

    public static void main(String[] args) {

        System.out.println("Your BMI is:" + BMI(1.65, 47.0));

    }

    public static double BMI(Double height, Double weight) {

        double yourBMI = weight/(height*height);

        if (yourBMI>24){
            System.out.println("Overweight");
        }else if (yourBMI>18){
            System.out.println("Moderate weight");
        }else if (yourBMI<18){
            System.out.println("Underweight");
        }
        return yourBMI;


    }
}
