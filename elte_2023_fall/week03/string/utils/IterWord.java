package elte_2023_fall.week03.string.utils;

public class IterWord {
    private String content;
    private int contentPointer = 0;

    private String[] getContentSplitted() {
        return this.content.split("\\W+");
    }

    public IterWord(String content) {
        if (content.equals(null) || content.equals("")) {
            throw new IllegalArgumentException("Empty content given.");
        }

        this.content = content;
    }

    public void printNext() {
        String[] contentSplitted = this.getContentSplitted();
        if (this.contentPointer >= contentSplitted.length) {
            System.out.println();
        }
        System.out.println(contentSplitted[this.contentPointer]);
        this.contentPointer++;
    }

    public void restart() {
        this.contentPointer = 0;
    }

    public boolean hasNext() {
        return this.contentPointer < this.getContentSplitted().length;
    }
}
