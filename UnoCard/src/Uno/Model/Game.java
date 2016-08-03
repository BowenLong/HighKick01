/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uno.Model;

import java.util.List;

public class Game {

    private String id;
    private List<Player> gamePlayers;
    private GameStatus status;
    private Deck gameDeck;
    private Card discardPile;

    public Game(String id, List<Player> players, GameStatus status, Deck deck, Card discardPile) {
        this.id = id;
        this.gamePlayers = players;
        this.status = status;
        this.gameDeck = deck;
        this.discardPile = discardPile;
    }

    public void addPlayer(Player player) {
        this.getGamePlayers().add(player);
    }

    public Card takeCard(Card takeCard) {
        return this.getGameDeck().takecard();
    }

    public void disCard(Card card) {
        this.setDiscardPile(card);
    }

    public Card takeCardFromPile() {
        Card card = this.getDiscardPile();
        this.setDiscardPile(null);
        return card;
    }

    public void changeStatus(GameStatus status) {
        this.setStatus(status);
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the gamePlayers
     */
    public List<Player> getGamePlayers() {
        return gamePlayers;
    }

    /**
     * @param gamePlayers the gamePlayers to set
     */
    public void setGamePlayers(List<Player> gamePlayers) {
        this.gamePlayers = gamePlayers;
    }

    /**
     * @return the status
     */
    public GameStatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(GameStatus status) {
        this.status = status;
    }

    /**
     * @return the gameDeck
     */
    public Deck getGameDeck() {
        return gameDeck;
    }

    /**
     * @param gameDeck the gameDeck to set
     */
    public void setGameDeck(Deck gameDeck) {
        this.gameDeck = gameDeck;
    }

    /**
     * @return the discardPile
     */
    public Card getDiscardPile() {
        return discardPile;
    }

    /**
     * @param discardPile the discardPile to set
     */
    public void setDiscardPile(Card discardPile) {
        this.discardPile = discardPile;
    }
    
    
}
