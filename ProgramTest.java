package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;


class ProgramTest {

    @Test
    void encrypt() {
        String expected = "bcd";
        String encrypted = Program.encrypt("abc", (char) 1);
        Assertions.assertEquals(expected, encrypted);

    }

    @Test
    void decrypt() {
        String expected = "aby";
        String decrypted = Program.decrypt("bcz", (char) 1);
        Assertions.assertEquals(expected, decrypted);

    }

    @Test
    void encryptAndDecrypt() {
        String expected = "Just do it!";
        char encryptChar = (char) 1000;
        String encrypted = Program.encrypt(expected, encryptChar);
        String decrypted = Program.decrypt(encrypted, encryptChar);
        Assertions.assertEquals(expected, decrypted);
    }
}