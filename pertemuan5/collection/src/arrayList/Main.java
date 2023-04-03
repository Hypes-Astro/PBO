package arrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Array List");
        Mhs m1 = new Mhs("A11.2021.1", "Alif", 8.5f);
        Mhs m2 = new Mhs("A11.2021.2", "Agus", 8.4f);
        Mhs m3 = new Mhs("A11.2021.3", "Budi", 8.3f);
        Mhs m4 = new Mhs("A11.2021.4", "Cico", 8.2f);

        ArrayList<Mhs> listm = new ArrayList<Mhs>();
        listm.add(m1);
        listm.add(m2);
        listm.add(m3);
        listm.add(m4);

        for (int i = 0; i < listm.size(); i++) {
            listm.get(i).printInfo();
        }
    }
}
