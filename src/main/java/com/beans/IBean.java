package com.beans;

import com.model.Greeting;

/**
 * @author Itai Peleg
 * @since 23/06/2015.
 */
public interface IBean {
    Greeting doSome(long id, String name);
}
