package org.example;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapAndHashTable {
    public Map getHashmap() {
        return hashmap;
    }

    public void setHashmap(Map hashmap) {
        this.hashmap = hashmap;
    }

    public Map getHashTable() {
        return hashTable;
    }

    public void setHashTable(Map hashTable) {
        this.hashTable = hashTable;
    }

    private Map hashmap;
    private Map hashTable;

    HashMapAndHashTable(){
        this.hashmap = new HashMap();
        this.hashTable = new Hashtable();
    }

}
