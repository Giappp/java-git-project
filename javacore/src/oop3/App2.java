package oop3;

import java.io.IOException;

public class App2 {
    public static void main(String[] args) throws IOException {
        FileHandler fileHandler = new FileHandler();
        fileHandler.getContent("students.txt");
    }
}
