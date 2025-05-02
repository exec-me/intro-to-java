package prac9.task2;

// quicksort desc.
class Sorting implements Sort {

    public void quickSort(Students[] list, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(list, low, high);
            quickSort(list, low, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, high);
        }
    }

    public int partition(Students[] list, int low, int high) {
        Students pivot = list[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (list[j].getGpa() > pivot.getGpa()) {
                i++;
                Students temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }

        Students temp = list[i + 1];
        list[i + 1] = list[high];
        list[high] = temp;

        return i + 1;
    }
}
