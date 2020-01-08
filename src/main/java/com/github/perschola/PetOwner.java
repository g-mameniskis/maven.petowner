package com.github.perschola;

/**
 * Created by leon on 12/17/2019.
 */
public class PetOwner extends Person{

    private Pet pet;

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }
}
