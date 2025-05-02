package prac14.FilterTask;

public class ArrayFilter {
    public static Object[] filter(Object[] array, Filter filter) {
        int count = 0;
        for (Object o : array) {
            if (filter.apply(o)) {
                count++;
            }
        }

        Object[] result = new Object[count];
        int index = 0;
        for (Object o : array) {
            if (filter.apply(o)) {
                result[index++] = o;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Тест на строках
        String[] strings = {"a", "abc", "hello", "world", "hi"};

        Filter lengthFilter = new Filter() {
            @Override
            public boolean apply(Object o) {
                return o instanceof String && ((String) o).length() > 3;
            }
        };

        System.out.println("Start string array:");
        for (String s : strings) {
            System.out.print(s + " ");
        }

        Object[] filtered = filter(strings, lengthFilter);
        System.out.println("\nFiltered array (len>3):");
        for (Object s : filtered) {
            System.out.print(s + " ");
        }

        Integer[] numbers = {1, 5, 3, 8, 2};
        Filter evenFilter = new Filter() {
            @Override
            public boolean apply(Object o) {
                return o instanceof Integer && ((Integer) o) % 2 == 0;
            }
        };

        System.out.println("\n\nStart nums array:");
        for (Integer n : numbers) {
            System.out.print(n + " ");
        }

        filtered = filter(numbers, evenFilter);
        System.out.println("\nFiltered array (even):");
        for (Object n : filtered) {
            System.out.print(n + " ");
        }
    }
}
