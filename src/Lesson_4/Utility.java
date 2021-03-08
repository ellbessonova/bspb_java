package Lesson_4;

import java.util.Arrays;

public class Utility {

    public static Individual[] remoteDublicateIndividual(Individual[] individual) {
        Individual[] list = new Individual[individual.length];
        Arrays.sort(individual);
        for (int i = 0; i < individual.length - 2; i++) {
            if (!individual[i].equals(individual[i + 1])) {
                list[i] = individual[i];
            }
        }
        return list;
    }

    public static Individual[] genderSort(Individual[] individual, String gender) {
        Individual[] list = new Individual[individual.length];
        for (int i = 0; i < individual.length; i++) {
            if (individual[i].getGender().equals(gender)) {
                list[i] = individual[i];
            }
        }
        return list;
                }
           }


