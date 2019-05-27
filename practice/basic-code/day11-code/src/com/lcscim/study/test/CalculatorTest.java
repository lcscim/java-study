package com.lcscim.study.test;

import com.lcscim.study.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    @Before
    public void before(){
        System.out.println("Before...");
    }
    @After
    public void after(){
        System.out.println("After....");
    }
    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        int result = calculator.add(1,2);
        System.out.println(result);
        Assert.assertEquals(3,result);
    }
    @Test
    public void testSub(){
        Calculator calculator = new Calculator();
        int result = calculator.sub(1,2);
        System.out.println(result);
        Assert.assertEquals(-1,result);
    }
}
