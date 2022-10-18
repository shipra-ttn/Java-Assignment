

public class Third { public static void main(String[] args) { SpecialStack s = new SpecialStack();
    s.push(3);
    s.push(5);
    s.getMin();
    s.push(2);
    s.push(1);
    s.getMin();
    s.pop();
    s.getMin();
    s.pop();
    s.peek();
}
}
