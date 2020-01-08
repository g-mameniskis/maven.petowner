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

// Hypothetical ~~~>

// Why create a Leon class when you can create an instance of PetOwner named 'Leon'?

// PetOwner leon = new PetOwner();
//      leon.setFirstName("");
//      leon.setLastName("");

// is it because an instance of PetOwner can't "have-a" instance of Pet?
