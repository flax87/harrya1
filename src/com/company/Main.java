package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {

        String text = new String(Files.readAllBytes(Paths.get("C:\\Users\\Flax\\Desktop\\harry.txt")));

        String cleanerText = text
                .replaceAll(",", "")
                .replaceAll(";", "")
                .replaceAll("\\.", "")
                .replaceAll("!", "")
                .replaceAll("\\(", "")
                .replaceAll("\\)", "")
                .replaceAll(":", "")
                .replaceAll("\\?", "")
                .replaceAll("\"", "");





        String[] words = cleanerText.split("[^a-zA-Z]");
        int i, size = words.length;
        int iMax = -1, iMaxLength = -1;
        for (i = 0; i < size; ++i)

            if (!"".equals(words[i]) && words[i].length() > iMaxLength) {
                iMax = i;
                iMaxLength = words[i].length();
            }

        if (iMax == -1)
            System.err.println("String has no contains words");
        else
            System.out.println("Index = " + iMax + " \tword = " + words[iMax]);



        int harryWords = 0;
        for (int l = 0; l < words.length; l++) {
            if (words[l].contains("Harry"))
                harryWords++;
        }
        System.out.println("Harry's name mentioned " + harryWords + " times");

        String distinktString = " ";

        for (int j = 0; j < words.length; j++) {

            if (!distinktString.contains(words[j])) {
                distinktString += words[j] + " ";
            }

        }

        // System.out.println(distinktString);

        String[] hasharray = distinktString.split(" ");

        for (int j = 0; j < hasharray.length; j++) {
            System.out.println(hasharray[j]);
        }

        int hash = hasharray.hashCode();
        System.out.println("Хеш -> " + hash);
    }
}


