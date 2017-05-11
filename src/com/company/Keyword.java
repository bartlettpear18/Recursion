package com.company;

/**
 * Created by Joel.Bartlett18 on 5/7/2017.
 */
public class Keyword {
    private String input;
    private String key;
    private Boolean inputHasKey;
    private int counter;


    public Boolean find(String text, String str) {
        input = text;
        key = str;
        counter++;
        System.out.println(counter);
        System.out.println(input);
        if(input.substring(0,key.length()).equals(key)) {
            inputHasKey = true;
        } else {
            input = input.substring(1,input.length());
            System.out.println("Input is " + input);
            find(input,key);
        }

        return inputHasKey;
    }

    public void status() {
        System.out.println(inputHasKey);
        System.out.println(counter-1);
    }


    public void fact(int n) {
        int output = 0;
        if(n==1) {
            output += 1;
        } else if(n >1) {
            fact(n-1);
        }
    }
}
