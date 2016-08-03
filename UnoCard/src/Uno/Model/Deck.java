/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uno.Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {

    private int amount;
    private List<Card> deck;

    public Deck(int amount, List<Card> deck) {
        this.setAmount(amount);
        this.setDeck(deck);
    }

    public static Deck createNewDeck() {
        Color colorArray[] = {Color.RED, Color.YELLOW, Color.GREEN, Color.BLUE};

        String imageArray[][] = {
            {Image.RED_0, Image.RED_1, Image.RED_2, Image.RED_3, Image.RED_4, Image.RED_5, Image.RED_6, Image.RED_7, Image.RED_8, Image.RED_9, Image.RED_DRAWTWO, Image.RED_REVERSE, Image.RED_SKIP},
            {Image.YELLOW_0, Image.YELLOW_1, Image.YELLOW_2, Image.YELLOW_3, Image.YELLOW_4, Image.YELLOW_5, Image.YELLOW_6, Image.YELLOW_7, Image.YELLOW_8, Image.YELLOW_9, Image.YELLOW_DRAWTWO, Image.YELLOW_REVERSE, Image.YELLOW_SKIP},
            {Image.GREEN_0, Image.GREEN_1, Image.GREEN_2, Image.GREEN_3, Image.GREEN_4, Image.GREEN_5, Image.GREEN_6, Image.GREEN_7, Image.GREEN_8, Image.GREEN_9, Image.GREEN_DRAWTWO, Image.GREEN_REVERSE, Image.GREEN_SKIP},
            {Image.BLUE_0, Image.BLUE_1, Image.BLUE_2, Image.BLUE_3, Image.BLUE_4, Image.BLUE_5, Image.BLUE_6, Image.BLUE_7, Image.BLUE_8, Image.BLUE_9, Image.BLUE_DRAWTWO, Image.BLUE_REVERSE, Image.BLUE_SKIP},};
        Type typeArray[] = {Type.NORMAL, Type.SKIP, Type.REVERSE, Type.DRAW_2};

        List<Card> carddeck = new ArrayList<>();
        Card card1;
        Card card2;

        for (int i = 0; i < 4; i++) {
            //four color
            for (int j = 0; j < 13; j++) {
                if (j <= 9) {
                    if (j == 0) {
                        //normal 0
                        card1 = new Card(colorArray[i], typeArray[0], j, imageArray[i][j]);
                        carddeck.add(card1);
                    } else {
                        for (int x = 0; x < 2; x++) {
                            //normal 1-9 double
                            card1 = new Card(colorArray[i], typeArray[0], j, imageArray[i][j]);
                            carddeck.add(card1);
                        }
                    }
                } else {
                    //skip
                    for (int y = 0; y < 2; y++) {
                        card1 = new Card(colorArray[i], typeArray[j % 9], 20, imageArray[i][j]);
                        carddeck.add(card1);

                    }
                }
            }
            card1 = new Card(Color.BLACK, Type.WILD, 50, Image.BLACK_WILDCARD);
            card2 = new Card(Color.BLACK, Type.DRAW_4, 50, Image.BLACK_DRAWFOUR);
            carddeck.add(card1);
            carddeck.add(card2);
        }
        Collections.shuffle(carddeck);
        Deck deck = new Deck(108, carddeck);
        System.out.println("Finished Loading.");
        return deck;
    }

    public Card takecard() {
        if (this.getDeck().isEmpty()) {
            return null;
        }
        this.setAmount(this.getAmount() - 1);
        return this.getDeck().remove(0);
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * @return the deck
     */
    public List<Card> getDeck() {
        return deck;
    }

    /**
     * @param deck the deck to set
     */
    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }
    
}
