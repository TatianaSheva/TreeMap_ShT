import java.util.Comparator;

public class PersonComporator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        //У кого больше слов в фамилии, тот более знатен
        int word1 = o1.getSurname().split(" ").length;
        int word2 = o2.getSurname().split(" ").length;

        if (word1 != word2) {
            return Integer.compare(word2, word1);
        }

        //Если количества слов в фамилии одинаковы, то знатен больше тот, кто старше
        return Integer.compare(o2.getAge(), o1.getAge());
    }
}
