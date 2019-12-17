package com.github.perschola.petowner;

import com.github.perschola.Pet;
import com.github.perschola.PetOwner;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 12/17/2019.
 */
public class SetPetTest {
    // given
    private void test(Pet expectedPet) {
        PetOwner petOwner = new PetOwner();

        // when
        petOwner.setPet(expectedPet);

        // then
        Assert.assertEquals(expectedPet, petOwner.getPet());
    }

    @Test
    public void test0() {
        Pet pet = new Pet();
        test(pet);
    }

    @Test
    public void test1() {
        Pet pet = new Pet("Milo", 5);
        test(pet);
    }


    @Test
    public void test2() {
        Pet pet = new Pet("Garfield", 0);
        test(pet);
    }
}
