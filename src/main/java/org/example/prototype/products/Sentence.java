package org.example.prototype.products;

import java.util.List;

public interface Sentence {
    List<Word> getWords();
    void setWords(List<Word> words);
    Sentence copy();
}
