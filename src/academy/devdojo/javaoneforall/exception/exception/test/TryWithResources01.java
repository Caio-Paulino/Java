package academy.devdojo.javaoneforall.exception.exception.test;

import academy.devdojo.javaoneforall.exception.domain.Reader1;
import academy.devdojo.javaoneforall.exception.domain.Reader2;

import java.io.*;

public class TryWithResources01 {
    public static void main(String[] args) {
        readFile();
    }

    private static void readFile() {
        try(Reader1 reader1 = new Reader1();
        Reader2 reader2 = new Reader2()) {

        } catch(IOException e) {

        }
    }
    }
