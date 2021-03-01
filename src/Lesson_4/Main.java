package Lesson_4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Individuals[] individual = new Individuals[] {
                new Individuals("Петрова Нина Сергеевна", "жен", 40),
                new Individuals("Иванов Иван Иванович", "муж", 35),
                new Individuals("Киселева Светлана Сергеевна", "жен", 50),
                new Individuals("Сидоров Роман Георгиевич", "муж", 63),
                new Individuals("Романов Михаил Олегович", "муж", 32),
                new Individuals("Иванова Любовь Федоровна", "жен", 44),
                new Individuals("Матроскин Олег Владимирович", "муж", 38),
                new Individuals("Федоров Петр Олегович", "муж", 42),
                new Individuals("Федоров Петр Олегович", "муж", 42),
                new Individuals("Федоров Петр Олегович", "муж", 42),
        } ;
        IP[] ip = new IP[]{
                new IP("Семенов Сергей Константинович","1584965289652", 55)
        };

        List<Individuals> list = new LinkedList<>();

        Arrays.sort(individual);
        System.out.println(Arrays.toString(individual));

        Clients.Dublicate(individual, list);
        Clients.GenderSort(individual, list);
    }
}
