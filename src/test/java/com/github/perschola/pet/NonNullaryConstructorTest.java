package com.github.perschola.pet;

import com.github.perschola.Pet;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 12/17/2019.
 */
public class NonNullaryConstructorTest {
    // given
    private void test(String expectedName, Integer expectedAge) {
        // when
        Pet pet = new Pet(expectedName, expectedAge);

        // then
        Assert.assertEquals(expectedName, pet.getName());
        Assert.assertEquals(expectedAge, pet.getAge());
    }

    @Test
    public void test0() {
        test("Leon", 0);
    }

    @Test
    public void test1() {
        test("Noel", 10);
    }

    @Test
    public void test2() {
        test("John", 99);
    }
}
