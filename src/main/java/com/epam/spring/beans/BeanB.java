package com.epam.spring.beans;

public class BeanB {

    String name;
    Integer value;

    public BeanB(String name, Integer value) {
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
        return "BeanB: " +
                "name= " + name + ' ' +
                ", value= " + value +
                ';';
    }

}
