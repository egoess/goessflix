package net.apoplectic.goessflix.service;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
//@EnableAutoConfiguration
public class UpcServiceUpcItemDBImpl {//implements UpcService {

    //upcitemdb.com (free trial = 100 look ups/day, starts at $99/mon
        private String upcLookupUrl = "https://api.upcitemdb.com/prod/trial/lookup?upc=";

    //private String upcLookupUrl = ''

   // @Override
    public String getUpcJson(String upc) {

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(upcLookupUrl + upc);

        CloseableHttpResponse response1 = null;
        try {
            response1 = httpClient.execute(httpGet);
            HttpEntity entity = response1.getEntity();

            if (entity.getContentType().getValue().contains("application/json")) {
                return EntityUtils.toString(entity);
            }

        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
        } finally {
            if (response1 != null) {
                try {
                    response1.close();
                } catch (IOException ioe) {
                    System.out.println("not sure what to do yet");
                }

            }
        }

        return "nope";
    }
}
