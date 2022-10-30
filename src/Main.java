import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Дмитрий", "Рождественский", 56));
        people.add(new Person("Александр", "Ив Сен Лоран", 16));
        people.add(new Person("Владимир", "Быстрый", 28));
        people.add(new Person("Леонид", "Рождественский", 71));
        people.add(new Person("Евгений", "Ли Сунь Хо Инь", 36));

        System.out.println(people);

        Collections.sort(people, new PersonComporator());

        System.out.println(people);

    }
}
