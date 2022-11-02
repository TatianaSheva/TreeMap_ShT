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

        people.sort((o1, o2) -> {
            //У кого больше слов в фамилии, тот более знатен
            int word1 = o1.getSurname().split(" ").length;
            int word2 = o2.getSurname().split(" ").length;

            if (word1 != word2) {
                return Integer.compare(word2, word1);
            }

            //Если количества слов в фамилии одинаковы, то знатен больше тот, кто старше
            return Integer.compare(o2.getAge(), o1.getAge());
        });

        System.out.println(people);
    }
}


