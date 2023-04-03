package LatihanArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<String>();

        // add element
        obj.add("Amir");
        obj.add("Hair");
        obj.add("Budi");
        obj.add("Abu");
        obj.add("cici");

        System.out.println("Element Array list : " + obj);
        System.out.println("-------------------");
        // update element
        obj.set(3, "Salamat");
        System.out.println("-------------------");

        // posisi index
        int pos = obj.indexOf("Hair");
        int pos2 = obj.indexOf("NENE");
        System.out.println("Hair ada di : " + pos);
        System.out.println("NENE ada di : " + pos2);
        System.out.println("-------------------");

        // get element
        String str = obj.get(2);
        System.out.println("elemen index ke 2 adalah : " + str);
        System.out.println("-------------------");

        // size
        int jmlElm = obj.size();
        System.out.println("Jumlah element : " + jmlElm);
        System.out.println("-------------------");

        // cari leement
        boolean ada = obj.contains("Abu");
        System.out.println("Status element: " + ada);

        // add element
        obj.add(0, "Rayhan");
        obj.add(1, "jujuk");

        // remove
        obj.remove("Hair");
        obj.remove("Abu");
        System.out.println("Elemen array list: " + obj);

        // remove element
        obj.remove(1);
        System.out.println("Element: " + obj);

    }
}
