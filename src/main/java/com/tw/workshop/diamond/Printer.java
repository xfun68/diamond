package com.tw.workshop.diamond;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Printer {

    private static final String LETTER_A = "A";

    public List<String> diamond(String letter) {
        return generate(letter, " ");
    }

    public List<String> superDiamond(String letter) {
        return generate(letter, "*");
    }

    private List<String> generate(String letter, String decorator) {
        ArrayList<String> lines = new ArrayList<>();
        for (String lineLetter : getSeq(letter)) {
            lines.add(getLine(letter, lineLetter, decorator));
        }
        return lines;
    }

    private List<String> getSeq(String letter) {
        StringBuilder sb = new StringBuilder();
        for (char c = 'A'; c < letter.charAt(0); c++) {
            sb.append(c);
        }
        String result = sb.toString() + letter + sb.reverse().toString();
        return Arrays.asList(result.split(""));
    }

    private String getLine(String letter, String lineLetter, String decorator) {
        StringBuffer result = spaces(letter);
        int firstPos = diff(letter, lineLetter);
        int secondPos = result.toString().length() - 1 - (diff(letter, lineLetter));

        result.setCharAt(firstPos, lineLetter.charAt(0));
        for (int i = firstPos + 1; i < secondPos; i++) {
            result.setCharAt(i, decorator.charAt(0));
        }
        result.setCharAt(secondPos, lineLetter.charAt(0));

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
