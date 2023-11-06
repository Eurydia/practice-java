package elte_2023_fall.unit03.magic.library;

public class Incantation {
    public String text;
    private int index;

    public Incantation(String text, int index) {
        if (text.equals("") || text.equals(null)) {
            throw new IllegalArgumentException();
        }
        this.text = text;
        this.index = index;
    }

    public Incantation(Incantation otherInc) {
        this.text = otherInc.text;
        this.index = otherInc.index;
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
        if (this.index < 0 || this.index >= textSplitted.length) {
            return false;
        }

        if (isPrepend) {
            otherInc.text = String.format("%s %s", textSplitted[this.index], otherInc.text);
            otherInc.setIndex(otherInc.getIndex() + 1);
        } else {
            otherInc.text = String.format("%s %s", otherInc.text, textSplitted[this.index]);
            otherInc.setIndex(otherInc.getIndex() - 1);
        }

        return true;
    }

}
