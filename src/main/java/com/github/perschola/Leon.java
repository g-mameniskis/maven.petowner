package com.github.perschola;

/**
 * Created by leon on 12/17/2019.
 */
public class Leon extends PetOwner {
    public Leon() {
        this.setFirstName("Leon");
        this.setLastName("Hunter");

        Pet lizard = new Pet();

        lizard.setName("Harold");
        lizard.setAge(19);
        this.setPet(lizard);
    }
}
