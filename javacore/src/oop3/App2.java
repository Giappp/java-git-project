package oop3;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class App2 {
    public static void main(String[] args) throws IOException {
        FileHandler fileHandler = new FileHandler();
        fileHandler.getContent("students.txt");
    }
}
