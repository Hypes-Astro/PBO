package com;

public class Constructor {
    private String nim, nama, jurusan;
    private int semester;

    public Constructor(String nim, String nama, String jurusan, int semester) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.semester = semester;
    }

    public Constructor() {
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

}
