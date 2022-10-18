import java.util.stream.IntStream;

public class Fifth {
    public static void main(String[] args) {

        IntStream
                .rangeClosed(1,10)
                .filter(e->e>5)
                .findFirst()
                .ifPresentOrElse(
                        (e)-> System.out.println("value is "+e),
                        ()-> System.out.println("value doesnot exist")
                );

        IntStream
                .rangeClosed(1,10)
                .filter(e->e>50)
                .findFirst().orElseThrow();
    }
}
