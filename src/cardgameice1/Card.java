/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameice1;
/**
 *
 * @author srinivsi
 * @modifier Vikrant Dabidin - 991590150
 private variable then refactor it
 * - encapsulate fields (encapsulation principle) 
 getter/setters
 */
public class Card {
    
    private String suits; //diamonds,clubs,spades, hearts
    
    private int value; // 1 to 13
    
    public static final String[] SUITS = {"diamonds", "clubs", "spades", "hearts"};
    
    public String toString(){
        return getValue() + " " + getSuits();
    }

    public String getSuits() {
        return this.suits;
    }

    public void setSuits() {
        this.suits = SUITS[(int) (Math.random()*SUITS.length)];
    }

    public int getValue() {
        return this.value;
    }

    public void setValue() {
        this.value = (int) (Math.random()*13 + 1);
    }

}
