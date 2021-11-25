package com.fundamentos.springboot.fundamentos.bean;

public class myBeanImplement implements MyBean{
    @Override
    public void print() {
        System.out.println("Hola desde bean!");
    }
}
