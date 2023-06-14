package com.iteratrlearning.design_patterns.examples.exceptions.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceExample {

    public static void main(String[] args) {

    }

    static String readFirstLineFromFile(String path)
            throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        } finally {
            if (br != null) br.close();
        }
    }

    static String readFirstLineFromFileJava7(String path) throws IOException {
        try (BufferedReader br =
                     new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }

}
