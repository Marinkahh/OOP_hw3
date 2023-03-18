package org.example.seminar3.cw;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListOfDogs listDogs = new ListOfDogs();
        List<Dog> ArrayList = new ArrayList<>();
        listDogs.setListDogs(ArrayList);
        ArrayList.add( new Dog("Бобик", 6));
        ArrayList.add (new Dog("Шарик", 5));
        ArrayList.add (new Dog("полкан", 7));
        Collections.sort(ArrayList);
        while (listDogs.iterator().hasNext() ){
            System.out.println(listDogs.iterator().next());
            ListOfDogIterator.count++;
        }
    }
}
