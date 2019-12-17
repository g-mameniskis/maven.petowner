package com.github.perschola.person;

import com.github.perschola.Person;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 12/17/2019.
 */
public class NonNullaryConstructor {
    // given
    private void test(String expectedFirstName, String expectedLastName) {
        // when
        Person person = new Person(expectedFirstName, expectedLastName);

        // then
        Assert.assertEquals(expectedFirstName, person.getFirstName());
        Assert.assertEquals(expectedLastName, person.getLastName());
    }

    @Test
    public void test0() {
        test("Leon", "Hunter");
    }

    @Test
    public void test1() {
        test("Ali", "Hyman");
    }

    @Test
    public void test2() {
        test("Charlotte", "Web");
    }
}
