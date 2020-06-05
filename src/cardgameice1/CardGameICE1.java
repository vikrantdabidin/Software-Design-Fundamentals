/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameice1;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author srinivsi
 * @modifier Vikrant Dabidin - 991590150
 print 7 cards (values,suits) and takes input 
 then prints if matching card is found in an array
 */
public class CardGameICE1
{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        // code to generate 7 random cards and store in array
        
        Card[] magicHand = new Card[7]; //array of object
        
        for (int i = 0; i < magicHand.length; i++) {
            
            Card c = new Card (); //object
            
            magicHand[i] = c; //saving object in array
            
            c.setValue(); //method to generate random value from 1 to 13
            c.setSuits(); //method random suits
            
        }
        
          System.out.println(Arrays.toString(magicHand));
          
          Scanner input = new Scanner(System.in);
    
            System.out.println("Enter card number: ");
        
            String cardNumber = input.nextLine(); 
            
            System.out.println("Enter card suit: ");
        
            String cardSuit = input.nextLine(); 
            
            String userCard = cardNumber + " " + cardSuit;
            
            if(Arrays.asList(magicHand).contains(userCard)){
                System.out.println("The user card is found in the magic hand");
                
            }
            
            else{
                
                System.out.println("The user card is not found in the magic hand");
            }
            


            }


    }

