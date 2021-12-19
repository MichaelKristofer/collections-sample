package com.company.map;

import java.util.Arrays;

public class AsocMap implements Map {
    private Object[] keys = new Object[10];
    private Object[] values = new Object[10];
    private int size;

    public static void main(String[] args) {
        AsocMap asocMap = new AsocMap();
        asocMap.put("Hello 1", "Hello 11");
        asocMap.put("Hello 2", "Hello 22");
        asocMap.put("Hello 3", "Hello 33");
        asocMap.put("Hello 4", "Hello 44");
        asocMap.put("Hello 5", "Hello 55");
        System.out.println(asocMap);
        asocMap.remove("Hello 3");
        System.out.println(asocMap);
        System.out.println(asocMap.get("Hello 5"));
        System.out.println(Arrays.toString(asocMap.keys()));
        System.out.println(Arrays.toString(asocMap.values()));
        System.out.println(asocMap.containsKey("Hello 5"));
        System.out.println(asocMap.containsValue("Hello 55"));


    }

    @Override
    public Object put(Object key, Object value) {
        if (size != 0) {
            for (int i = 0; i < keys.length; i++) {
                if (keys[i] == null) {
                    keys[i] = key;
                    values[i] = values;
                    size++;
                }
                if (keys[i].equals(key)) {
                    keys[i] = key;
                    Object o = values[i];
                    values[i] = value;
                    return o;
                }
            }
        } else {
            keys[size] = key;
            values[size++] = value;
        }
        return value;
    }

    @Override
    public Object get(Object key) {
        for (int i = 0; i < keys.length; i++) {
            if (keys[i].equals(key)) {
                return values[i];
            }
        }
        return null;
    }

    @Override
    public Object remove(Object key) {
        for (int i = 0; i < keys.length; i++) {
            if (keys[i].equals(key)) {
                Object o = values[i];
                for (int i1 = i; i1 < keys.length - 1; i1++) {
                    keys[i1] = keys[i1 + 1];
                    values[i1] = values[i1 + 1];
                }
                size--;
                return o;
            }
        }
        return null;
    }

    @Override
    public Object[] keys() {
        int count = 0;
        for (int i = 0; i < keys.length; i++) {
            if (keys[i] != null) {
                count++;
            }
        }
        Object[] allKeys = new Object[count];
        for (int i = 0, j = 0; i < keys.length; i++) {
            if (keys[i] != null) {
                allKeys[j++] = keys[i];
            }
        }
        return allKeys;
    }

    @Override
    public Object[] values() {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] != null) {
                count++;
            }
        }
        Object[] allValues = new Object[count];
        for (int i = 0, j = 0; i < values.length; i++) {
            if (values[i] != null) {
                allValues[j++] = values[i];
            }
        }
        return allValues;
    }

    @Override
    public boolean containsKey(Object key) {
        for (int i = 0; i < keys.length; i++) {
            if (keys[i].equals(key)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        for (int i = 0; i < values.length; i++) {
            if (values[i].equals(value)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return "AsocMap{" +
                "keys=" + Arrays.toString(keys) +
                ", values=" + Arrays.toString(values) +
                ", size=" + size +
                '}';
    }
}