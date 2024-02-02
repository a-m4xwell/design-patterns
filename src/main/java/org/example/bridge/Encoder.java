package org.example.bridge;

public class Encoder {
    /*This class is the abstraction*/
    private EncoderImplementor encoderImplementor;

    public Encoder(EncoderImplementor encoderImplementor){
        this.encoderImplementor = encoderImplementor;
    }

    public String encode(String message){
        return encoderImplementor.encodeMessage(message);
    }

    public String decode(String encodedMessage){
        return encoderImplementor.decodeMessage(encodedMessage);
    }

    public void setEncoderImplementor(EncoderImplementor encoderImplementor){
        this.encoderImplementor = encoderImplementor;
    }
}
