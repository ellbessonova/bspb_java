package Lesson_4;

import java.util.List;
import java.util.Objects;

public abstract class Clients implements Comparable<Clients> {
    private String name;
    private String gender;
    private int age;

    public Clients(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
        Clients clients = (Clients) o;
        return age == clients.age && Objects.equals(name, clients.name) && Objects.equals(gender, clients.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, age);
    }

    @Override
    public String toString() {
        return "Clients{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age + '\'' +
                '}';
    }

    @Override
    public int compareTo(Clients o) {
        if (this.age > o.age) {
            return +1;
        } else if (this.age == o.age) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void Dublicate(Individuals[] individual, List<Individuals> list) {
        for (int i = 0; i < individual.length - 2; i++) {
            if (!individual[i].equals(individual[i + 1])) {
                list.add(individual[i]);
            }
        }
    }

    public static void GenderSort(Individuals[] individual, List<Individuals> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getGender() == "муж") {
                System.out.print(list.get(i).getName() + " " + list.get(i).getGender() + " " + list.get(i).getAge());
                if ((i != list.size() - 1)) {
                    System.out.println();
                }
            }
        }
    }
}
