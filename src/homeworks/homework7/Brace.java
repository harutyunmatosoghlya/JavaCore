package homeworks.homework7;

public class Brace {
    private char brace;
    private int index;

    public Brace(char brace, int index) {
        this.brace = brace;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public char getBrace() {
        return brace;
    }

    public void setBrace(char brace) {
        this.brace = brace;
    }

}