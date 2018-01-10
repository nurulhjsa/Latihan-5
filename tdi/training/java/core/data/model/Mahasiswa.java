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

    public Mahasiswa(
                    String nim,
                    String nama,
                    LocalDate tanggalLahir,
                    Integer angkatan,
                    Kelas kelas){
        this.nim = nim;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.angkatan = angkatan;
        this.kelas = kelas;
    }

    public String getNim(){
        return this.nim;
    }

    public String getNama(){
        return this.nama;
    }

    public LocalDate getTanggalLahir(){
        return this.tanggalLahir;
    }

    public Integer getAngkatan(){
        return this.angkatan;
    }

    public Kelas getKelas(){
        return this.kelas;
    }

    public String toString(){
        return String.format(
            "| %s\t| %s | %s\t| %s\t| %s\t| %s|",
            this.nim,
            this.nama,
            this.tanggalLahir,
            this.angkatan,
            this.kelas.getNama(),
            this.kelas.getJurusan()
        );
    }
}