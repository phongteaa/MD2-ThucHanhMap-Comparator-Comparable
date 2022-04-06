package thuchanh2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("An", 46, "Vietnam");
        Student student2 = new Student("Hung", 11, "Thai");
        Student student3 = new Student("Kien", 23, "Laos");

        List<Student> myList = new ArrayList<>();
        myList.add(student1);
        myList.add(student2);
        myList.add(student3);
        Collections.sort(myList);
        for (Student st : myList) {
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        myList.sort(ageComparator);
        System.out.println("So sanh theo tuoi: ");
        for (Student st: myList) {
            System.out.println(st.toString());
        }

//        Map<Integer, Student> studentMap = new HashMap<>();
//        studentMap.put(1, student1);
//        studentMap.put(2, student2);
//        studentMap.put(3, student3);
//        studentMap.put(4, student1);
//
//        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
//            System.out.println(student.toString());
//        }
//        System.out.println("...........Set");
//        Set<Student> students = new HashSet<>();
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//        students.add(student1);
//
//        for (Student student : students) {
//            System.out.println(student.toString());
//        }
    }
}
