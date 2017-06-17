package com.dazazstertechnologies;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by dazaz on 6/17/2017.
 */
public class Main{

    public static void main(String[] args) {
        out.println("Hi World");
        out.println("Enter something:");
        String a = new String();
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        out.println("You entered: " + a);
    }
}
