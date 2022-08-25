package com.wcloud.wcloud;

import org.springframework.stereotype.Service;

@Service
public class WcloudService { //This class will query wordclouds from the database with an identifier
    
    public WcloudData GetData(){
        return WcloudConverter.ProcessText("This is a test sentence. This should become a wordcloud data object.");
    }
}
