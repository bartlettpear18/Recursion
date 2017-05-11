package com.company;

/**
 * Created by Joel.Bartlett18 on 5/7/2017.
 */
public class Reverse {

    private String input;
    private String output = "";

    public void reverse(String text) {
        input = text;
        System.out.println("Input is: " + input);
        System.out.println("Output is: " + output);

        if (input.length() > 1) {
            String temp = Character.toString(input.charAt(0));
            temp += output;
            output = temp;

            input = input.substring(1,input.length());
            reverse(input);
        }

        else if(input.length() == 1) {
            String temp = input;
            temp += output;
            output = temp;
            System.out.println("Final Output is: " + output);
        }

    }
}
