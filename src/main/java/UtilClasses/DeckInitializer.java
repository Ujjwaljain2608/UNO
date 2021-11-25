/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UtilClasses;

/**
 *
 * @author ujjwaljain
 */
import Pile.*;
import Card.*;
import java.util.ArrayList;
import java.util.Collections;

public class DeckInitializer {
	
	public DiscardPile discardPile;
	private DrawPile drawPile;
	
	public ArrayList<NormalCard> createNormalCards() {
		ArrayList<NormalCard> normalCards = new ArrayList<NormalCard>();
		
		String[] colors = {"yellow", "red", "blue", "green"};
		String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
		
		for(String color: colors) {
			for(String number: numbers) {
				NormalCard normalCard = new NormalCard(color, number);
				normalCards.add(normalCard);
			}
		}
		
		return normalCards;
	}
	
	public ArrayList<SpecialCard> createSpecialCards() {
		ArrayList<SpecialCard> specialCards = new ArrayList<SpecialCard>();
		
		for(int i=0; i<4; i++) {
			SpecialCard draw4 = new SpecialCard("wild", "drawfour");
			specialCards.add(draw4);
		}
		
		for(int i=0; i<4; i++) {
			SpecialCard wild = new SpecialCard("wild", "color");
			specialCards.add(wild);
		}
		
		String[] colors = {"yellow", "red", "blue", "green"};
		String[] attributes = {"reverse", "skip", "drawtwo"};
		
		for(String color: colors) {
			for(String attr: attributes) {
				SpecialCard specialCard = new SpecialCard(color, attr);
				specialCards.add(specialCard);
			}
		}
		
		return specialCards;
	}
	
	public DrawPile createDrawPile(ArrayList<SpecialCard> specialCards, ArrayList<NormalCard> normalCards) {
		ArrayList<Card> cardsDeck = new ArrayList<Card>();
		
		for(NormalCard nc: normalCards) {
			cardsDeck.add(nc);
		}
		
		for(SpecialCard sc: specialCards) {
			cardsDeck.add(sc);
		}
		
		Collections.shuffle(cardsDeck);
		
		DrawPile drawPile = new DrawPile(cardsDeck);
		
		return drawPile;
	}
	
	public DeckInitializer() {
		this.drawPile = this.createDrawPile(this.createSpecialCards(), this.createNormalCards());
		this.discardPile = new DiscardPile();
	}
	
	public DrawPile getDrawPile() {
		return this.drawPile;
	}
	
	public DiscardPile getDiscardPile() {
		return this.discardPile;
	}
}
