package com.epam.spring.beans;

public class BeanE {

    String name;
    Integer value;

    public BeanE(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "BeanE: " +
                "name= " + name + ' ' +
                ", value= " + value +
                ';';
    }

}
