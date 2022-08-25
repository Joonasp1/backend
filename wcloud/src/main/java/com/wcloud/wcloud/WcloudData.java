package com.wcloud.wcloud;

import java.util.Map;

public class WcloudData { // Data object class
    
    private Integer id;
    private Map<String,Integer> wordData;

    public WcloudData(Map<String, Integer> wordlist, Integer id) {
        this.wordData = wordlist;
        this.id = id;
    }

    public WcloudData(Map<String, Integer> wordlist) {
        this.wordData = wordlist;
    }

    public Map<String, Integer> getWordData() {
        return wordData;
    }

    public void setWordData(Map<String, Integer> wordData) {
        this.wordData = wordData;
    }

    @Override
    public String toString() {
        String info = "";
        for ( Map.Entry<String,Integer> set : wordData.entrySet()) {
            info += set.getKey() + ": " + set.getValue().toString() + "/n";
        }
        return info;
    }    

}
