package com.company;

import com.google.gson.Gson;
import jdk.nashorn.internal.ir.annotations.Immutable;
@Immutable
public final class Person {
    static int Id = 1;

    String Name;

    String FamilyName;

    int age;

    String PlaceOfBirth;

    Person(String name, String fname, int ag, String place){
        Name = name;
        FamilyName = fname;
        age = ag;
        PlaceOfBirth = place;
        Id = ++Id;
    }

    @Override
    public final boolean equals(Object p){
        if(this == p){
            return true;
        }
        if(p == null || p.equals(null) || getClass() != p.getClass()){
            return false;
        }
        Person person = (Person) p;
        return Name.equals(person.Name)  && FamilyName.equals(person.FamilyName) && age == person.age && PlaceOfBirth.equals(person.PlaceOfBirth);

    }


    @Override
    public final int hashCode(){
        return Name.hashCode() + FamilyName.hashCode() + age + PlaceOfBirth.hashCode();
    }

    public String ToJson(){
        Gson gson = new Gson();
        String json = gson.toJson(this);
        return json;
    }

    public static Person FromJson(String json){
        Gson gson = new Gson();
        Person Jay = gson.fromJson(json, Person.class);
        return Jay;
    }

}
