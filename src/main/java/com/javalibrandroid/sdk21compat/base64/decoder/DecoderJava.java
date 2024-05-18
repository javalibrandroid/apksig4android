package com.javalibrandroid.sdk21compat.base64.decoder;

import androidx.annotation.RequiresApi;

import java.util.Base64;

@RequiresApi(26)
public class DecoderJava extends Decoder {
    private final Base64.Decoder decoder;

    public DecoderJava() {
        decoder = Base64.getDecoder();
    }

    @Override
    public byte[] decode(String input) {
        return decoder.decode(input);
    }
}
