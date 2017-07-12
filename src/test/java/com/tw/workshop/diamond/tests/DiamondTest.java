package com.tw.workshop.diamond.tests;

import com.tw.workshop.diamond.Printer;
import org.junit.Assert;
import org.junit.Test;

public class DiamondTest {

    private final Printer printer = new Printer();

    @Test
    public void print_diamond_for_A() throws Exception {
        Assert.assertEquals("A", printer.diamond("A"));
    }

}
