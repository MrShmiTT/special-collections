package com.efimchick.ifmo.collections;

import java.util.*;

public class SortedByAbsoluteValueIntegerSet extends HashSet<Integer> {

    private Set<Integer> mySet;

    public SortedByAbsoluteValueIntegerSet() {
        mySet = new HashSet<>();
    }

    @Override
    public int size() {
        return mySet.size();
    }

    @Override
    public boolean add(Integer e) {
        return mySet.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return mySet.remove(o);
    }

    @Override
    public boolean contains(Object o) {
        return mySet.contains(o);
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        List<Integer> myList = new ArrayList<>();
        for (Integer e : c) {
            myList.add(e);
        }
        return mySet.addAll(myList);
    }

    @Override
    public String toString() {
        return mySet.toString();
    }

    @Override
    public Spliterator<Integer> spliterator() {
        return mySet.spliterator();
    }
}