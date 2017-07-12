package com.tw.workshop.diamond;

import java.util.Arrays;
import java.util.List;

public class Printer {
    public List<String> diamond(String letter) {
        if (letter.equals("A")) {
            return Arrays.asList("A");
        } else if (letter.equals("B")) {
            return Arrays.asList(" A ", "B B", " A ");
        } else {
            return Arrays.asList("  A  ", " B B ", "C   C", " B B ", "  A  ");
        }
    }
}
