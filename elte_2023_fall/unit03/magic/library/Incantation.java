package elte_2023_fall.unit03.magic.library;

public class Incantation {
    private String text;
    private int index;

    public Incantation(String text, int index) {
        if (text.equals("") || text.equals(null)) {
            throw new IllegalArgumentException();
        }
        this.text = text;
        this.index = index;
    }

    public Incantation(Incantation otherInc) {
        this(otherInc.text, otherInc.index);
    }

    public String getText() {
        return this.text;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean enchant(Incantation otherInc, boolean isPrepend) {

        String[] textSplitted = this.text.split("\\W+");
        if (this.index - 1 < 0 || this.index - 1 >= textSplitted.length) {
            return false;
        }

        if (isPrepend) {
            otherInc.text = String.format("%s %s", textSplitted[this.index - 1], otherInc.text);
            otherInc.setIndex(otherInc.getIndex() + 1);
            return true;
        }

        otherInc.text = String.format("%s %s", otherInc.text, textSplitted[this.index - 1]);
        otherInc.setIndex(otherInc.getIndex() - 1);
        return true;
    }

}
