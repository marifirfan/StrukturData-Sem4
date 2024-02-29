package Latihan;

import java.util.ArrayList;
import java.util.List;

public class contoh1 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("data1");
        list.add(100);

        String data = (String) list.get(0);
        int angka = (Integer) list.get(1);

        System.err.println(data);
    }
}
