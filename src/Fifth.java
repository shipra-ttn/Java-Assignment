public class Fifth {
    String firstname,lastname,designation;
    int age;
    Fifth()
    {
        this.firstname= "Sshipra";
        this.lastname="Ssharma";
        this.age=22;
        this.designation="Software Engineer";
    }
    Fifth(String fn,String ln,int a,String des)
    {
        this.firstname=fn;
        this.lastname=ln;
        this.age=a;
        this.designation=des;
}

    void setFirst_name(String N){
        this.firstname=N;
    }
    String getFirst_name()
    { return firstname;
    }

    void setLast_name(String N){
        this.lastname=N;
    }

    String getLast_name()
    { return lastname;
    }

    public void display()
    {
        System.out.println("Firstname: "+this.firstname);
        System.out.println("Lastname: "+this.lastname);
        System.out.println("Age: "+this.age);
        System.out.println("Designation: "+this.designation);
        System.out.println();
    }

    public String toString(){
        return this.firstname+" "+this.lastname+" of age "+this.age+" has a designation of "+this.designation;
    }

    public static void main(String[] args) {
        //  Hello_world.print();
        Fifth obj = new Fifth();
        Fifth onj2=new Fifth("Radha", "Raman", 23,"doctor");
        obj.setFirst_name("Shipra");
        obj.setLast_name("Sharma");

        String s=obj.getFirst_name();
        String s2=obj.getLast_name();

        System.out.println(s+" "+s2);
        obj.display();
        onj2.display();
        System.out.println(obj.toString());
    }
}





