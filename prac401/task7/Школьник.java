package prac401.task7;

class Школьник extends Учащийся {
    public Школьник(String name, int age) {
        super(name, age);
    }

    @Override
    public String getType() {
        return "Школьник";
    }
}
