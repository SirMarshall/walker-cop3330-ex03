/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carter Walker
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //Necessary variable declaration
        Scanner input = new Scanner(System.in);
        String quote,author;

        //Quote query
        System.out.println( "What is the quote? " );
        quote = input.nextLine();

        //Author query
        System.out.println("Who said it?");
        author = input.nextLine();

        //Final print
        System.out.println(author + " says, \"" + quote + "\"");
    }
}
