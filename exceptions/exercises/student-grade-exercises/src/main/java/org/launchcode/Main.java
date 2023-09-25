package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println(Divide(10, 2) + "\n");
            System.out.println(Divide(10, 0) + "\n");
        } catch (ArithmeticException e) {
            System.err.println("An arithmetic exception occurred:\n");
            e.printStackTrace();
        }

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.html");
        studentFiles.put("Stefanie", "CoolProgram.css");


        for (Map.Entry<String, String> file : studentFiles.entrySet()) {
             try {
             System.out.println(CheckFileExtension(file.getValue()));
             } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
    }

    public static int Divide(int x, int y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("You cannot divide by zero");
        }

        return(x/y);
    }

    public static int CheckFileExtension(String fileName) {

        int result;

        if (fileName.isEmpty()) {
            System.out.println(-1);
            throw new IllegalArgumentException("You must have a file extension");
            } else if (fileName.substring(fileName.length() -5).equals(".java")) {
            result = 1;
            } else {
            result = 0;
        }

        return result;
    }
}