import java.util.*;

public class Main {
    private static final int MINIMUM_AGE = 18;

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Дмитрий", "Рождественский", 56));
        people.add(new Person("Александр", "Ив Сен Лоран", 16));
        people.add(new Person("Владимир", "Быстрый", 28));
        people.add(new Person("Леонид", "Рождественский", 71));
        people.add(new Person("Евгений", "Ли Сунь Хо Инь", 36));
        people.add(new Person("Иван", "Ив Сен Лоран", 12));

        System.out.println(people);

        //Удалить в списке людей, которые младше 18 лет.
        // Но мы не будем для этого сами проходиться по списку, воспользуемся методом removeIf:
        //Метод перебирает коллекцию, и удаляет те элементы, которые соответствуют фильтру
        people.removeIf(person -> person.getAge() < MINIMUM_AGE);

        System.out.println(people);

    }
}
