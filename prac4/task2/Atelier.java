package prac4.task2;


enum Size {
    XXS(32) {
        @Override
        public String getDescription() {
            return "Child size";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    private final int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription() {
        return "Adult size";
    }
}

interface MenClothing {
    void dressMan();
}

interface WomenClothing {
    void dressWomen();
}

abstract class Clothes {
    protected Size size;
    protected double price;
    protected String color;

    public Clothes(Size size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
}

class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("Male t-shirt: size %s (eur %d), price %.2f, color %s%n",
                size, size.getEuroSize(), price, color);
    }

    @Override
    public void dressWomen() {
        System.out.printf("Female t-shirt: size %s (eur %d), price %.2f, color %s%n",
                size, size.getEuroSize(), price, color);
    }
}

class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("Male pants: size %s (eur %d), price %.2f, color %s%n",
                size, size.getEuroSize(), price, color);
    }

    @Override
    public void dressWomen() {
        System.out.printf("Female pants: size %s (eur %d), price %.2f, color %s%n",
                size, size.getEuroSize(), price, color);
    }
}

class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.printf("Skirt: size %s (eur %d), price %.2f, color %s%n",
                size, size.getEuroSize(), price, color);
    }
}

class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("Tie: size %s (eur %d), price %.2f, color %s%n",
                size, size.getEuroSize(), price, color);
    }
}

class Atelier {

    public void dressWomen(Clothes[] clothes) {
        System.out.println("Female clothes:");
        for (Clothes item : clothes) {
            if (item instanceof WomenClothing) {
                ((WomenClothing) item).dressWomen();
            }
        }
    }

    public void dressMan(Clothes[] clothes) {
        System.out.println("Male clothes:");
        for (Clothes item : clothes) {
            if (item instanceof MenClothing) {
                ((MenClothing) item).dressMan();
            }
        }
    }
}



