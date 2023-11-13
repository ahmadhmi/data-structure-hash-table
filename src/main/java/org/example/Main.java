package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        CharFinder finder = new CharFinder();
        var ch = finder.findFirstNodeRepeatingChar("a green apple");
        System.out.println(ch);
    }
}