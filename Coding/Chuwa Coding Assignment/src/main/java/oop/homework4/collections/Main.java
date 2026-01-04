package oop.homework4.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.addStudent(new Student("S01", "Alice", 95));
        manager.addStudent(new Student("S02", "Bob", 88));
        manager.addStudent(new Student("S03", "Carol", 76));
        manager.addStudent(new Student("S04", "David", 88));
        manager.addStudent(new Student("S05", "Eve", 99));
        manager.addStudent(new Student("S06", "Frank", 67));
        manager.addStudent(new Student("S07", "Grace", 95));
        manager.addStudent(new Student("S08", "Heidi", 82));
        manager.addStudent(new Student("S09", "Ivan", 76));
        manager.addStudent(new Student("S10", "Judy", 90));

        manager.addStudent(new Student("S03", "Carol-Updated", 80));

        List<Student> top3 = manager.getTopStudents(3);
        System.out.println("Top 3: " + top3);

        Set<String> uniqueNames = manager.getUniqueNames();
        System.out.println("Unique names: " + uniqueNames);

        Map<Integer, List<Student>> grouped = manager.groupByScore();
        System.out.println("Group by score: " + grouped);

        System.out.println("Remove S06: " + manager.removeStudentById("S06"));
        System.out.println("Remove SXX: " + manager.removeStudentById("SXX"));
    }
}



