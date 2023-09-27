package elte_2023_fall.week03.string.utils;

public class IterLetter {

    private String content;
    private int contentPointer = 0;

    public IterLetter(String content) {
        if (content.equals("") || content.equals(null)) {
            throw new IllegalArgumentException("Empty string is given as argument to constructor.");
        }
        this.content = content;
    }

    public void reset() {
        this.contentPointer = 0;
    }

    public void printNext() {
        if (this.contentPointer >= this.content.length()) {
            System.out.println();
        }

        System.out.println(this.content.charAt(this.contentPointer));
        this.contentPointer++;
    }

    public boolean hasNext() {
        return this.contentPointer < this.content.length();
    }

}
