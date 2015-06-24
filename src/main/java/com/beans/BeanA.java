package com.beans;

import com.model.Greeting;

/**
 * @author Itai Peleg
 * @since 23/06/2015.
 */
public class BeanA implements IBean {

    @Override
    public Greeting doSome(long id, String name) {
        System.out.println("\n  ===> i'm Bean A  <=== ");
        return new Greeting(id, name);
    }
}
