package com.fundamentos.springboot.fundamentos.bean;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

public class MyBeanWithDependencyImp implements MyBeanWithDependency{

    final Log LOGGER = LogFactory.getLog(MyBeanWithDependencyImp.class);

    private MyOperation myOperation;

    public MyBeanWithDependencyImp(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        LOGGER.info("Hemos ingresado al metodo printWithDependency");
        int numero = 1;
        LOGGER.debug("El numero enviado como parametro a la dependencia operation es: " + numero);
        System.out.println(myOperation.sum(numero));
        System.out.println("Hola desde el bean con dependencia");
    }
}
