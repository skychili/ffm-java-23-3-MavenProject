package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    /**
     * Schreibe eine Methode die:
     * - Einen Integer entgegennimmt und ihn als String zurückgibt V
     * - Ist die Zahl durch 3 teilbar, returned die Methode "fizz" V
     * - Ist die Zahl durch 5 Teilbar, returned die Methode "buzz" V
     * - Ist die Zahl durch 3 & 5 teilbar, returned die Methode "fizzbuzz" V
     *
     * TDD Ansatz
     * Red -> Wir schreiben einen Test, der gewünschte Funktionalität beschreibt, jedoch fehlschlägt.
     * Green -> Implementierung von Logik um den Test erfolgreich abzuschließen
     * Refactor -> Optimieren den zuvor geschriebenen Code ohne den Teststatus zu verändern.
     */

    @Test
    void playFizzbuzz_shouldReturn4_whenInputIs4(){
        //GIVEN
        int value = 4;
        String expected = "4";
        //WHEN
        String actual = Main.playFizzbuzz(value);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void playFizzbuzz_shouldReturn1_whenInputIs1(){
        //GIVEN
        int value = 1;
        String expected = "1";
        //WHEN
        String actual = Main.playFizzbuzz(value);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void playFizzbuzz_shouldReturnFizz_whenInputIs3(){
        //GIVEN
        int value = 3;
        String expected = "fizz";
        //WHEN
        String actual = Main.playFizzbuzz(value);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void playFizzbuzz_shouldReturnFizz_whenInputIs6(){
        //GIVEN
        int value = 6;
        String expected = "fizz";
        //WHEN
        String actual = Main.playFizzbuzz(value);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void playFizzbuzz_shouldReturnBuzz_whenInputIs5(){
        //GIVEN
        int value = 5;
        String expected = "buzz";
        //WHEN
        String actual = Main.playFizzbuzz(value);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void playFizzbuzz_shouldReturnBuzz_whenInputIs10(){
        //GIVEN
        int value = 10;
        String expected = "buzz";
        //WHEN
        String actual = Main.playFizzbuzz(value);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void playFizzbuzz_shouldReturnFizzBuzz_whenInputIs15(){
        //GIVEN
        int value = 15;
        String expected = "fizzbuzz";
        //WHEN
        String actual = Main.playFizzbuzz(value);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void playFizzbuzz_shouldReturnFizzBuzz_whenInputIs0(){
        //GIVEN
        int value = 0;
        String expected = "fizzbuzz";
        //WHEN
        String actual = Main.playFizzbuzz(value);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void playFizzbuzz_shouldReturnPleaseEnterPosNum_whenInputIsMinus3(){
        //GIVEN
        int value = -3;
        String expected = "Please enter a positive Number";
        //WHEN
        String actual = Main.playFizzbuzz(value);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void playFizzbuzz_shouldReturnPleaseEnterPosNum_whenInputIsMinus300(){
        //GIVEN
        int value = -300;
        String expected = "Please enter a positive Number";
        //WHEN
        String actual = Main.playFizzbuzz(value);
        //THEN
        assertEquals(expected, actual);
    }
}