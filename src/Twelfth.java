
sealed class Parent permits child1,child2{
    void Imparent(){
        System.out.println("parent class it is");
    }
}
final class child1 extends Parent{
    void Iamchild1(){
        System.out.println("Child1 class it is");
    }
}
sealed class child2 extends Parent permits Grandchild{
    void Iamchild2(){
        System.out.println("Child2 it is");
    }
}
non-sealed class Grandchild extends child2{
    void Iamgrandchild(){
        System.out.println("Grand child class it is");
    }
}

class Twelfth{
    public static void main(String[] args) {
        Grandchild gc=new Grandchild();
        child1 c1=new child1();
        child2 c2=new child2();
        gc.Iamgrandchild();
        gc.Iamchild2();

        c1.Iamchild1();
        c2.Imparent();
    }
}