# UNO
## About UNO! 
UNO! is a multi-player card game based on strategic disposal of cards. It consists of two kinds of cards, namely, Normal Cards and Special Cards. The Normal Cards are divided into four colours, Red, Yellow, Green and Blue, and each colour consists of cards numbered from 0 to 9. The Special Cards consist of 3 Cards belonging to each colour, namely, Skip, Reverse and Draw 2 (or +2). There are also two cards, Draw 4 (or +4) and Wild, not belonging to any particular colour. 

## Rules 
1. Four players are needed to start the game. 
2. Each player begins with 7 Cards. 
3. Two decks are available to the players, the Draw deck and the Discard deck .
4. Players are allowed to discard a card from their hand to the Discard Deck if, 
    They have a card of the same colour as the topmost card,
  
    They have a card with the same number as the topmost card,
  
    They have a Draw 4 or a Wild Card 
  
5. In the case of the top card being a Special Card, 

    If the top card is a Reverse, then game direction reverses and the next player can discard any card of the same color or a wild card.
  
    If the top card is a Skip, then either the player can discard if they have a Skip, or, the turn moves to the next player 
  
    If the top card is a Draw Two, then either the player can discard if they have a Draw Two, Draw Four, a Reverse or a Skip, or, they must draw (pick) two cards 
  
    If the top card is a Draw Four, then they must draw (pick) four cards 
  
 6. The game ends when a player does not have any card left 
 
 ## Classes 
 1. NormalCard and SpecialCard
 2. DiscardPile and DrawPile
 3. Player
 4. DeckInitializer
 5. MainGame
 
 ## NormalCard
  1. String cardColor
	2. String cardNumber
	3. String cardType = "Normal"
  4. NormalCard(String color, String number) initialize the attributes
  5. void displayCard() displaying the card info
  6. Getter and Setter Functions
  
## SpecialCard
  1. String cardColor
	2. String cardAttribute
	3. String cardType = "Special"
  4. SpecialCard(String color, String attribute) initialize the attributes
  5. void displayCard() displaying the card info
  6. Getter and Setter Functions
  
## DiscardPile
  1. Stack<Card> discardDeck
	2. String topColor
  3. DiscardPile()
  4. DiscardPile(Card c) initialize card c as the topcard of discardPile
  5. Card returnTopCard() return the top card
  6. void removeTopCard() remove the top card
  7. void addCardToPile(Card c) add card c to discardPile
  8. void displayTopCard() display the top card
  9. Getter and Setter for topColor
  
## DrawPile
  1. Stack<Card> cardsPile = new Stack<Card>()
  2. DrawPile(ArrayList<Card> cards)
  3. Card returnTopCard() returns the top card
  4. void addCard(Card c) add card c to drawPile
  
## DeckInitializer
  1. DiscardPile discardPile
	2. DrawPile drawPile
  3. ArrayList<NormalCard> createNormalCards() creates normal cards
  4. ArrayList<SpecialCard> createSpecialCards() creates special card
  5. DrawPile createDrawPile(ArrayList<SpecialCard> specialCards, ArrayList<NormalCard> normalCards) creates the drawPile with shuffles cards
  6. DeckInitializer() Initializes the Deck
  7. Getter Functions
  
## Player
  1. String playerName
	2. ArrayList<Card> playerHand = new ArrayList<Card>()
	3. int playerNumber
  4. DrawPile drawPile
	5. DiscardPile discardPile
  6. Player(String name, int playerNumber, DiscardPile discardPile, DrawPile deck) Initializes playerHand
  7. int numCardsLeft() shows number of cards left in playerHand
  8. void displayPlayerInfo() displays player name and cards left
  9. void pickCard(DrawPile deck) picks a card from drawPile
  10. void removeCard(DiscardPile discardDeck, int pos) remove the card at position pos from playerHand to discardPile
  11. void showPlayerHand() shows cards in playerHand
  12. int checkForValidNormalCard(DiscardPile discardDeck) checks for Normal cards valid to play for the turn 
  13. int checkForValidSpecialCard(DiscardPile discardDeck) checks for Special cards valid to play for the turn
  
## MainGame
  1. DeckInitializer deckInitializer = new DeckInitializer()
  
  2. final DrawPile drawPile = deckInitializer.getDrawPile()
  3. final DiscardPile discardPile = deckInitializer.getDiscardPile()
  
  4. Game game
  5. ChooseColor cwindow
  6. int gamedir = 1
  7. ArrayList<Player> players = new ArrayList<>()
  8. Player currentPlayer
  9. int startingPlayerNumber = 0
  10. currentPlayerNumber = startingPlayerNumber
  11. StartMenu menu=new StartMenu(players,drawPile,discardPile)
  
## GUI 
  1. StartMenu - Menu for Play and Exit
  2. InitializePlayers - Enter Player name ( Exactly 4 players needed to commence the game)
  3. Game - Top card of the discardPile, Player turn, name and hand visible with Draw Card button. Conditons are applied for drawing multiple cards
  4. CardPopup - Use the selected card in the Game window. Condition are applied for selecting apt cards
  5. ChooseColor - For "Wild" color change
 
## Logic
  1. Deck in Initialized and a card is drawn to set as the top card of the DiscardPile. Condition applied for the card to be a Normal card
  2. StartMenu is made visible to start the game. 
  3. Player press the Play button to go to InitializePlayers window.
  4. MainGame sleep for 10 sec for the players to press the Play button
  5. Names of the players are entered. Exactly four players are needed to start the game. Popup messages are displayed if there are less/more than four players.
  6. MainGame sleeps for 1 sec in a while loop checking whether the InitializePlayer window is visible or not, resuming after disposing the InitializePlayer window (Pressing the Start button)
  7. While loop deployed with true condition
  8. Current player is initialized
  9. Game window is set visible
  10. MainGame sleeps for 1 sec in a while loop checking whether the Game window is visible or not, resuming after disposing the Game window (Pressing the Draw or Use button in CardPopup Window)
  11. Conditions for Player turns and game direction
  12. ChooseColor window for "Wild" Cards color change
  13. Winner declared if current player has zero cards left (Conditions for UNO and Win in CardPopup class)

## Running the Game
  1. Clone the project and import as a Netbeans project
  2. Run the MainGame.java File 
