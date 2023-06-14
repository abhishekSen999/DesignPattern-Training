package com.iteratrlearning.design_patterns.examples.factory;

public class SimpleReaderFactory implements ReaderFactory {
    @Override
    public Reader createReader(String source) {

        if(source.startsWith("http")) {
            return new HTTPReader();
        } else if(source.startsWith("ftp")) {
            return new FTPReader();
        }
        else {
            throw new UnsupportedOperationException();
        }
    }
}
