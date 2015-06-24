package com.controller;

import java.util.concurrent.atomic.AtomicLong;

import com.beans.IBean;
import com.beans.IBeanFactoryBean;
import com.model.Greeting;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Itai Peleg
 * @since 23/06/2015.
 */
@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private IBeanFactoryBean factoryBean;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World")String name,
            @RequestParam(value = "beanA", defaultValue = "true") boolean beanA )
            throws Exception {
        factoryBean.setBeanA(beanA);
        IBean iBean = factoryBean.getObject();
        return iBean.doSome(counter.incrementAndGet(), String.format(template, name));
    }

}
