public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        print(3);
        print("hi", 2);
    }

    static void print(int a) {
        System.out.println(a);
    }

    static void print(String s, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(s);
        }
    }
}
