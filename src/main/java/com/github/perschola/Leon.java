package com.github.perschola;

import org.w3c.dom.ls.LSOutput;

/**
 * Created by leon on 12/17/2019.
 */
public class Leon extends PetOwner {
    public Leon() {
        this.setFirstName("Leon"); // Why are you able to initialize values for a class when a class is a blueprint for an object?
        this.setLastName("Hunter"); // shouldn't you initialize values for an instance of a class?

        Pet lizard = new Pet(); // Leon, who "is-a" PetOwner must "have-a" Pet

        lizard.setName("Harold");
        lizard.setAge(19);
        this.setPet(lizard);
    }
}
