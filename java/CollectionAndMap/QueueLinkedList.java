package CollectionAndMap;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
    public static void main(String[] args) {
        //polimorfizm
        Queue<String> queue = new LinkedList<>();
        queue.add("Berkay");
        queue.add("Elif");

        queue.offer("Mustafa");
        queue.offer("Cengiz");

        Iterator<String> itr = queue.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        queue.remove("Berkay");

        System.out.println(queue.element());

        // add() metodu ile kuyruğa öğe ekleme // ekleme yapılamazsa hata verir
        queue.add("Deniz"); queue.add("Berna");
        // offer() metodu ile kuyruğa öğe ekleme
        // ekleme yapılamazsa false verir
        queue.offer("Volkan"); queue.offer("Çağlar");
        // remove() metodu kuyruğun başındaki değeri verir ve onukuyruktan atar
        // Kuyruk boş ise java.util.NoSuchElementException hatasını verir.
        System.out.println("remove() : " + queue.remove());
        // element() metodu kuyruğun başındaki öğeyi verir; onu kuyruktan atmaz
        // Kuyruk boş ise java.util.NoSuchElementException hatasını verir.
         System.out.println("element() : " + queue.element());
         // poll() metodu kuyruğun başındaki öğeyi verir ve onu kuyruktan atar
        // Kuyruk boş ise false değerini verir
        System.out.println("poll() : " + queue.poll());
        // peek() metodu kuyruğun başındaki öğeyi verir; onu kuyruktan atmaz
        // Kuyruk boş ise false değerini verir
        System.out.println("peek() : " + queue.peek());
    }
}
