package com;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CourseOnDateBase {
    public static void main(String[] args) {

        List<Course> courses=new ArrayList<>();
        courses.add(new Course(1l,"SpringBoot", LocalDate.of(2021,10,27),
        LocalDate.of(2021,12,27)));
        courses.add(new Course(1l,"SpringBoot",LocalDate.of(2021,11,28),
        LocalDate.of(2021,12,27)));
        courses.add(new Course(2l,"Microservice",LocalDate.of(2021,10,27),
        LocalDate.of(2021,12,27)));

        Predicate<Course>isMoreThanWeek=s->s.getStartDate().getMonth().
                equals(LocalDate.now().plus(1, ChronoUnit.WEEKS).getMonth());

        Predicate<Course>isMoreThanMonth=s->s.getStartDate().getMonth().
                equals(LocalDate.now().plus(1, ChronoUnit.MONTHS).getMonth());

        List<Course>courseList=courses.stream().filter(isMoreThanWeek).collect(Collectors.toList());

        courseList.forEach(res-> System.out.println(res));
    }
}
