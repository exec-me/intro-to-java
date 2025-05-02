package prac9.task2;

interface Sort {
    void quickSort(Students[] list, int low, int high);
    int partition(Students[] list, int low, int high);
}
