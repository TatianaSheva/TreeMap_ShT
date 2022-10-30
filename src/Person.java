public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    String getName() {
        return name;
    }

    String setName() {
        return this.name = name;
    }


    String getSurname() {
        return surname;
    }

    String setSurname() {
        return this.surname = surname;
    }

    int getAge() {
        return age;
    }

    int setAge() {
        return this.age = age;
    }

    @Override
    public String toString() {
        return "|" + name + " " + surname + " - " + age + "|";
    }
}
