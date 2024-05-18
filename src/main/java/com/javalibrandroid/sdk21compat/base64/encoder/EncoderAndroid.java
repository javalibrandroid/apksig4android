package com.javalibrandroid.sdk21compat.base64.encoder;

import android.util.Base64;

public class EncoderAndroid extends Encoder {
    @Override
    public String encodeToString(byte[] input) {
        return Base64.encodeToString(input, Base64.NO_WRAP);
    }
}
