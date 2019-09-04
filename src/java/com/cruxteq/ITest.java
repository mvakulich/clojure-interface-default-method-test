package com.cruxteq;

public interface ITest {
    String a();
    default String testString(){
        return this.a();
    }
}