package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        List<Task> tasks = TaskRepository.getTasks();
        System.out.println("tasks = " + tasks);
        List<Task> notExpiredTasks = tasks.stream()
                .filter(t -> t.getDeadline().isAfter(currentDate))
                .collect(Collectors.toList());
        System.out.println("notExpiredTasks = " + notExpiredTasks);
    }
}
