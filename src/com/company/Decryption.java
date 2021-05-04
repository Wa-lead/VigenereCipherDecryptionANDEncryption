package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;

public class main {
    static String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789,.?! ";
    static ArrayList<Double> emergingFrequency = new ArrayList<Double>();

    public static void main(String[] args) throws FileNotFoundException {
        File outputFile1 = new File("output.dec"); // Destination file
        Scanner scan = new Scanner(outputFile1);
        ArrayList<String> word = new ArrayList<>();
        String encryptedCharedMessage = "";

        while (scan.hasNextLine()) {
            encryptedCharedMessage += scan.nextLine() + "";
        }

        Scanner scanner = new Scanner(System.in);
        int keylength = scanner.nextInt();

        String[] wordOflengthKey = encryptedCharedMessage.split("(?<=\\G.{6})"); // splits the message into strings of length 6
        String decryptionKey = "";


        for (int i = 0; i < keylength; i++) {
            String x = ""; // letters at index I

            for (int j = 0; j < wordOflengthKey.length; j++) { // add all letters to string x
                x += wordOflengthKey[j].length() > i ? wordOflengthKey[j].charAt(i) + "" : "";
            }

            for (int j = 0; j < chars.length(); j++) {// split all letter
                ArrayList<Character> arrayList = new ArrayList<>();
                for (char t : x.toCharArray()) {
                    arrayList.add(t);
                }
                double frq = Collections.frequency(arrayList, chars.charAt(j));
                emergingFrequency.add(frq);
            }
            
            double max = Collections.max(emergingFrequency);
            System.out.println(x);
            int encryptedChar = ((emergingFrequency.indexOf(max) - 66 + 67) % 67);
            decryptionKey += chars.charAt((67 - encryptedChar) % 67);
            emergingFrequency.clear();
        }

        System.out.println(decryptionKey);
        System.out.println(finddecryptionKeyionKey(decryptionKey));
    }


    public static String finddecryptionKeyionKey(String key) {
        String decryptionKeyionKey = "";
        for (int i = 0; i < key.length(); i++) {
            decryptionKeyionKey += chars.charAt((chars.length() - chars.indexOf(key.charAt(i))) % 67); // 67 - char = decryptionKeyionChar
        }
        return decryptionKeyionKey;
    }
}
    

