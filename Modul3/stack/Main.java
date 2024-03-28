package stack;

public class Main {
    public static void main(String[] args) {

        MyDamnStack stacky = new MyDamnStack(1);

        // stack logic = last in first out

        stacky.visitURL("https://google.com");

        stacky.visitURL("https://youtube.com");

        stacky.visitURL("https://Facebook.com");

        stacky.visitURL("https://Yahoo.com");

        stacky.visitURL("https://instagram.com");

        stacky.visitURL("https://amazon.com");
        // -> last in

        System.out.println("\n====================\n");

        stacky.getCurrentURL();
        stacky.backward();
        stacky.getCurrentURL();

        System.out.println("\n====================\n");

    }

}