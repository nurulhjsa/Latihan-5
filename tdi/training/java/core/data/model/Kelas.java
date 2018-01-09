package tdi.training.java.core.data.model;

public class Kelas
{
    private String nama;
    private Integer tahunAjaran;
    private String jurusan;

    public Kelas(String nama, Integer tahunAjaran, String jurusan){
        this.nama = nama;
        this.tahunAjaran = tahunAjaran;
        this.jurusan = jurusan;
    }

    public String getNama(){
        return this.nama;
    }

    public Integer getTahunAjaran(){
        return this.tahunAjaran;
    }

    public String getJurusan(){
        return this.jurusan;
    }

    @Override
    public String toString(){
        return String.format("%s\t %s\t %s",
        nama, tahunAjaran, jurusan);
    }
}