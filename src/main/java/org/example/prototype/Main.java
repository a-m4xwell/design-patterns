package org.example.prototype;

import org.example.prototype.products.Sentence;
import org.example.prototype.products.SentenceImpl;
import org.example.prototype.products.SingleWord;
import org.example.prototype.products.Word;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        /*Configuration*/
        Word hello = new SingleWord("Hello");
        Word goodbye = new SingleWord("Goodbye");
        Word world = new SingleWord("world");
        Word exclemation = new SingleWord("!");

        Sentence prototypeGreetingSentence = new SentenceImpl(List.of(hello, world, exclemation));
        List<Sentence> dynamicPrototypes = new ArrayList<>();

        /*Application Logic*/

        Sentence newGreeting = prototypeGreetingSentence.copy();
        print(newGreeting);

        /*Assert words are identical but not the same object*/
        boolean wordsAreIdentical = newGreeting.getWords().get(0).getWord().equals(hello.getWord());
        boolean objectsAreNotTheSame = newGreeting.getWords().get(0) != hello;

        if (wordsAreIdentical && !objectsAreNotTheSame) {
            throw new Exception("Something went wrong");
        }

        /*Create new prototype at runtime*/
        dynamicPrototypes.add(getSentenceFromUser());
        Sentence newDynamicSentence = dynamicPrototypes.get(0).copy();
        print(newDynamicSentence);
    }

    private static Sentence getSentenceFromUser() {
        return new SentenceImpl(List.of(
                new SingleWord("Hello"),
                new SingleWord("All,"),
                new SingleWord("it's"),
                new SingleWord("nice"),
                new SingleWord("to"),
                new SingleWord("meet"),
                new SingleWord("you"),
                new SingleWord("!")
        ));
    }

    private static void print(Sentence sentence) {
        for (Word word : sentence.getWords()) {
            System.out.print(word.getWord() + " ");
        }
        System.out.println();
    }
}
