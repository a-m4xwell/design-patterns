package org.example.bridge;

import org.junit.jupiter.api.Test;

class CeasarEncoderTest {

    @Test
    public void test(){
        CeasarEncoder ceasarEncoder = new CeasarEncoder();

        String s = ceasarEncoder.encodeMessage("ahelloworldz");
        System.out.println(s);
        String result = ceasarEncoder.decodeMessage(s);
        System.out.println(result);
    }

}