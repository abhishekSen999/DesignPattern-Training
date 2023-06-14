package com.iteratrlearning.design_patterns.examples.factory;

public class SSLReaderFactory implements ReaderFactory {
    @Override
    public Reader createReader(String source) {

        if(source.startsWith("http")) {
            return new SSLHTTPReader();
        } else if(source.startsWith("ftp")) {
            return new SSLFTPReader();
        }
        else {
            throw new UnsupportedOperationException();
        }
    }
}
