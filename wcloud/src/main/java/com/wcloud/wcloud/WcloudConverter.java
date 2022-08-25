package com.wcloud.wcloud;

import java.util.HashMap;
import java.util.Map;

public class WcloudConverter { // This class handles the text to data logic
    

    public static WcloudData ProcessText(String text){
        Map<String,Integer> wordlist = new HashMap<String,Integer>();

        for (String word : text.toLowerCase().replace(".", "").split(" ")) {
            if(wordlist.containsKey(word)){
                wordlist.put(word, wordlist.get(word) + 1);
            }
            else wordlist.put(word, 1);
        }

        WcloudData worddata = new WcloudData(wordlist);
        return worddata;
    }

}
