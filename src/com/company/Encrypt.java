package com.company;

import java.io.*;
import java.util.*;

public class Main {
    static char[] dictionary = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789,.?! ".toCharArray();
    static ArrayList<Character> chars = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        for (char ch : dictionary) {
            chars.add(ch);
        }
        ///////////////////////////////////////////////////////////////////////////////////////////// Encryption 

        File inputFile = new File("inputFile.txt");
        File outputFile = new File("output.dec");
        Scanner scan = new Scanner(inputFile); // read from inputFile
        PrintWriter write = new PrintWriter(outputFile); // write to output


        // read from file
        String key = scan.nextLine(); // store the first line of the input ( key )
        String word = ""; // initialize to store words

        int j = 0; // key character index
        ////////////////////////////////////////// Encryption process starts here
        while (scan.hasNextLine()) {
            word += scan.nextLine();
            String encryptedWord = "";
            for (int i = 0; i < word.length(); i++, j++) {
                encryptedWord += encryptChar(word.charAt(i), key.charAt(j % key.length()));
            }
            write.println(encryptedWord);
            word = "";
        }
        ////////////////////////////////////////// Encryption process Ends here
        write.close();
        scan.close();
    }

    //--------------------------------------------------------------------------------------------------- Encryption method

    public static char encryptChar(char x, char key) {
        return chars.get((chars.indexOf(x) + chars.indexOf(key)) % chars.size());  // Z = (X + key) % mod 26 + base address of hex A
    }
}