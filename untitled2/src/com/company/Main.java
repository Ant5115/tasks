package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Task task1 = new Task();
        task1.setTitle("Учить JAVA");
        task1.setDescription("Прочитать книгу по Java");
        task1.setCompleted(false);


        Task task2 = new Task("Написать код", "Прочитать код", true);

        Task task3 = new Task("Приложение на Java", "Статья про Java", true);

        List<Task> tasks = new ArrayList<>();
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);


//        for (Task t : tasks) {
//            System.out.println(t.getTitle());
//        }

//        for (Task t : tasks) {
//            if(t.isCompleted()) {
//                System.out.println(t.getDescription());
//            }
//        }

        Author author1 = new Author();
        author1.setName("Иван");
        author1.setLastName("Иванов");
        author1.setAge(45);


        Author author2 = new Author();
        author2.setName("Иван");
        author2.setLastName("Иванов");
        author2.setAge(37);

        task3.setAuthor(author1);
        task2.setAuthor(author2);

        for (Task t : tasks) {
            Author a = t.getAuthor(); //null
            if (a != null && a.getAge() > 40) {
                System.out.println(t.getTitle());
            }

        }

    }
}
