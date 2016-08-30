package org.effectivejava.examples.chapter11.item75;

import java.io.Serializable;

/**
 * Created by bzou on 2016/8/30.
 *
 * Good candidate for default serialized form
 */
public class Name implements Serializable {

    /**
     * Last name, must be non-null
     * @serial
     */
    private final String lastName;

    /**
     * First name, must be non-null
     * @serial
     */
    private final String firstName;

    /**
     * Middle name, or null if there is none
     * @serial
     */
    private final String middleName;

    //Remainder omitted
}
