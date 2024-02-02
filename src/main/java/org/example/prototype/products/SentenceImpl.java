package org.example.prototype.products;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class SentenceImpl implements Sentence{
    private List<Word> words;
    @Override
    public List<Word> getWords() {
        return words;
    }

    @Override
    public void setWords(List<Word> words) {
        this.words = words;
    }

    @Override
    public Sentence copy() {
        return new SentenceImpl(words.stream().map(Word::copy).toList());
    }
}
