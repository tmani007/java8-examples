package com.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestMain {

    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(
                new Student(119,"mani",60000,66.36),
                new Student(101,"raj",55000,56.03),
                new Student(109,"mani",60000,66.36),
                new Student(103,"kamal",46500,55.77),
                new Student(133,"shalini",33000,76.22),
                new Student(111,"honey",77000,37.09),
                new Student(121,"gill",27000,41.46),
                new Student(123,"shalini",33000,76.22),
                new Student(125,"hary",44000,91.45),
                new Student(113,"tarzan",13000,26.22)
        );


//        Map<String, Long> map = studentList.stream().map(Student::getName)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) ;
//                //.forEach(System.out::println);
//                System.out.println(map);

//        Map<Double, Long> map = studentList.stream()
//                .collect(Collectors.groupingBy(Student::getPercentage, Collectors.counting())) ;
//        //.forEach(System.out::println);
//        System.out.println(map);

        Map<String, Map<Double, List<Student>>> map = studentList.stream()
                .collect(Collectors.groupingBy(Student::getName, Collectors.groupingBy(Student::getPercentage)));
        //.forEach(System.out::println);
        System.out.println(map);
        System.out.println("testing git");

    }
}
