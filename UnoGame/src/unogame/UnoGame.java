/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unogame;

import Uno.Model.Card;
import Uno.Model.Deck;
import Uno.Model.Game;
import Uno.Model.GameStatus;
import Uno.Model.Player;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bowen
 */
public class UnoGame {
    
    public static Game loadGame() {
        Deck deck = Deck.createNewDeck();
        String id = "ROY1108";
        List<Player> players = new ArrayList<Player>();
        players.add(new Player("Bowen"));
        players.add(new Player("Jerry"));
        players.add(new Player("Monster"));
        players.add(new Player("Color"));
        players.add(new Player("Big"));
        
        return new Game(id, players, GameStatus.Started, deck, deck.takecard());
    }
    
    public static void main(String[] args) {
        Game newGame = loadGame();
        
        for (Player p : newGame.getGamePlayers()) {
            for (int i = 0; i < 7; i++) {
                p.addCard(newGame.getGameDeck().takecard());
            }
        }
        System.out.println("GAME ID: "+newGame.getId());
        System.out.println("DISCARDS: "+newGame.getDiscardPile());
        System.out.println("CARDS ON DECK: "+newGame.getGameDeck().getAmount());
        for(Player p: newGame.getGamePlayers()){
        System.out.println("PLAYER: "+p);
        System.out.println("CARDS IN HAND: ");
        for(Card card: p.getHold()){
        System.out.println("CARD: "+card);
        }
        System.out.println();
        };
        
    }
    
}
