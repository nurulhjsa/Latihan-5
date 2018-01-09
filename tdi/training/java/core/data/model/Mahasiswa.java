package tdi.training.java.core.data.model;

import tdi.training.java.core.data.model.Kelas;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class Mahasiswa
{
    private String nim, nama;
    private LocalDate tanggalLahir;
    private Integer angkatan;
    private Kelas kelas;

    public String getNim(){
        return this.nim;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public String getNama(){
        return this.nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public LocalDate getTanggalLahir(){
        return this.tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    public Integer getAngkatan(){
        return this.angkatan;
    }

    public void setAngkatan(Integer angkatan){
        this.angkatan = angkatan;
    }

    public Kelas getKelas(){
        return this.kelas;
    }

    public void setKelas(Kelas kelas){
        this.kelas = kelas;
    }

    public static void main(String[] args){
    List <Kelas> list = new ArrayList<>();
        list.add(
            new Kelas("Dimas Maryanto", new Integer(2014), "Teknik Informatika"));
        list.add(
            new Kelas("Muhamad Yusuf", new Integer(2014), "Sistem Informasi"));
        list.add(
            new Kelas("Hari Sapto Adi", new Integer(2014), "Sistem Informasi"));
        list.add(
            new Kelas("Hariaty", new Integer(2014), "Teknik Informatika"));

    for(Kelas n: list){
        System.out.println(n.toString());}
    }
}