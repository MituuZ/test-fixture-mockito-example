package com.mituuz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void mainTest() {
        int l = Main.len("Hello");
        assertEquals(5, l);
    }
}