package com.beans;

import com.model.Greeting;

/**
 * @author Itai Peleg
 * @since 23/06/2015.
 */
public class BeanB implements IBean {
    @Override
    public Greeting doSome(long id, String name) {
        System.out.println("\n  ===> i'm Bean B  <=== ");
        return new Greeting(id , "I'm Bean B, " + name);
    }
}
