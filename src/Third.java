import java.util.stream.IntStream;

public class Third {
    public static void main(String[] args) {
        System.out.print("Without range closed");

        IntStream.range(1,10)
                .forEach(System.out::println);

        System.out.print("With range closed");
        IntStream.rangeClosed(1,10)
                .forEach(System.out::println);
    }
}
