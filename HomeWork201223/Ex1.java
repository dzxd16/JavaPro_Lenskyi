package de.telran.HomeWork201223;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Ex1 {
    public static void main(String[] args) {
//        1) Дан лист строк "BigBen", "BigBob", "Big", "Ben", "Big Bob".
//                Сколько раз объект «Big» встречается в коллекции?
        List<String> list = Arrays.asList("BigBen", "BigBob", "Big", "Ben", "Big Bob");

        list.stream().peek(System.out::println);

        int rez = list.stream().filter(k -> k.indexOf("Big") != -1).toList().size();
        long rez1 = list.stream().filter(k -> k.indexOf("Big") != -1).count();
        System.out.println("вариант 1 = " + rez);
        System.out.println("вариант 2 = " + rez1);

//        2) Найти самый маленький элемент: Arrays.asList("a1", "b5", "a2", "b4")
        List<String> list1 = Arrays.asList("a1", "b5", "a2", "b4");

        String rez2 = String.valueOf(list1.stream()
                .min(String::compareTo));

        System.out.println("вариант1 min " + rez2);

        String rez2_1 = String.valueOf(list1.stream()
//                .peek(el -> System.out.println("Element = " + el))
                .sorted()
                .limit(1)
                .toList());

        System.out.println("вариант2 min " + rez2_1);

//        3) Выполнить сортировку в обратном алфавитном порядке и удалить дубликаты.
//                Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
        List<String> list2 = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");

        List<String> rez3 = list1.stream()
//                .peek(el -> System.out.println("Element = " + el))
                .sorted(Comparator.reverseOrder())
                .toList();


        System.out.println("rez3 " + rez3);

    }
}
