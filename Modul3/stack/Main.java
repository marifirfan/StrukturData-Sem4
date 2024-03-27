package Tugas.stack;


/**
 * @author wacky woohoo pizza man
 */
public class Main {
    public static void main(String[] args) {

        MyDamnStack stacky = new MyDamnStack(1);

        // stack logic = last in first out

        // todo : add your stupid url by use visitURL("NameOfURL")

        // -> first in
        stacky.visitURL("https://google.com");

        stacky.visitURL("https://youtube.com");

        stacky.visitURL("https://Facebook.com");

        stacky.visitURL("https://Yahoo.com");

        stacky.visitURL("https://instagram.com"); 

        stacky.visitURL("https://devilmaycry.com");
        // -> last in

        System.out.println("\n====================\n");

        

        stacky.getCurrentURL();
        stacky.forward();
        stacky.getCurrentURL();

        System.out.println("\n====================\n");

    }
    
}