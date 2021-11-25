package com.fundamentos.springboot.fundamentos;

import com.fundamentos.springboot.fundamentos.bean.MyBean;
import com.fundamentos.springboot.fundamentos.bean.MyBeanWithDependencyImp;
import com.fundamentos.springboot.fundamentos.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;
	private MyBean myBean;
	private MyBeanWithDependencyImp myBeanWithDependencyImp;

	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency,
			MyBean myBean, MyBeanWithDependencyImp myBeanWithDependencyImp) {
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithDependencyImp = myBeanWithDependencyImp;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) {
		componentDependency.saludar();
		myBean.print();
		myBeanWithDependencyImp.printWithDependency();
	}
}
