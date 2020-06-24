package com.gatisadder;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gatisadder.*;

import java.awt.event.ActionEvent;

/**
 * Unit test for simple App.
 */
public class modelTest {

    @Test
    public void testActionEvent() {
        int expected_count = 50;
        model temp = new model();
        int actual = temp.initModel(50);
        assertEquals(expected_count, actual);
    }

    @Test
    public void testMinusButton() {
        int expected_count = 50;
        model temp = new model();
        int actual = temp.initModel(50);
        assertEquals(expected_count, actual);

        // Now try minus button
        assertEquals(temp.minusNumber(), 49);
    }

    @Test
    public void testAddButton() {
        int expected_count = 50;
        model temp = new model();
        int actual = temp.initModel(50);
        assertEquals(expected_count, actual);

        // Now try minus button
        assertEquals(temp.addNumber(), 51);
    }

}
