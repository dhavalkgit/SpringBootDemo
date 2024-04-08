package com.example.springbootfirstproject.Services;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;

@Service
public class ApiService {
    public String makeRequest(String url){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()){
            if(response.isSuccessful()) return response.body().string();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return "Something went wrong....";
    }
}
