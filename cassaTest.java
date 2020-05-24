package com.company;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


class cassaTest {



    @Test
    void takeReceipt() {
        cassa cas=new cassa();
        cas.AddProduct("apple",2);
        cas.AddProduct("milk",3);
        cas.AddProduct("milk",4);
        cas.AddProduct("apple",3);
        Map<String,Integer>  map=cas.TakeReceipt();
        assertEquals(5,map.get("apple"));
        assertEquals(7,map.get("milk"));


    }
}
