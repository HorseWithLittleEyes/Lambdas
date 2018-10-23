import java.util.stream.IntStream;

public class Streams
{
    public static void main(String[] args)
    {
        System.out.println("This is to practice the usage of IntStream.");
        System.out.println("Printing all the numbers in the array,\nThen printing all numbers that are greater than 50\nand sorting it.");
        int[] values = new int[]{23,43,23,87,89,67,23,12,15,17,36,98,72,17,27,49,27};

        IntStream.of(values)
                .forEach(x -> System.out.print(x+" "));

        System.out.println("\n");

        IntStream.of(values)
                .filter(x -> x > 50)
                .sorted()
                .forEach(x -> System.out.print(x+" "));


        System.out.println("\n\nAdding all the numbers in the array together.");
        System.out.println(IntStream.of(values).sum());
        System.out.println("Getting the average of the numbers.");
        System.out.println(IntStream.of(values).average());
        System.out.println("Getting a which is adds 2 to the next number and adds them all together.");
        System.out.println(IntStream.of(values).reduce(0, (x,y) -> x + y+2));
    }
}
