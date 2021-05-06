package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Map;

public class HashMapAndHashTableTest extends TestCase {
    HashMapAndHashTable hashMapAndHashTable = new HashMapAndHashTable();
    @Test
    public void testHashMap(){
        hashMapAndHashTable.getHashmap().put(null, "test");
        try{
            hashMapAndHashTable.getHashmap().put(null, "test");
        }
        catch(Exception e){
            //two null keys cannot be inserted
            assertTrue(true);
        }
    }
    @Test
    public void testHashTable(){
        try {
            hashMapAndHashTable.getHashTable().put(null, "test");
        }
        catch (Exception e){
            //hashtable cannot have null keys
            assertTrue(true);
        }

        try {
            hashMapAndHashTable.getHashTable().put("test", null);
        }
        catch (Exception e){
            //hashtable cannot have null values
            assertTrue(true);
        }

    }
}