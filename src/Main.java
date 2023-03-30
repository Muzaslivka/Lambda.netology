import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Василий", "Петров", 16));
        people.add(new Person("Мирослав", "Иванов", 12));
        people.add(new Person("Екатерина", "Королёва-Остапенко", 25));
        people.add(new Person("Виктор", "Певцов-Некрасов", 23));
        people.add(new Person("Владислав", "Громов-Некрасов-Нечепуренко", 25));

        System.out.println("Неотсортированный список:");
        System.out.println(people);
        System.out.println();

        System.out.println("Отсортированный список:");
        Collections.sort(people, (person1, person2) -> {
        int length1 = person1.getSurname().split( "-").length;
        int length2 = person2.getSurname().split( "-").length;
        if (length1 < length2) {
            return -1;
        }
        if (length1 > length2) {
            return 1;
        }
        return person1.getAge() - person2.getAge();
        });

        people.forEach(System.out::println);

    }
}