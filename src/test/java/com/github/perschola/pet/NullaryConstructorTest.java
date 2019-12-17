package com.github.perschola.pet;

import com.github.perschola.Pet;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 12/17/2019.
 */
public class NullaryConstructorTest {
    @Test
    public void test() {
        // given
        String expectedName = "";
        Integer expectedAge = -1;

        // when
        Pet pet = new Pet();

        // then
        Assert.assertEquals(expectedAge, pet.getAge());
        Assert.assertEquals(expectedName, pet.getName());
    }
}
