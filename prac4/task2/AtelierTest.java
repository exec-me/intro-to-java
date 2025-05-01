package prac4.task2;

public class AtelierTest {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Size.M, 20.99, "white"),
                new Pants(Size.L, 35.50, "black"),
                new Skirt(Size.S, 25.00, "red"),
                new Tie(Size.XS, 15.75, "blue")
        };

        Atelier atelier = new Atelier();

        atelier.dressWomen(clothes);
        System.out.println();

        atelier.dressMan(clothes);
    }
}
