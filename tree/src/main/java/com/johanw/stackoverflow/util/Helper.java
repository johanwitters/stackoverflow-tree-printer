package com.johanw.stackoverflow.util;

public class Helper {
    public static String repeat(int amount, String value) {
        return new String(new char[amount]).replace("\0", value);
    }

}
