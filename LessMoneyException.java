package com.company;

public class LessMoneyException extends Exception {
    @Override
    public String getMessage() {
        return "\n" +
                "the amount cannot be lower than zero";
    }
}