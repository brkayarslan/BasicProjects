package CollectionAndMap.TreeSet;

import java.util.TreeSet;

public class StudentMain {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new OrderNoteComparator());
        //TreeSet<Student> students = new TreeSet<>(new OrderComparator().reversed()); Tersten sıralama yapar
        students.add(new Student("Berkay",20));
        students.add(new Student("Ahmet",100));
        students.add(new Student("Elif",80));
        students.add(new Student("Mehmet",75));
        students.add(new Student("Elif",60));

        for (Student s : students) {
            System.out.println(s.getNote());
        }
    }
}
