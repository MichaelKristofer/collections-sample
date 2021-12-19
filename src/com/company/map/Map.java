package com.company.map;

public interface Map {
    Object put(Object key, Object value);
    Object get(Object key);
    Object remove(Object key);
    Object[] keys();
    Object[] values();
    boolean containsKey(Object key);
    boolean containsValue(Object value);
}
