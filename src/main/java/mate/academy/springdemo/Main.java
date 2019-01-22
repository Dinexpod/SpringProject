package mate.academy.springdemo;

import mate.academy.springdemo.config.Config;
import mate.academy.springdemo.model.Developer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println("SPring context initialize...");

        Developer developer = new Developer();


    }
}
