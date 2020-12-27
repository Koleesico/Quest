package com.example.zagotovka;

public class Situation {
Situation [] direction;
String title, text;
int dA, dB;

    public Situation( String title, String text, int variants, int dA, int dB) {
        this.title = title;
        this.text = text;
        this.dA = dA;
        this.dB = dB;
        direction = new Situation[variants];
    }
}
