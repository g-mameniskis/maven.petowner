package com.github.perschola.person;

import com.github.perschola.Person;
import com.github.perschola.Pet;
import com.github.perschola.PetOwner;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 12/17/2019.
 */
public class PolymorphismTest {
    @Test
    public void testPetPolymorphism() {
        // given
        Person person = new Person();

        // when
        Boolean isPet = (Object)person instanceof Pet;

        // then
        Assert.assertFalse(isPet);
    }

    @Test
    public void testPetOwnerPolymorphism() {
        // given
        Person person = new Person();

        // when
        Boolean isPetOwner = (Object)person instanceof PetOwner;

        // then
        Assert.assertFalse(isPetOwner);
    }
}
