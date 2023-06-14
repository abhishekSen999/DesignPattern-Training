package com.iteratrlearning.design_patterns.examples.exceptions;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class OldFiles {

    public static String error;

    public static long size(String file) {
        long result = 0;
        try {
            Path path = Paths.get(file);
            result = Files.size(path);
        } catch(InvalidPathException e) {
            result = -1;
            error = e.toString();
        }
        catch(NoSuchFileException e) {
            result = -2;
            error = e.toString();
        }
        catch(IOException e) {
            result = -3;
            error = e.toString();
        }
        return result;
    }
}
