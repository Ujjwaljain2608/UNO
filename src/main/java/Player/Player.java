/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Player;


import java.util.*;

import Card.Card;
import Pile.DiscardPile;
import Pile.DrawPile;

public class Player {
	private String playerName;
	public ArrayList<Card> playerHand = new ArrayList<Card>();
	private int playerNumber;
        public DrawPile drawPile;
	public DiscardPile discardPile;
	Scanner sc = new Scanner(System.in);
	
	public Player(String name, int playerNumber, DiscardPile discardPile, DrawPile deck) {
		this.playerName = name;
		this.playerNumber = playerNumber;
		for(int i=0; i<7; i++) {
			this.playerHand.add(deck.returnTopCard());
		}
                this.discardPile = discardPile;
		this.drawPile = drawPile;
	}

	
	public String getPlayerName() {
		return this.playerName;
	}
        
        public int getPlayerTurn(){
            return this.playerNumber;
        }
        
        public int numCardsLeft() {
		return this.playerHand.size();
	}
	
	public void displayPlayerInfo() {
		System.out.println("Player name: " + this.playerName);
		System.out.println("Number of cards left: " + this.playerHand.size());
	}
	
	public void pickCard(DrawPile deck) {
		this.playerHand.add(deck.returnTopCard());
	}
	
	public void removeCard(DiscardPile discardDeck, int pos) {
		discardDeck.discardDeck.add(this.playerHand.remove(pos));
	}
	public int checkForValidNormalCard(DiscardPile discardDeck) {
		
		Card topCard = discardDeck.returnTopCard();
		String topCardType = topCard.getCardType();
		String topCardColor = topCard.getCardColor();
		String topCardAttr = topCard.getCardDetails();

		for(int i=0; i<this.playerHand.size(); i++) {
			Card c = this.playerHand.get(i);
			String cType = c.getCardType();
			String cColor = c.getCardColor();
			String cAttr = c.getCardDetails();
			if(cType.equals("Normal") && (cColor.equals(topCardColor) || cAttr.equals(topCardAttr))) {
				return i;
			}
		}
		
		return -1;
	}
	
	public void showPlayerHand() {
		System.out.println("Player hand: ");
		for(Card c: this.playerHand) {
			c.displayCard();
		}
	}
	public int checkForValidSpecialCard(DiscardPile discardDeck) {
		Card topCard = discardDeck.returnTopCard();
		
		String topCardType = topCard.getCardType();
		String topCardColor = topCard.getCardColor();
		String topCardAttr = topCard.getCardDetails();
		
		for(int i=0; i<this.playerHand.size(); i++) {
			Card c = this.playerHand.get(i);
			
			String cType = c.getCardType();
			String cColor = c.getCardColor();
			String cAttr = c.getCardDetails();
			
			if(cType.equals("Special") && (cAttr.equals("DrawFour") || cAttr.equals("Wild") || (cColor.equals(topCardColor) || cAttr.equals(topCardAttr)))) {
				return i;
			}
		}
		return -1;
	}
	
	
	
}
