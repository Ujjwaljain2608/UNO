/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pile;

/**
 *
 * @author ujjwaljain
 */
import java.util.*;

import Card.Card;

public class DiscardPile {
	public Stack<Card> discardDeck;
	public String topColor;
	
	public DiscardPile() {
		this.discardDeck = new Stack<Card>();
	}
	
	public DiscardPile(Card c) {
		this.discardDeck = new Stack<Card>();
		this.discardDeck.add(c);
	}
	
	public Card returnTopCard() {
		return this.discardDeck.lastElement();
	}
        public void removeTopCard() {
                this.discardDeck.remove(this.returnTopCard());
	}
	public void addCardToPile(Card c) {
		this.discardDeck.add(c);
	}
	public void setNewTopColor(String newColor) {
		this.topColor = newColor;
	}
	
	public void displayTopCard() {
		System.out.println("Color of last card: " + this.topColor);
		System.out.println("Number/Attribute on last card: " + this.returnTopCard().getCardDetails());
	}
}
