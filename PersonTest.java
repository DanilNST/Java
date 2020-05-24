package com.company;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testEquals() {
        EqualsVerifier.forClass(Person.class).verify();
    }

    @Test
    public void hashcode() {
    }

    @Test
    public void toJson() {
        Person person = new Person("Jay", "Lewis", 18, "Toronto");
        Person perso = new Person("Danil", "Nastarchuk", 19, "Kyiv");

        String Json = person.ToJson();
        String json = perso.ToJson();
        assertEquals(person, Person.FromJson(Json));
        assertEquals(perso, Person.FromJson(json));

    }

    @Test
    public void fromJson() {
    }
}
