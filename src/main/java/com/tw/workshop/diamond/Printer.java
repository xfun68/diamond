package com.tw.workshop.diamond;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Printer {

    private static final String LETTER_A = "A";

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
        StringBuffer result = spaces(letter);
        result.setCharAt(diff(letter, lineLetter), lineLetter.charAt(0));
        result.setCharAt(result.toString().length() - 1 - (diff(letter, lineLetter)), lineLetter.charAt(0));
        return result.toString();
    }

    private int diff(String left, String right) {
        return left.charAt(0) - right.charAt(0);
    }

    private StringBuffer spaces(String letter) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < diff(letter, LETTER_A) * 2 + 1; i++) {
            stringBuffer.append(' ');
        }
        return stringBuffer;
    }
}
