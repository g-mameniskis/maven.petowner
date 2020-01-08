package com.github.perschola;

import org.w3c.dom.ls.LSOutput;

/**
 * Created by leon on 12/17/2019.
 */
public class Leon extends PetOwner {
    public Leon() {
        this.setFirstName("Leon"); // Why are you able to initialize values for a class when a class is a blueprint for an object?
        this.setLastName("Hunter"); // shouldn't you initialize values for an instance of a class?

        Pet lizard = new Pet(); // Leon, who "is-a" PetOwner may "have-a" Pet

        lizard.setName("Harold");
        lizard.setAge(19);
        this.setPet(lizard);
    }
}

//    public static void main(String[] args) {
//        Leon leon = new Leon();
//        System.out.println(leon.getFirstName()+leon.getLastName()+leon.getPet().getName()+leon.getPet().getAge());
//
//        PetOwner firstLeon = new PetOwner();// I see Leon, he now officially exists
//        firstLeon.setFirstName("Leon"); // I meet Leon, he tells me his first name
//        firstLeon.setLastName("Hunter"); // He tells me his last name
//
//        Pet lizard = new Pet(); // now lizard officially exists too
//        firstLeon.setPet(lizard); // he tells me he has a pet lizard (unites leon with lizard)
//
//        lizard.setName("Harold"); // leon tells me his lizard's name
//        lizard.setAge(19); // he also tells me his lizard's age
//
//    }
