package CollectionAndMap.TreeSet;

import java.util.Comparator;

//isme göre sıralama
public class OrderNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
