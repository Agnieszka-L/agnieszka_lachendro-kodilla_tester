package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("get cat food", LocalDate.of(2020, 3, 22), LocalDate.of(2020, 3, 27)));
        tasks.add(new Task("write a report", LocalDate.of(2020, 3, 21), LocalDate.of(2020, 3, 24)));
        tasks.add(new Task("call Annie", LocalDate.of(2020, 3, 15), LocalDate.of(2020, 3, 16)));
        tasks.add(new Task("write an essay", LocalDate.of(2020, 3, 17), LocalDate.of(2020, 3, 24)));
        tasks.add(new Task("do a laundry", LocalDate.of(2020, 3, 22), LocalDate.of(2020, 3, 23)));
        tasks.add(new Task("read a book", LocalDate.of(2020, 3, 1), LocalDate.of(2021, 4, 22)));
        return tasks;
    }
}

