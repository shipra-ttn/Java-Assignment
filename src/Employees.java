public class Employees {
    int age;
    String name;
    String designation;

    Employees(int age, String name, String designation) {
        this.age = age;
        this.name = name;
        this.designation = designation;
    }

    public String toString() {
        return "(age is " + age + "," + "name is " + name + "," + "desination is " + designation + ")";
    }
}

