package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeTest {

    Prime obj = new Prime();

    @Test
    public void testPrimeNumber() {
        assertTrue(obj.isPrime(7));
    }

    @Test
    public void testAnotherPrimeNumber() {
        assertTrue(obj.isPrime(13));
    }

    @Test
    public void testNonPrimeNumber() {
        assertFalse(obj.isPrime(8));
    }

    @Test
    public void testZero() {
        assertFalse(obj.isPrime(0));
    }

    @Test
    public void testOne() {
        assertFalse(obj.isPrime(1));
    }

    @Test
    public void testNegativeNumber() {
        assertFalse(obj.isPrime(-5));
    }

    @Test
    public void testTwo() {
        assertTrue(obj.isPrime(2));
    }
}