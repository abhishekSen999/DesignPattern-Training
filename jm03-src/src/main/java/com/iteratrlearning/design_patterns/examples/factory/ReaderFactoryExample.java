package com.iteratrlearning.design_patterns.examples.factory;

import java.io.IOException;

public class ReaderFactoryExample {
    public static void main(String[] args) throws IOException {

        ReaderFactory readerFactory = getReaderFactory(15);

        Reader reader = readerFactory.createReader("ftp");
        reader.read();

        System.out.println(reader.getClass());
    }

    public static ReaderFactory getReaderFactory(int sensitiveLevel) {
        if(sensitiveLevel > 10) {
            return new SSLReaderFactory();
        }
        return new SimpleReaderFactory();
    }


}
