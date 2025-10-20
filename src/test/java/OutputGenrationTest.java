package org.example.localization;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OutputGenrationTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testPrintEnglishLanguage() {
        OutputGenration opt = new OutputGenration();
        opt.printTheLanguage("en", "US");

        String output = outContent.toString().trim().toLowerCase();
        assertTrue(
                output.contains("hello") || output.contains("greetings"),
                "English output should contain greeting text, but was: " + output
        );
    }

    @Test
    void testPrintFinnishLanguage() {
        OutputGenration opt = new OutputGenration();
        opt.printTheLanguage("fi", "FI");

        String output = outContent.toString().trim().toLowerCase();
        assertTrue(
                output.contains("hei") || output.contains("terve"),
                "Finnish output should contain Finnish greeting text, but was: " + output
        );
    }

    @Test
    void testPrintPersianLanguage() {
        OutputGenration opt = new OutputGenration();
        opt.printTheLanguage("fa", "IR");

        String output = outContent.toString().trim();
        assertTrue(
                output.contains("سلام") || output.contains("درود"),
                "Persian output should contain Persian greeting text, but was: " + output
        );
    }
}
