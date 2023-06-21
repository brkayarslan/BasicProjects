package CollectionAndMap.TreeSet;

import java.util.Comparator;

//nota göre sıralama
public class OrderNoteComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getNote()-o2.getNote();
    }
}
