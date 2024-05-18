package com.javalibrandroid.sdk21compat.base64.encoder;

import androidx.annotation.RequiresApi;
import java.util.Base64;

@RequiresApi(26)
public class EncoderJava extends Encoder {
    private final Base64.Encoder encoder;

    public EncoderJava() {
        encoder = Base64.getEncoder();
    }

    @Override
    public String encodeToString(byte[] input) {
        return encoder.encodeToString(input);
    }
}
