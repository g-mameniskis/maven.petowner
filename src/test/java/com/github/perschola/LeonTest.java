package com.github.perschola;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 12/17/2019.
 */
public class LeonTest {
    @Test
    public void testPolymorphism() {
        // given
        Leon leon = new Leon();

        // when
        Boolean isPetOwner = ((Object) leon) instanceof PetOwner;
        Boolean isPerson = ((Object) leon) instanceof Person;

        // then
        Assert.assertTrue(isPetOwner);
        Assert.assertTrue(isPerson);
    }

    @Test
    public void testGetPet() {
        // given
        Leon leon = new Leon();
        PetOwner leonAsPetOwner = ((PetOwner)(Object)leon);
        String expectedPetName = "Milo";
        Integer expectedPetAge = 6;

        // when
        Pet pet = leonAsPetOwner.getPet();

        // then
        Assert.assertEquals(expectedPetName, pet.getName());
        Assert.assertEquals(expectedPetAge, pet.getAge());
    }

    @Test
    public void testGetName() {
        // given
        Leon leon = new Leon();
        Person leonAsPerson = (Person)((Object)leon);
        String expectedFirstName = "Leon";
        String expectedLastName = "Hunter";

        // when
        String actualFirstName = leonAsPerson.getFirstName();
        String actualLastName = leonAsPerson.getLastName();

        // then
        Assert.assertEquals(expectedFirstName, actualFirstName);
        Assert.assertEquals(expectedLastName, actualLastName);
    }
}
