package org.example.bridge;

import java.util.Base64;

public class Base64Encoder implements EncoderImplementor{
    /*This is a concrete implementation of the Implementor*/
    @Override
    public String encodeMessage(String message) {
        byte[] encode = Base64.getEncoder().encode(message.getBytes());
        return new String(encode);
    }

    @Override
    public String decodeMessage(String message) {
        byte[] decode = Base64.getDecoder().decode(message.getBytes());
        return new String(decode);
    }
}
