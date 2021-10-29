package com;

public class Student {
    private Long id;
    private String name;
    private Course course;
    private  Long score;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course=" + course +
                ", score=" + score +
                '}';
    }

    public Student() {
    }

    public Student(Long id, String name, Course course, Long score) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.score = score;
    }
}
