package prac14;

import java.util.ArrayList;
import java.util.Arrays;

interface Filter {
    boolean apply(Object o);
}

class FilterExample {
    public static <T> T[] filter(T[] array, Filter filter) {
        ArrayList<T> filteredList = new ArrayList<>();

        for (T item : array) {
            if (filter.apply(item)) {
                filteredList.add(item);
            }
        }

        return filteredList.toArray(Arrays.copyOf(array, filteredList.size()));
    }

    public static void main(String[] args) {
        String[] strings = {"cat", "dog", "mouse", "bird", "elephant"};
        Filter lengthFilter = new Filter() {
            @Override
            public boolean apply(Object o) {
                return ((String) o).length() >= 4;
            }
        };
        String[] filteredStrings = filter(strings, lengthFilter);
        System.out.println("Filtered strings (length >= 4): " + Arrays.toString(filteredStrings));

        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        Filter evenFilter = new Filter() {
            @Override
            public boolean apply(Object o) {
                return ((Integer) o) % 2 == 0;
            }
        };
        Integer[] filteredNumbers = filter(numbers, evenFilter);
        System.out.println("Filtered numbers (even only): " + Arrays.toString(filteredNumbers));
    }
}
