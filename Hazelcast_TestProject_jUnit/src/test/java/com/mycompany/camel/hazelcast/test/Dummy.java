package com.mycompany.camel.hazelcast.test;

import java.io.Serializable;

public class Dummy implements Serializable {

    private static final long serialVersionUID = 1L;

    private String foo;
    private int bar;

    public Dummy(String foo, int bar) {
        this.foo = foo;
        this.bar = bar;
    }

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public int getBar() {
        return bar;
    }

    public void setBar(int bar) {
        this.bar = bar;
    }

}