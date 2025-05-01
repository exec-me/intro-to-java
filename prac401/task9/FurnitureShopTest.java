package prac401.task9;

public class FurnitureShopTest {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop(5);
        shop.addFurniture(new Chair("Chair office", 150.0));
        shop.addFurniture(new Table("Computer table", 300.0));
        shop.addFurniture(new Chair("Chair smart", 50.0));

        shop.printInventory();
    }
}
