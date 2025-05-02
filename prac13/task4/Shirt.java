package prac13.task4;

class Shirt {
    private String code;
    private String desc;
    private String color;
    private String size;

    public Shirt(String code, String desc, String color, String size) {
        this.code = code;
        this.desc = desc;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Code: " + code + "\n" +
                "Description: " + desc + "\n" +
                "Color: " + color + "\n" +
                "Size: " + size + "\n";
    }
}
