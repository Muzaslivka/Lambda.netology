import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Василий", "Петров", 16));
        people.add(new Person("Мирослав", "Иванов Петров Сидоров", 12));
        people.add(new Person("Екатерина", "Королёва Остапенко", 20));
        people.add(new Person("Виктор", "Певцов Некрасов", 23));
        people.add(new Person("Владислав", "Громов", 25));

        System.out.println("Неотсортированный список:");
        System.out.println(people);
        System.out.println();

        System.out.println("Отсортированный список:");
        Collections.sort(people, new PersonComparator(3));
        System.out.println(people);
    }
}