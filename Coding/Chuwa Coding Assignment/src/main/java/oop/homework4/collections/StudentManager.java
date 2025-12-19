package oop.homework4.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentManager {
    private final List<Student> students;
    private final Map<String, Student> studentMap;

    public StudentManager() {
        this.students = new ArrayList<>();
        this.studentMap = new HashMap<>();
    }

    public void addStudent(Student student) {
        Student existing = studentMap.put(student.getId(), student);
        if (existing == null) {
            students.add(student);
            return;
        }

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(student.getId())) {
                students.set(i, student);
                break;
            }
        }
    }

    public List<Student> getTopStudents(int n) {
        List<Student> copy = new ArrayList<>(students);
        copy.sort((a, b) -> Integer.compare(b.getScore(), a.getScore()));
        if (n >= copy.size()) {
            return copy;
        }
        return new ArrayList<>(copy.subList(0, n));
    }

    public Set<String> getUniqueNames() {
        Set<String> names = new HashSet<>();
        for (Student student : students) {
            names.add(student.getName());
        }
        return names;
    }

    public Map<Integer, List<Student>> groupByScore() {
        Map<Integer, List<Student>> grouped = new HashMap<>();
        for (Student student : students) {
            grouped.computeIfAbsent(student.getScore(), k -> new ArrayList<>()).add(student);
        }
        return grouped;
    }

    public boolean removeStudentById(String id) {
        Student removed = studentMap.remove(id);
        if (removed == null) {
            return false;
        }

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                students.remove(i);
                break;
            }
        }
        return true;
    }
}


