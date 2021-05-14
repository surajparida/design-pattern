package com.mi.patterns.behavioral.command.search;

import java.util.HashMap;
import java.util.Map;

public class SearchForm {

   private Map<String,String> paramerters = new HashMap<String,String>();

    public void setParameter(String name, String value){
        paramerters.put(name, value);
    }

    public Map<String, String> getParamerters() {
        return paramerters;
    }
}
