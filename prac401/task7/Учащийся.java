package prac401.task7;

abstract class Учащийся {
    protected String name;
    protected int age;

    public Учащийся(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return getType() + "{name=" + name + ", age=" + age + "}";
    }
}





