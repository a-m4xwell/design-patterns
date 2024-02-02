package org.example.bridge;

public class Main {
    public static void main(String[] args) {
        /*
        * The Bridge pattern is used to separate an interface from its implementation so that both can very
        * independently
        *
        * In this scenario the bridge is represented by a framework which is designed to take a string and encode it
        * The bridge is made up of 2 classes that form the parents of 2 seporate hierarchies. The first is an abstract
        * class called encoder which will define the high level operations, encode and decode, it will also be composed
        * of an interface EncoderImplementor which will define lower level operations*/

        /*Setup*/

        Base64Encoder base64Encoder = new Base64Encoder();
        Encoder encoder = new Encoder(base64Encoder);

        /*Runing the bridge*/
        String message = "Hello World!";
        encodeDecodeMessage(encoder, message);

        /*Swapping the implementation*/
        encoder.setEncoderImplementor(new CeasarEncoder());
        encodeDecodeMessage(encoder, "abcz");

    }

    private static void encodeDecodeMessage(Encoder encoder, String message) {
        String encodedMessage = encoder.encode(message);
        System.out.printf("Message: %s\nEncoded message: %s\n", message, encodedMessage);

        String decodedMessage = encoder.decode(encodedMessage);
        System.out.printf("Original Message: %s\nDecoded message: %s\n", message, decodedMessage);
    }
}
