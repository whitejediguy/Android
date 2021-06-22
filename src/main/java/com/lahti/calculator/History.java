package com.lahti.calculator;

import java.util.HashMap;
import java.util.Map;


public class History {
    public static Map<String, Double> history;
    public boolean area = false;
    public Double value = 0.0;


//    public History(boolean area, Double value){
//        history = new HashMap<String, Double>();
//        this.area = area;
//        this.value = value;
//        history.put( (area)?"area":"volume",value );
//    }

    public History(){
        history = new HashMap<String, Double>();
    }



    public static void addItem(boolean area, Double value){
        String a = "";
        if(area)
            a="area";
        else
            a="volume";
        System.out.println(a + " " + value);
        System.out.println(a + " " + value);
        history.put( a,value );
    }

    public static Map<String, Double> getHistoryMap(){
        return history;
    }

    public static String toStringT(){
        String data = "";
        for(Map.Entry<String, Double> val : history.entrySet()){
            data += val.getKey() + "    " + val.getValue() + "\n";
        }
        return data;
    }

}
