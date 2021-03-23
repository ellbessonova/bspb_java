package Lesson_7;

import java.util.Comparator;
import java.util.List;

public class Utility {
    public static void individualStream (List<Individual> individual, String gender){
        individual.stream()
                .sorted(Comparator.comparing(Individual::getAge))
                .distinct()
                .filter(o -> o instanceof Individual)
                .filter(o -> o.getGender().equals(gender))
                .forEach(System.out::println);
    }
}
