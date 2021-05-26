package Exercises;

import java.util.*;

public class ex22 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1","Yura");
        map.put("2","Ira");
        map.put("3","Andriy");
        map.put("4","Igjr");
        map.put("5","Ivan");
        map.put("6","Slavik");
        map.put("7","Sveta");
        Scanner s=new Scanner(System.in);
        System.out.println("Веддіть свій ID");
        int num=0;
        String id=s.nextLine();
        for (Map.Entry<String,String> entry:map.entrySet()) {

            if (entry.getKey().equals(id)) {
                System.out.println(entry.getValue());
                num++;
            }
        }
            if (num==0) {
                System.out.println("I can't find your ID");
            }

            }
        }



