package tdi.training.java.core.data.model;

import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;

public class Arraylist
{
    public static void main(String[] args){
        List value = new ArrayList();
        value.add(1);
        value.add(3);
        value.add(5);
        value.add(10);
        value.add(1);
        value.add(20);
        value.add(10);
        value.add(1);
        value.add(20);
        value.add(9);
        value.add(1);

        System.out.print("Index ke 0 adalah "+value.get(0));
        System.out.print(", index ke 1 adalah "+value.get(1));
        System.out.print(", dan index ke 3 adalah "+value.get(3));

    System.out.println();
    System.out.println("-------------------------------------------------");
    int [] values = {1, 3, 5, 10, 1, 20, 10, 1, 20, 9, 1};
    for(int i=0; i<values.length; i++){
        if(values[i] % 2!= 0){
        System.out.print(values[i]+ " ");
        }
    }
    System.out.println(" ");
    }
}
