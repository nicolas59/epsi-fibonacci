package com.epsi.b3a;

import java.util.HashMap;
import java.util.Map;

public class RecurciveFibonacci implements Fibonacci{

    private Map<Integer, Long> cache = new HashMap<>();

    public RecurciveFibonacci(){
        cache.put(0, 0l);
        cache.put(1, 1l);
    }

    @Override
    public long calculate(int n) {
        if(cache.containsKey(n)){
            return cache.get(n);
        }/* else if(n ==0){
            return 0;
        }else if(n==1){
            return 1;
        }*/
        else{
            long ret =  calculate(n-1) + calculate(n-2);
            cache.put(n, ret);
            return ret;
        }
    }
}
