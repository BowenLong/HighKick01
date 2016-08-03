/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uno.Model;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private List<Card> hold;

    public Player(String name, List<Card> hold) {
        this.name = name;
        this.hold = hold;
    }

    public Player(String name) {
        this.name = name;
        this.hold = new ArrayList<Card>();
    }

    public void addCard(Card addCard) {
        this.getHold().add(addCard);
    }
    
    public Card removeHoldCard(){
    if( this.getHold().isEmpty()){
    return null;
    }
    return this.getHold().remove(0);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the hold
     */
    public List<Card> getHold() {
        return hold;
    }

    /**
     * @param hold the hold to set
     */
    public void setHold(List<Card> hold) {
        this.hold = hold;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + '}';
    }
    
    
}
