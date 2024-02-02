package org.example.prototype.products;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SingleWord implements Word {
    private String word;

    @Override
    public String getWord() {
        return word;
    }

    @Override
    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public Word copy(){
        return new SingleWord(word);
    }
}
