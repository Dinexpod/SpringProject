package mate.academy.springdemo.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("userService")
public class UserServiceImpl implements UserService {

    public UserServiceImpl() {
        System.out.println("Defoult constructor!!!");
    }

    public void printMyName() {
        System.out.println("Hello !!!!!!!!!!");
    }

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("UserServiceImpl destroy");
    }

    @PostConstruct
    public void afterPropertiesSet() throws Exception {
        System.out.println("UserServiceImpl afterPropertiesSet");
    }
}
