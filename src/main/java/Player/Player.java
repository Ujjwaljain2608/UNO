/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Player;

//package player;
import java.util.*;

import Card.Card;
import Pile.DiscardPile;
import Pile.DrawPile;

public class Player implements Runnable {
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
        @Override
	public void run() {
		System.out.println("Player " + this.playerNumber +  " playing... ");
		this.playerTurn(this.discardPile, this.drawPile);
	}

	public void playerTurn(DiscardPile discardDeck, DrawPile deck){
		Card topc = discardDeck.returnTopCard();
		boolean flag = true;
		switch(topc.getCardDetails()){
			case "DrawTwo":
				for(int i=0;i<this.playerHand.size();i++){
					Card c = this.playerHand.get(i);
					String cType = c.getCardType();
					String cColor = c.getCardColor();
					String cAttr = c.getCardDetails();
					if((topc.getCardColor().equals(cColor) && (cAttr.equals("Skip") || cAttr.equals("Reverse"))) || (cAttr.equals("DrawTwo")) || (cAttr.equals("DrawFour"))){
						removeCard(discardDeck,i);
						if(cAttr.equals("DrawFour")){
							System.out.println("Choose the Color: ");
							String color = sc.next(); ;
							discardDeck.setNewTopColor(color);
						}
						flag = false;
						break;
					}
				}
				if(flag){
					for(int i = 0;i<2;i++){
						pickCard(deck);
					}
				}
				break;
			case "Skip":
				for(int i=0;i<this.playerHand.size();i++){
					Card c = this.playerHand.get(i);
					String cType = c.getCardType();
					String cColor = c.getCardColor();
					String cAttr = c.getCardDetails();
					if((cAttr.equals("Skip"))){
						removeCard(discardDeck,i);
						flag = false;
						break;
					}
				}
				break;
			case "DrawFour":
				for(int i = 0;i<4;i++){
						pickCard(deck);
				}
				System.out.println("Choose the Color: ");
				String dfcolor = sc.next();
				discardDeck.setNewTopColor(dfcolor);
				break;
			default :
				for(int i=0;i<this.playerHand.size();i++){
					Card c = this.playerHand.get(i);
					String cType = c.getCardType();
					String cColor = c.getCardColor();
					String cAttr = c.getCardDetails();
					//given an option to play a normal turn or a reverse card or
					int nind = checkForValidNormalCard(discardDeck);
					int sind = checkForValidSpecialCard(discardDeck);
					if(nind!=-1 && sind !=-1){
							System.out.println("Choose the Card Type: ");
							String cardT = sc.next(); 
							flag=false;
							if(cardT.equals("Normal")){
								removeCard(discardDeck,nind);
							}
							else{
								removeCard(discardDeck,sind);
							}
						break;
					}
					else if (nind!=-1){
						removeCard(discardDeck,nind);
						flag=false;
						break;
					}
					else{
						removeCard(discardDeck,sind);
						flag=false;
						if(discardDeck.returnTopCard().getCardDetails().equals("DrawFour")||discardDeck.returnTopCard().getCardDetails().equals("Wild")){
							System.out.println("Choose the Color: ");
							String color = sc.next();
							discardDeck.setNewTopColor(color);
						}
						break;
					}
				}
				if(flag){
					pickCard(deck);
				}
			}
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
