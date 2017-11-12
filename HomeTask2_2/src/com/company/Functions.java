package com.company;

import java.lang.String;
import java.util.*;

public class Functions {
    public static void SortById(List<People> peoples) {
       Collections.sort(peoples, new Comparator<People>() {
            public int compare(People o1, People o2) {
                return Integer.compare(o1.getId(), o2.getId());
            }
        });
    }

    public double averageAge(List<People> peoples){
        double averageAge = 0;
        double allAge = 0;
        for (People people : peoples){
            allAge += people.getAge();
            averageAge = allAge/peoples.size();
        }

        return averageAge;
    }

    public static void SearchByLetter(List<People> peoples, String letter) {
        List<String> firstLetter = new ArrayList();
        String symbol = letter.toLowerCase();

        for (int i=0; i< peoples.size();i++) {
           String name = peoples.get(i).getLastName().toLowerCase();

            if(name.startsWith(symbol)) {
                firstLetter.add(peoples.get(i).getLastName());
            }

        }
        System.out.println(firstLetter);
    }

}
