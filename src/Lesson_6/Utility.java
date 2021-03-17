package Lesson_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utility {

    public static List<Individual> remoteDuplicateIndividual(List<Individual> list) {
        List<Individual> distinctList = new ArrayList<Individual>();
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(list.get(i + 1))) {
               distinctList.add(list.get(i));
            }
        }
        return distinctList;
    }

    public static List<Individual> genderSort(List<Individual> listSort, String gender) {
        List<Individual> sortGenList = new ArrayList<Individual>();
        for (int i = 0; i < listSort.size(); i++) {
            if (listSort.get(i).equals(gender)) {
                sortGenList.add(listSort.get(i)) ;
            }
        }
         return sortGenList;
    }
}

