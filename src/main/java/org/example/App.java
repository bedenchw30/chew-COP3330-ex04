package org.example;
import java.util.Scanner;
public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print( "Enter a noun: " );
        String noun = input.nextLine();

        System.out.print("Enter a verb: " );
        String verb = input.nextLine();

        System.out.print("Enter an adjective: " );
        String adjective = input.nextLine();

        System.out.print("Enter an adverb: ");
        String adverb = input.nextLine();

        System.out.println("Do you "+ verb + " your " + adjective +" " + noun +" " + adverb + "? That's hilarious!");

    }
}
