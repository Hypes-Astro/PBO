public class Student extends People{
    Student(){

    }
    Student (String nama, double test1, double test2, double test3, String department){
        this.nama = nama;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
        this.department = department;
    }
    void setNama(String nama){
        this.nama = nama;
    }
    String getNama(){
        return nama;
    } 
    void tampil(){
        System.out.println(getNama());
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
    }
}