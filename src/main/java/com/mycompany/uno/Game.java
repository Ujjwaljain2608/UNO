/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.uno;

import Card.Card;
import Pile.*;
import java.util.*;
import javax.swing.*;
import Player.Player;
import java.awt.Font;


public class Game extends javax.swing.JFrame {
    ArrayList<JButton> cardButtons = new ArrayList<>();
    CardPopup window;
    Player player;
    DiscardPile discardPile;
    DrawPile drawPile;
    Card topcard;
    int drawind;
    
    /**
     * Creates new form Game
     */
    public Game() {
        initComponents();
        AddButtons();
        SetButtonImages();
        deck.setIcon(new ImageIcon("/Users/ujjwaljain/Desktop/sprites/card_back_alt.png"));
    }
    
    public Game(Player player,DiscardPile discardPile,DrawPile drawPile){
        initComponents();
        this.player = player;
        this.discardPile=discardPile;
        this.drawPile=drawPile;
        drawind=0;
        topcard = discardPile.returnTopCard();
        color.setText("Top Card Color: "+topcard.getCardColor());
        playerTurn.setText("Current Player: "+player.getPlayerTurn());
//        for (int i=0;i<players.get(0).numCardsLeft();i++){
//            System.out.println(players.get(0).playerHand.get(i).getCardColor()+"_"+players.get(0).playerHand.get(i).getCardDetails());
//        }
        AddButtons();
        SetButtonImages();
        deck.setIcon(new ImageIcon("/Users/ujjwaljain/Desktop/sprites/card_back_alt.png"));
        discardtop.setIcon(new ImageIcon("/Users/ujjwaljain/Desktop/sprites/"+topcard.getCardColor()+"_"+topcard.getCardDetails()+".png"));
        pname.setText(player.getPlayerName()+"'s Cards");
        
    }
    public void AddButtons(){
        cardButtons.add(card1);
        cardButtons.add(card2);
        cardButtons.add(card3);
        cardButtons.add(card4);
        cardButtons.add(card5);
        cardButtons.add(card6);
        cardButtons.add(card7);
        cardButtons.add(card8);
        cardButtons.add(card9);
        cardButtons.add(card10);
        cardButtons.add(card11);
        cardButtons.add(card12);
        cardButtons.add(card13);
        cardButtons.add(card14);
        cardButtons.add(card15);
        cardButtons.add(card16);
    }
    
