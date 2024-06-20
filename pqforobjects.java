import java.util.*;
public class pqforobjects {
    static class Student implements Comparable<Student>{
        int rank;
        String name;
        public Student(String name ,int rank)
        {
            this.name=name;
            this.rank=rank;
        }
        @Override
        public  int compareTo(Student s1)
        {
           return this.rank-s1.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue <Student> q=new PriorityQueue<>();
        q.add(new Student("A",3));
        q.add(new Student("C",14));
        q.add(new Student("B",1));
        q.add(new Student("E",5));
        while(!q.isEmpty())
        {
            System.out.println(q.peek().name +" "+ q.peek().rank);
            q.remove();
        }
    }
}
