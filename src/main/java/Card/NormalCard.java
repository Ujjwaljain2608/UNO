/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Card;

/**
 *
 * @author ujjwaljain
 */

public class NormalCard extends Card {
	private String cardColor;
	private String cardNumber;
	private String cardType = "Normal";
	
	public NormalCard(String color, String number) {
		this.cardColor = color;
		this.cardNumber = number;
	}
	
	public void displayCard() {
		System.out.println("Card color: " + this.cardColor);
		System.out.println("Card number: " + this.cardNumber);
	}
	
	public String getCardColor() {
		return this.cardColor;
	}
	
	public String getCardDetails() {
		return this.cardNumber;
	}
	
	public String getCardType() {
		return this.cardType;
	}
}