    public void SetPname(){
//        pname.setText(currentplayer.name+"'s Cards ");
    }
    public void SetButtonImages(){
        for (int i=0;i<player.numCardsLeft();i++){
//            cardButtons.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Images/PNGs/small/blue_0.png")));
            cardButtons.get(i).setIcon(new javax.swing.ImageIcon("/Users/ujjwaljain/Desktop/sprites/"+player.playerHand.get(i).getCardColor()+"_"+player.playerHand.get(i).getCardDetails()+".png"));
        }
        for (int i=player.numCardsLeft();i<16;i++){
            cardButtons.get(i).setIcon(new ImageIcon("/Users/ujjwaljain/Desktop/sprites/card_back_alt.png"));

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        card2 = new javax.swing.JButton();
        card1 = new javax.swing.JButton();
        card3 = new javax.swing.JButton();
        card4 = new javax.swing.JButton();
        card5 = new javax.swing.JButton();
        card6 = new javax.swing.JButton();
        card7 = new javax.swing.JButton();
        card8 = new javax.swing.JButton();
        deck = new javax.swing.JButton();
        discardtop = new javax.swing.JButton();
        drawCard = new javax.swing.JButton();
        pname = new javax.swing.JLabel();
        card9 = new javax.swing.JButton();
        card10 = new javax.swing.JButton();
        card11 = new javax.swing.JButton();
        card12 = new javax.swing.JButton();
        card13 = new javax.swing.JButton();
        card14 = new javax.swing.JButton();
        card15 = new javax.swing.JButton();
        card16 = new javax.swing.JButton();
        color = new javax.swing.JLabel();
        playerTurn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setSize(new java.awt.Dimension(1280, 720));

        card2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card2ActionPerformed(evt);
            }
        });

        card1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card1ActionPerformed(evt);
            }
        });

        card3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card3ActionPerformed(evt);
            }
        });

        card4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card4ActionPerformed(evt);
            }
        });

        card5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card5ActionPerformed(evt);
            }
        });

        card6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card6ActionPerformed(evt);
            }
        });

        card7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card7ActionPerformed(evt);
            }
        });

        card8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card8ActionPerformed(evt);
            }
        });

        discardtop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discardtopActionPerformed(evt);
            }
        });

        drawCard.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        drawCard.setText("Draw Card");
        drawCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawCardActionPerformed(evt);
            }
        });

        pname.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N

        card9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card9ActionPerformed(evt);
            }
        });

        card10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card10ActionPerformed(evt);
            }
        });

        card11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card11ActionPerformed(evt);
            }
        });

        card12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card12ActionPerformed(evt);
            }
        });

        card13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card13ActionPerformed(evt);
            }
        });

        card14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card14ActionPerformed(evt);
            }
        });

        card15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card15ActionPerformed(evt);
            }
        });

        card16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card16ActionPerformed(evt);
            }
        });

        color.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N

        playerTurn.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(playerTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(drawCard, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(deck, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(card9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(discardtop, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(card10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(card5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(card6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(card7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(card8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(card11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(card12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(card13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(card14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(card15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(card16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGap(0, 59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deck, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(discardtop, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drawCard, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(playerTurn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(card9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(card13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(card14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(card15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(card16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(card11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void card16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card16ActionPerformed
        // TODO add your handling code here:
        if(player.numCardsLeft()>14){
            window = new CardPopup(player,this,player.playerHand.get(15).getCardColor(),player.playerHand.get(15).getCardDetails(),discardPile,15);
            window.setBounds(250,40,600,600);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);}
    }//GEN-LAST:event_card16ActionPerformed

    private void card15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card15ActionPerformed
        // TODO add your handling code here:
        if(player.numCardsLeft()>13){
            window = new CardPopup(player,this,player.playerHand.get(14).getCardColor(),player.playerHand.get(14).getCardDetails(),discardPile,14);
            window.setBounds(250,40,600,600);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);}
    }//GEN-LAST:event_card15ActionPerformed

    private void card14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card14ActionPerformed
        // TODO add your handling code here:
        if(player.numCardsLeft()>12){
            window = new CardPopup(player,this,player.playerHand.get(13).getCardColor(),player.playerHand.get(13).getCardDetails(),discardPile,13);
            window.setBounds(250,40,600,600);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);}
    }//GEN-LAST:event_card14ActionPerformed

    private void card13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card13ActionPerformed
        // TODO add your handling code here:
        if(player.numCardsLeft()>11){
            window = new CardPopup(player,this,player.playerHand.get(12).getCardColor(),player.playerHand.get(12).getCardDetails(),discardPile,12);
            window.setBounds(250,40,600,600);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);}
    }//GEN-LAST:event_card13ActionPerformed

    private void card12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card12ActionPerformed
        // TODO add your handling code here:
        if(player.numCardsLeft()>10){
            window = new CardPopup(player,this,player.playerHand.get(11).getCardColor(),player.playerHand.get(11).getCardDetails(),discardPile,11);
            window.setBounds(250,40,600,600);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);}
    }//GEN-LAST:event_card12ActionPerformed

    private void card11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card11ActionPerformed
        // TODO add your handling code here:
        if(player.numCardsLeft()>9){
            window = new CardPopup(player,this,player.playerHand.get(10).getCardColor(),player.playerHand.get(10).getCardDetails(),discardPile,10);
            window.setBounds(250,40,600,600);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);}
    }//GEN-LAST:event_card11ActionPerformed

    private void card10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card10ActionPerformed
        // TODO add your handling code here:
        if(player.numCardsLeft()>8){
            window = new CardPopup(player,this,player.playerHand.get(9).getCardColor(),player.playerHand.get(9).getCardDetails(),discardPile,9);
            window.setBounds(250,40,600,600);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);}
    }//GEN-LAST:event_card10ActionPerformed

    private void card9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card9ActionPerformed
        // TODO add your handling code here:
        if(player.numCardsLeft()>7){
            window = new CardPopup(player,this,player.playerHand.get(8).getCardColor(),player.playerHand.get(8).getCardDetails(),discardPile,8);
            window.setBounds(250,40,600,600);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);}
    }//GEN-LAST:event_card9ActionPerformed

    private void drawCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawCardActionPerformed
        //current player draw card
        Card topcard = discardPile.returnTopCard();
        String color = topcard.getCardColor();
        if(topcard.getCardDetails().equals("drawfour")){
            
            if(drawind<4){
                player.pickCard(drawPile);
                this.SetButtonImages();
                drawind++;
                if(drawind==4){
                while(discardPile.returnTopCard().getCardType().equals("Special")){
                    discardPile.removeTopCard();
                            }
                discardPile.setNewTopColor(color);
                this.dispose();}
            }
        }
        else if((player.checkForValidNormalCard(discardPile)!=-1 || player.checkForValidSpecialCard(discardPile)!=-1)&&drawind==0){
            JLabel message = new JLabel("Valid Card Available!!!");
            message.setFont(new Font("Arial",Font.BOLD,36));
            JOptionPane.showMessageDialog(null, message);
        }
        else if(topcard.getCardDetails().equals("drawtwo")){
            
            if(drawind<2){
                player.pickCard(drawPile);
                this.SetButtonImages();
                drawind++;
                if(drawind==2){
                while(discardPile.returnTopCard().getCardType().equals("Special")){
                    discardPile.removeTopCard();
                            }
                discardPile.setNewTopColor(color);
                this.dispose();
            }
        }
        }
        else {
            player.pickCard(drawPile);
            String cardcolor = topcard.getCardColor();
            while(discardPile.returnTopCard().getCardType().equals("Special")){
                    discardPile.removeTopCard();
                            }
            discardPile.setNewTopColor(cardcolor);
            this.SetButtonImages();
            this.dispose();
        }
    }//GEN-LAST:event_drawCardActionPerformed

    private void discardtopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discardtopActionPerformed
        //display discard top card
    }//GEN-LAST:event_discardtopActionPerformed

    private void card8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card8ActionPerformed
        // TODO add your handling code here:
        if(player.numCardsLeft()>6){
            window = new CardPopup(player,this,player.playerHand.get(7).getCardColor(),player.playerHand.get(7).getCardDetails(),discardPile,7);
            window.setBounds(250,40,600,600);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);}
    }//GEN-LAST:event_card8ActionPerformed

    private void card7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card7ActionPerformed
        if(player.numCardsLeft()>5){
            window = new CardPopup(player,this,player.playerHand.get(6).getCardColor(),player.playerHand.get(6).getCardDetails(),discardPile,6);
            window.setBounds(250,40,600,600);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);}
    }//GEN-LAST:event_card7ActionPerformed

    private void card6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card6ActionPerformed
        if(player.numCardsLeft()>4){
            window = new CardPopup(player,this,player.playerHand.get(5).getCardColor(),player.playerHand.get(5).getCardDetails(),discardPile,5);
            window.setBounds(250,40,600,600);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  }
    }//GEN-LAST:event_card6ActionPerformed

    private void card5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card5ActionPerformed
        if(player.numCardsLeft()>3){
            window = new CardPopup(player,this,player.playerHand.get(4).getCardColor(),player.playerHand.get(4).getCardDetails(),discardPile,4);
            window.setBounds(250,40,600,600);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);}
    }//GEN-LAST:event_card5ActionPerformed

    private void card4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card4ActionPerformed
        if(player.numCardsLeft()>2){
            window = new CardPopup(player,this,player.playerHand.get(3).getCardColor(),player.playerHand.get(3).getCardDetails(),discardPile,3);
            window.setBounds(250,40,600,600);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);}
    }//GEN-LAST:event_card4ActionPerformed

    private void card3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card3ActionPerformed
        if(player.numCardsLeft()>1){
            window = new CardPopup(player,this,player.playerHand.get(2).getCardColor(),player.playerHand.get(2).getCardDetails(),discardPile,2);
            window.setBounds(250,40,600,600);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); }
    }//GEN-LAST:event_card3ActionPerformed

    private void card1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card1ActionPerformed
        if(player.numCardsLeft()>=0){
            window = new CardPopup(player,this,player.playerHand.get(0).getCardColor(),player.playerHand.get(0).getCardDetails(),discardPile,0);
            window.setBounds(250,40,600,600);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);}
    }//GEN-LAST:event_card1ActionPerformed

    private void card2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card2ActionPerformed
        if(player.numCardsLeft()>0){
            window = new CardPopup(player,this,player.playerHand.get(1).getCardColor(),player.playerHand.get(1).getCardDetails(),discardPile,1);
            window.setBounds(250,40,600,600);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);}
    }//GEN-LAST:event_card2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton card1;
    private javax.swing.JButton card10;
    private javax.swing.JButton card11;
    private javax.swing.JButton card12;
    private javax.swing.JButton card13;
    private javax.swing.JButton card14;
    private javax.swing.JButton card15;
    private javax.swing.JButton card16;
    private javax.swing.JButton card2;
    private javax.swing.JButton card3;
    private javax.swing.JButton card4;
    private javax.swing.JButton card5;
    private javax.swing.JButton card6;
    private javax.swing.JButton card7;
    private javax.swing.JButton card8;
    private javax.swing.JButton card9;
    private javax.swing.JLabel color;
    private javax.swing.JButton deck;
    private javax.swing.JButton discardtop;
    private javax.swing.JButton drawCard;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel playerTurn;
    private javax.swing.JLabel pname;
    // End of variables declaration//GEN-END:variables
}
