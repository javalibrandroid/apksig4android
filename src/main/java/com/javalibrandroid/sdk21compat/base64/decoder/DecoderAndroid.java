package com.javalibrandroid.sdk21compat.base64.decoder;

import android.util.Base64;

public class DecoderAndroid extends Decoder {
    @Override
    public byte[] decode(String input) {
        return Base64.decode(input, Base64.NO_WRAP);
    }
}
