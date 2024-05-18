package com.javalibrandroid.sdk21compat.base64;

import android.os.Build;

import com.javalibrandroid.sdk21compat.base64.decoder.Decoder;
import com.javalibrandroid.sdk21compat.base64.decoder.DecoderAndroid;
import com.javalibrandroid.sdk21compat.base64.decoder.DecoderJava;
import com.javalibrandroid.sdk21compat.base64.encoder.Encoder;
import com.javalibrandroid.sdk21compat.base64.encoder.EncoderAndroid;
import com.javalibrandroid.sdk21compat.base64.encoder.EncoderJava;

public class Base64 {
    public static Encoder getEncoder() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            return new EncoderJava();
        } else {
            return new EncoderAndroid();
        }
    }

    public static Decoder getDecoder() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            return new DecoderJava();
        } else {
            return new DecoderAndroid();
        }
    }
}

