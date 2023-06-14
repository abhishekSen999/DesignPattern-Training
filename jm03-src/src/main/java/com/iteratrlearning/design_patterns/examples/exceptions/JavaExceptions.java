package com.iteratrlearning.design_patterns.examples.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaExceptions {


    public static void main(String[] args) {

        String filePath = "src/test/resources/bank-data-simple.csv";

        Path path = Paths.get(filePath);
        try {
            System.out.println(Files.size(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
