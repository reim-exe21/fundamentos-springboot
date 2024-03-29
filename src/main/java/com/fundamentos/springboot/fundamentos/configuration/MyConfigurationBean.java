package com.fundamentos.springboot.fundamentos.configuration;

import com.fundamentos.springboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){
        return new myBean2Implement();
    }

    @Bean
    public MyOperation MyOperation(){
        return new MyOperationImplement();
    }

    @Bean
    public MyBeanWithDependencyImp myOperationImplementWithDep(MyOperation myOperation){
        return new MyBeanWithDependencyImp(myOperation);
    }
}
