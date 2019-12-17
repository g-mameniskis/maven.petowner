package com.github.perschola.person;

import com.github.perschola.Person;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 12/17/2019.
 */
public class NonNullaryConstructorTest {
    @Test
    public void test() {
        // given
        String expectedFirstName = "";
        String expectedLastName = "";

        // when
        Person person = new Person();

        // then
        Assert.assertEquals(expectedFirstName, person.getFirstName());
        Assert.assertEquals(expectedLastName, person.getLastName());
    }
}
