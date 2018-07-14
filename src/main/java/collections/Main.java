package collections;

import collections.pojo.Person;

import java.util.*;

public class Main {

    public static void main(String[] args) {




      //LIST
      List<Person> people = loadList(); //ladujemy liste przykladowymi obiektami.
        view(people);


        Collections.shuffle(people); //tasowanie
        view(people);


        Collections.reverse(people);
        view(people);


        Collections.sort(people); //sortowanie. wymaga implementacji Comparable
        view(people);


        Person person1 = new Person("Sylwia", "sylwia@wp.pl", 20);
        Person person2 = new Person("Ola", "ola@wp.pl", 34);
        System.out.println(people.contains(person1)); //wymaga implementacji equals
        System.out.println(people.contains(person2));


        //usuwanie obiektow z kolekcji.
        removeObjectFromCollection(people,23);
        removeObjectFromCollection(people, new Person("Agata", "agata@wp.pl", 31));


        //SET
        System.out.println("SET:"); //SET wymaga implementacji hashcode i equals.

        Set<Person> personSet = loadSet();
        view(personSet);

        removeObjectFromCollection(personSet, 30); // usuwanie z SET

        //MAP
        Map<Integer, Person> personMap = loadMapList(loadList()); //ladujemy mapę kolekcja z metody.
        viewMap(personMap);

        personMap.forEach((k,v) -> System.out.println("Klucz: " + k + "; Wartość: " + v)); //iteracja lambdą. Stream.


    }


    // =================== metody pomocnicze ================================


    public static void view(Collection<Person> people) {
        for(Person p: people) {
            System.out.println(p);
        }
        System.out.println();
    }

    public static Collection<Person> removeObjectFromCollection(Collection<Person> people, int value) {
        System.out.println(" ========== remove ===================");
        System.out.println();
        System.out.println("removed from collection: ");
        for(Iterator<Person> iter = people.iterator(); iter.hasNext();) {
            Person p = iter.next();

            if(p.getAge() < value) {
                iter.remove();
                System.out.println(p);
            }
        }
        System.out.println(" ========== END remove ===================");
        System.out.println();
        return people;
    }

    public static Collection<Person> removeObjectFromCollection(Collection<Person> people, Person person) {
        System.out.println(" ========== remove ===================");
        System.out.println();
        System.out.println("removed from collection: ");
        for(Iterator<Person> iter = people.iterator(); iter.hasNext();) {
            Person p = iter.next();

            if(p.equals(person)) {
                iter.remove();
                System.out.println(p);
            }
        }
        System.out.println(" ========== END remove ===================");
        System.out.println();
        return people;
    }


    // =================== przykladowe obiekty ================================

    public static List<Person> loadList() {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Magda", "magda@wp.pl", 28));
        people.add(new Person("Iza", "iza@wp.pl", 22));
        people.add(new Person("Agata", "agata@wp.pl", 31));
        people.add(new Person("Monika", "monika@wp.pl", 23));
        people.add(new Person("Beata", "beata@wp.pl", 19));
        people.add(new Person("Ola", "ola@wp.pl", 34));

        //duplikaty do testu metod.
        people.add(new Person("Monika", "monika@wp.pl", 23));
        people.add(new Person("Beata", "beata@wp.pl", 19));
        people.add(new Person("Ola", "ola@wp.pl", 34));

        return people;
    }

    public static Set<Person> loadSet() {

        Set<Person> people = new LinkedHashSet<>();
        people.add(new Person("Magda", "magda@wp.pl", 28));
        people.add(new Person("Iza", "iza@wp.pl", 22));
        people.add(new Person("Agata", "agata@wp.pl", 31));
        people.add(new Person("Monika", "monika@wp.pl", 23));
        people.add(new Person("Beata", "beata@wp.pl", 19));
        people.add(new Person("Ola", "ola@wp.pl", 34));

        //duplikaty do testu metod.
        people.add(new Person("Monika", "monika@wp.pl", 23));
        people.add(new Person("Beata", "beata@wp.pl", 19));
        people.add(new Person("Ola", "ola@wp.pl", 34));

        return people;
    }


    public static Map<Integer, Person> loadMapList(Collection<Person> people){
        Map<Integer, Person> personMap = new HashMap<>();
        int id = 0;
        for(Person p: people) {
            id++;
            personMap.put(id, p);
        }
        return personMap;
    }

    public static void viewMap(Map<Integer, Person> personMap) {
        System.out.println("============= VIEW MAP ===================");

        for(Map.Entry<Integer, Person> ip: personMap.entrySet()) {
            System.out.println("key: " + ip.getKey() + " value: " + ip.getValue());
        }
        System.out.println("============= END VIEW MAP ===================");
    }



}
