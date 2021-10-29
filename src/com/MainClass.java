package com;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        List<Student>students=new ArrayList<>();
        students.add(new Student(1l,"shraddha",new Course(1l,"SpringBoot"),50l));
        students.add(new Student(2l,"shravi",new Course(1l,"SpringBoot"),78l));
        students.add(new Student(1l,"shraddha",new Course(2l,"Microservice"),90l));
List<Student>studentList=students.stream().filter(o->o.getCourse().getCourseId()==1l).collect(Collectors.toList());
        System.out.println(studentList);

        OptionalDouble scoreAverage=students.stream().filter(o->o.getCourse().getCourseId()==1l)
                .mapToLong(o->o.getScore()).average();
        System.out.println(scoreAverage);

    }
}
