package prac401.task7;

class Студент extends Учащийся {
    public Студент(String name, int age) {
        super(name, age);
    }

    @Override
    public String getType() {
        return "Студент";
    }
}
