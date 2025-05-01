package prac401.task9;

class FurnitureShop {
    private Furniture[] items;
    private int size;

    public FurnitureShop(int capacity) {
        items = new Furniture[capacity];
        size = 0;
    }

    public void addFurniture(Furniture furniture) {
        if (size < items.length) {
            items[size++] = furniture;
            System.out.println("Added: " + furniture);
        } else {
            System.out.println("Shop is full!");
        }
    }

    public void printInventory() {
        System.out.println("Shop inventory:");
        for (int i = 0; i < size; i++) {
            System.out.println(items[i]);
        }
    }
}
