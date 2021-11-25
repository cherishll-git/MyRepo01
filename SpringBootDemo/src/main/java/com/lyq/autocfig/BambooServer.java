package com.lyq.autocfig;

public class BambooServer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String sayServerName(){
        return "I'm " + this.name;
    }
}
