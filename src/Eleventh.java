import java.util.Objects;

 record Student(String name, int id, int age) {
     static int counter = 0;

     static void incrementCounter() {
         counter++;
     }

        Student{
            Objects.requireNonNull(name);
            Objects.requireNonNull(id);
            Objects.requireNonNull(age);
            incrementCounter();
        }
    }

public class Eleventh {
    public static void main(String[] args) {
        Student s1=new Student("Shipra",20,22);
        Student s2=new Student("Harsha",30,24);
        Student s3=new Student("Varsha",40,26);
        Student s4=new Student("Mridul",50,27);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s1.equals(s3));
        System.out.println(Student.counter);
    }
}
