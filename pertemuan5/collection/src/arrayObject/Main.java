package arrayObject;

public class Main {
    public static void main(String[] args) {
        System.out.println("Array Object");
        Mhs m1 = new Mhs("A11.2021.1", "Alif", 8.5f);
        Mhs m2 = new Mhs("A11.2021.2", "Agus", 8.4f);
        Mhs m3 = new Mhs("A11.2021.3", "Budi", 8.3f);
        Mhs m4 = new Mhs("A11.2021.4", "Cico", 8.2f);

        Mhs arrMhs[] = new Mhs[4];
        arrMhs[0] = m1;
        arrMhs[1] = m2;
        arrMhs[2] = m3;
        arrMhs[3] = m4;
        for (int i = 0; i < arrMhs.length; i++) {
            arrMhs[i].printInfo();
        }
    }
}
