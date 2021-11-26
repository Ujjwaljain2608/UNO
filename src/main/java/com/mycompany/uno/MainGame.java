package com.mycompany.uno;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import Player.Player;
import Pile.*;
import Card.*;
import UtilClasses.DeckInitializer;
import static java.lang.Thread.*;
import java.util.ArrayList;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainGame {


	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws NoSuchElementException {
		System.out.println("***** Welcome to UNO! *****");
		
		DeckInitializer deckInitializer = new DeckInitializer();
		final DrawPile drawPile = deckInitializer.getDrawPile();
		final DiscardPile discardPile = deckInitializer.getDiscardPile();
                Game game;
                ChooseColor cwindow;
                int gamedir = 1;
                discardPile.addCardToPile(drawPile.returnTopCard());
                while(discardPile.returnTopCard().getCardType().equals("Special")){
                   discardPile.addCardToPile(drawPile.returnTopCard());
                }
		
		Scanner sc = new Scanner(System.in);
                ArrayList<Player> players = new ArrayList<>();

		
		Player currentPlayer;
                int startingPlayerNumber = 0, currentPlayerNumber = startingPlayerNumber;
		StartMenu menu=new StartMenu(players,drawPile,discardPile);
                menu.setTitle("Main Menu");
                menu.setVisible(true);
                try {
                    sleep(10000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MainGame.class.getName()).log(Level.SEVERE, null, ex);
                }
                while(menu.getinitplay().isVisible()){
                    try { 
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MainGame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                while(true) {		
                
		currentPlayer = players.get(currentPlayerNumber);
                game = new Game(currentPlayer,discardPile,drawPile);
                game.setVisible(true);
                while(game.isVisible()){
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MainGame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                Card topCard = discardPile.returnTopCard();
                if(topCard.getCardType().equals("Normal")||topCard.getCardDetails().equals("skip")||topCard.getCardDetails().equals("drawtwo")){
                    currentPlayerNumber=(currentPlayerNumber+gamedir+4)%4;
                    continue;
                }
                else if (topCard.getCardDetails().equals("reverse")){
                    gamedir*=-1;
                    currentPlayerNumber=(currentPlayerNumber+gamedir+4)%4;
                    continue;
                }
                else if (topCard.getCardColor().equals("wild")){
                    cwindow = new ChooseColor(discardPile);
                    cwindow.setVisible(true);
                    while(cwindow.isVisible()){
                        try {
                            sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(MainGame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                    }
                    currentPlayerNumber=(currentPlayerNumber+gamedir+4)%4;
                    continue;
                } 
            }
	}
}
