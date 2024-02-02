package org.example.bridge;

import java.util.List;

public class CeasarEncoder implements EncoderImplementor {
    /*This is a simple encoding and decoding algorithm based on the caesar cypher
    * It is crude and can only encode lowercase letters, but it is for example purposes only*/
    private final char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    @Override
    public String encodeMessage(String message) {
        char[] encodedMessage = new char[message.length()];
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            int index = getIndexOfLetter(c);
            if(index >= alphabet.length - 1){
                encodedMessage[i] = alphabet[0];
            }else {
                encodedMessage[i] = alphabet[index + 1];
            }
        }
        return new String(encodedMessage);
    }

    private int getIndexOfLetter(char c) {
        for(int i = 0; i < alphabet.length; i++){
            if(c == alphabet[i]){
                return i;
            }
        }
        //todo this is a temp solution, implmement a better way of handling a character that is not supported
        return 100;
    }

    @Override
    public String decodeMessage(String message) {
        char[] decodedMessage = new char[message.length()];
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            int index = getIndexOfLetter(c);
            if(index <= 0){
                decodedMessage[i] = alphabet[alphabet.length - 1];
            }else {
                decodedMessage[i] = alphabet[index - 1];
            }
        }
        return new String(decodedMessage);
    }
}
