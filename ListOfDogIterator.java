package org.example.seminar3.cw;

import java.util.Iterator;
import java.util.List;

public class ListOfDogIterator implements Iterator<Dog> {
    private List<Dog> listOfDogIterable;
    public static int count;

    public ListOfDogIterator(List<Dog> listOfDogIterable) {
        this.listOfDogIterable = listOfDogIterable;
    }

    @Override
    public boolean hasNext() {
        return count<listOfDogIterable.size();
    }

    @Override
    public Dog next() {
        if (!hasNext()) return null;
        return listOfDogIterable.get(count);
    }
}
