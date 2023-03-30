import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Василий", "Петров", 16));
        people.add(new Person("Мирослав", "Иванов", 12));
        people.add(new Person("Екатерина", "Королёва-Остапенко", 25));
        people.add(new Person("Виктор", "Певцов-Некрасов", 23));
        people.add(new Person("Владислав", "Громов-Некрасов-Нечепуренко", 25));

        people.removeIf(person -> person.getAge() < 18);

        people.forEach(System.out::println);

    }
}