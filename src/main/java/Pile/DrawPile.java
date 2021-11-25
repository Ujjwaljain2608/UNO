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

public class DrawPile {
	private Stack<Card> cardsPile = new Stack<Card>();
	
	public DrawPile(ArrayList<Card> cards) {
		for(Card c: cards) {
			this.cardsPile.add(c);
		}
	}
	
	public Card returnTopCard() {
		return this.cardsPile.pop();
	}
	
	public void addCard(Card c) {
		this.cardsPile.add(c);
	}
}
