package Lesson_4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Individual[] individual = new Individual[] {
                new Individual("Петрова Нина Сергеевна", "жен", 40),
                new Individual("Иванов Иван Иванович", "муж", 35),
                new Individual("Киселева Светлана Сергеевна", "жен", 50),
                new Individual("Сидоров Роман Георгиевич", "муж", 63),
                new Individual("Романов Михаил Олегович", "муж", 32),
                new Individual("Иванова Любовь Федоровна", "жен", 44),
                new Individual("Матроскин Олег Владимирович", "муж", 38),
                new Individual("Федоров Петр Олегович", "муж", 42),
                new Individual("Федоров Петр Олегович", "муж", 42),
                new Individual("Федоров Петр Олегович", "муж", 42),
        } ;
        IP[] ip = new IP[]{
                new IP("Семенов Сергей Константинович","1584965289652", 55)
        };

        Arrays.sort(individual);
        Individual[] withoutDuplicates = Utility.remoteDublicateIndividual(individual);
        System.out.println(Arrays.toString(withoutDuplicates));

        Individual[] withoutWoman = Utility.genderSort(individual, "муж");
        System.out.println(Arrays.toString(withoutWoman));
    }
}
