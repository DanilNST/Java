package com.company;

public class Program {
    public static void main(String[] args) {

    }

    public static String encrypt(String str, char a) {
        StringBuilder sb = new StringBuilder();
        for (Character b : str.toCharArray()) {

            char result = (char)(b + a);

            sb.append(result);
        }
        return sb.toString();
    }

    public static String decrypt(String str, char a) {
        StringBuilder sb = new StringBuilder();
        for (Character b : str.toCharArray()) {
            char result = b - a < 0 ? (char) 0 : (char)(b - a);
            sb.append(result);
        }
        return sb.toString();
    }

}