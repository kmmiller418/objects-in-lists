public class App {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        counter1.increase();
        System.out.println("Counter 1: " + counter1.value());
        counter1.increase(4);
        System.out.println(counter1.value());
        counter1.increase(-3);
        System.out.println(counter1.value());

        Counter counter2 = new Counter(7);
        counter2.decrease();
        System.out.println("Counter 2 value: " + counter2.value());
        counter2.decrease(2);
        System.out.println(counter2.value());
        counter2.decrease(-7);
        System.out.println(counter2.value());
    }
}
