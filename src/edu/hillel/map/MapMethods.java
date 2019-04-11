package edu.hillel.map;

import java.util.Map;
import java.util.Set;

public class MapMethods {

    private MapMethods() {
    }

    public static void showMapEntrySet(Map map) {
        System.out.println("Implementation with entrySet");
        System.out.println();
        Set<Map.Entry<Integer, String>> setKeyValue = map.entrySet();
        for (Map.Entry keyValue : setKeyValue) {
            System.out.println(keyValue.getKey() + " : " + keyValue.getValue());
        }
    }

    public static void showMapKeySet(Map map) {
        System.out.println("Implementation with keySet");
        System.out.println();
        Set<Integer> key = map.keySet();
        for (Integer idPhone : key) {
            System.out.println(idPhone + " - " + map.get(idPhone));
        }
    }
}



