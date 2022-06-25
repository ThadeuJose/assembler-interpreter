package com.example;

public class Function {
    private String arr[];

    public Function(String line) {
        arr = line.split(" ");
    }

    public String getOpCode() {
        return arr[0];
    }

    public String getParameter(int index) {
        return arr[index + 1];
    }
}