package com.efimchick.ifmo.collections;

import java.util.*;

class PairStringList implements List {

    private int indexShift = 0;
    private List<Object> list = new ArrayList<>();


    @Override
    public String toString() {
        return list.toString();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return list.listIterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        list.add(o);
        list.add(o);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        list.remove(o);
        list.remove(o);
        return true;
    }

    @Override
    public boolean addAll(Collection c) {
        list.addAll(c);
        list.addAll(c);
        return true;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        list.addAll(index, c);
        list.addAll(index, c);
        return false;
    }

    @Override
    public void clear() {
        list.clear();
        indexShift = 0;
    }

    @Override
    public Object get(int index) {
        return list.get(index);
    }

    @Override
    public Object set(int index, Object element) {
        if (index % 2 == 0) {
            list.set(index, element);
            list.set(index + 1, element);
        } else {
            list.set(index, element);
            list.set(index - 1, element);
        }
        return list;
    }

    @Override
    public void add(int index, Object element) {
        if (index % 2 == 0) {
            list.add(index, element);
            list.add(index, element);
        } else {
            list.add(index + 1, element);
            list.add(index + 1, element);
        }
    }

    @Override
    public Object remove(int index) {
        list.remove(index);
        list.remove(index - 1);
        return list;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
