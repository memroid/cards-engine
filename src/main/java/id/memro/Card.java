package id.memro;

public class Card {
    String sourceWord;
    String targetWord;

    public Card(String sourceWord, String targetWord) {
        this.sourceWord = sourceWord;
        this.targetWord = targetWord;
    }

    public String getTargetWord() {
        return targetWord;
    }

    public String getSourceWord() {
        return sourceWord;
    }
}
