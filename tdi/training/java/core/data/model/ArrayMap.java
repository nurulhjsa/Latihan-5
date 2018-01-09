package tdi.training.java.core.data.model;

import java.util.Map;
import java.util.HashMap;

public class ArrayMap
{
    public static void main(String[] args){
        Map dataMahasiswa = new HashMap();
        dataMahasiswa.put("001", "Muhamad Yusuf");
        dataMahasiswa.put("002", "Dimas Maryanto");
        dataMahasiswa.put("006", "Hari Sapto Adi");
        dataMahasiswa.put("007", "Putri Harahap");
        dataMahasiswa.put("008", "Dewa Nyoman Santosa");
        dataMahasiswa.put("009", "Hariaty");
        dataMahasiswa.put("010", "Katrina Virgi");

        dataMahasiswa.forEach( (key, value)->{
            System.out.println(" "+key+"\t"+value+"\n");
        });

        System.out.println("------------------------------");
        System.out.println(
            String.format("Nama saya %s, nipnya 010", dataMahasiswa.get("010")));
    }
}