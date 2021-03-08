package Lesson_4;

import java.util.Objects;

public abstract class Client implements Comparable<Client> {
    protected String name;
    protected int age;

    public Client(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return age == client.age && Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Client o) {
        if (this.age > o.age) {
            return +1;
        } else if (this.age == o.age) {
            return 0;
        } else {
            return -1;
        }
    }
}
