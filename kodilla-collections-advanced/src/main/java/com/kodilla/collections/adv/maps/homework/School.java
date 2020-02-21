package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> classStudentCounts = new ArrayList<>();
    private String name;

    public School(String name, int... classStudentCounts) {
        this.name = name;
        for (int classStudentCount : classStudentCounts)
            this.classStudentCounts.add(classStudentCount);
    }

    public String getName() {
        return name;
    }

    public int getSumOfStudentsInSchool() {
        int sum = 0;
        for (int classStudentCount : classStudentCounts) {
            sum += classStudentCount;
        }
        return sum;
    }
}

