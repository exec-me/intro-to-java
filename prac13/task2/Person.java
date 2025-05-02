package prac13.task2;

class Person {
    private String surname;
    private String name;
    private String otch;

    public Person(String lastName, String firstName, String patronymic) {
        this.surname = lastName;
        this.name = firstName;
        this.otch = patronymic;
    }

    public String getFullName() {
        StringBuilder fullNameBuilder = new StringBuilder(surname);
        fullNameBuilder.append(" ");

        if (name != null && !name.trim().isEmpty()) {
            fullNameBuilder.append(name.charAt(0)).append(".");
            fullNameBuilder.append(" ");
        }
        if (otch != null && !otch.trim().isEmpty()) {
            fullNameBuilder.append(otch.charAt(0)).append(".");
        }
        return fullNameBuilder.toString();
    }

    public static void main(String[] args) {
        Person person1 = new Person("Joesson", "Joesson", "Jossy");
        System.out.println(person1.getFullName());

        Person person2 = new Person("Marylin", "Mary", null);
        System.out.println(person2.getFullName());

        Person person3 = new Person("Brown", null, null);
        System.out.println(person3.getFullName());
    }
}
