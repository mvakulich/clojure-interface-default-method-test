package com.cruxteq;

public abstract class AbstractTest implements ITest {
    public String testString(){
        return ITest.super.testString();
    }
}