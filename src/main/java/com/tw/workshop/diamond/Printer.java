package com.tw.workshop.diamond;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Printer {
    public List<String> diamond(String letter) {
        ArrayList<String> lines = new ArrayList<>();
        for (String lineLetter : getSeq(letter)) {
            lines.add(getLine(letter, lineLetter));
        }
        return lines;
    }

    private List<String> getSeq(String letter) {
        List<String> firstHalf = new ArrayList<>();
        for (char c = 'A'; c <= letter.charAt(0); c++) {
            firstHalf.add(String.valueOf(c));
        }

        if (firstHalf.size() <= 1) {
            return firstHalf;
        }

        List<String> secondHalf = new ArrayList<>(firstHalf.subList(0, firstHalf.size() - 1));
        Collections.reverse(secondHalf);

        List<String> result = new ArrayList<>();
        result.addAll(firstHalf);
        result.addAll(secondHalf);
        return result;
    }

    private String getLine(String letter, String lineLetter) {
        if (letter.equals("A")) {
            return "A";
        } else if (letter.equals("B")) {
            if (lineLetter.equals("A")) {
                return " A ";
            } else {
                return "B B";
            }
        } else {
            if (lineLetter.equals("A")) {
                return "  A  ";
            } else if (lineLetter.equals("B")) {
                return " B B ";
            } else {
                return "C   C";
            }
        }
    }
}
