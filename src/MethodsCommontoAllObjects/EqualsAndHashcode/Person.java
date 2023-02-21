package MethodsCommontoAllObjects.EqualsAndHashcode;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if(!(obj instanceof Person)) return false;

        Person o = (Person) obj;

        return Integer.compare(age,o.age)==0 && name.equals(o.name);
    }
}





