package com.fundamentos.springboot.fundamentos.bean;

public class MyBeanWithDependencyImp implements MyBeanWithDependency{

    private MyOperation myOperation;

    public MyBeanWithDependencyImp(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        int numero = 1;
        System.out.println(myOperation.sum(numero));
        System.out.println("Hola desde el bean con dependencia");
    }
}
