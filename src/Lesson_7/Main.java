package Lesson_7;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Individual> individual = new ArrayList<Individual>();
        individual.add(new Individual("Петрова Нина Сергеевна", "жен", 40));
        individual.add(new Individual("Иванов Иван Иванович", "муж", 35));
        individual.add(new Individual("Киселева Светлана Сергеевна", "жен", 50));
        individual.add(new Individual("Сидоров Роман Георгиевич", "муж", 63));
        individual.add(new Individual("Романов Михаил Олегович", "муж", 32));
        individual.add(new Individual("Иванова Любовь Федоровна", "жен", 44));
        individual.add(new Individual("Матроскин Олег Владимирович", "муж", 38));
        individual.add(new Individual("Федоров Петр Олегович", "муж", 42));
        individual.add(new Individual("Федоров Петр Олегович", "муж", 42));
        individual.add(new Individual("Федоров Петр Олегович", "муж", 42));

        Utility.individualStream(individual, "муж");
    }
}
