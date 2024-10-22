package flashcards;

import java.util.ArrayList;
import java.util.HashSet;

public class FlashcardModel {
    private HashSet<Integer> correctAnswers;
    private ArrayList<Card> cards;
    private int currentCard;
    private int cardCount;
    public FlashcardModel(ArrayList<Card> cards) {
        if (cards.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.correctAnswers = new HashSet<Integer>();
        this.cards = new ArrayList<Card>();
        this.cards.addAll(cards);
        this.currentCard = 0;
        this.cardCount = this.cards.size();
    }

    public void addToCorrect(int index) {
        this.correctAnswers.add(index);
    }

    public int getCurrentCardNumber() {
        return this.currentCard;
    }

    public int getCardCount(){
        return this.cardCount;
    }

    public int getCorrectAnswerCount() {
        return this.correctAnswers.size();
    }

    public void nextCard() {

        do  {
            this.currentCard += 1;
            this.currentCard %= this.cardCount;
        }while (this.correctAnswers.contains(this.currentCard));
    }

    public boolean hasNext(){
        return this.correctAnswers.size() < this.cardCount;
    }

    public void reset() {
        this.currentCard = 0;
        this.correctAnswers.clear();
    }

    public Card current() {
        return this.cards.get(this.currentCard);
    }
}
