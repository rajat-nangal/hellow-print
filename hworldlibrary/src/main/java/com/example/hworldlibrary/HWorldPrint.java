package com.example.hworldlibrary;

import android.content.Context;
import android.widget.Toast;

public class HWorldPrint {
    public static void printHelloW(Context c, String message) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();
    }
}
