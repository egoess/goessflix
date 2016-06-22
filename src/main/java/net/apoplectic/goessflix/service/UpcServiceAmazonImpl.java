package net.apoplectic.goessflix.service;

import net.apoplectic.goessflix.util.AmazonSignature;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
@EnableAutoConfiguration
public class UpcServiceAmazonImpl implements UpcService {

    @Override
    public String getUpcJson(String upc) {

        Map<String, String> params = new HashMap<String, String>();

        params.put("Service", "AWSECommerceService");
        params.put("Operation", "ItemLookup");
        params.put("ResponseGroup", "Small");
        params.put("SearchIndex", "All");
        params.put("IdType", "UPC");
        params.put("AssociateTag", "egoess001-20");
        params.put("ItemId", upc);


        AmazonSignature amazonSignature = new AmazonSignature();
        String signedUrl = amazonSignature.getSignedUrl("GET", params);
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(signedUrl);

        CloseableHttpResponse response1 = null;
        try {
            response1 = httpClient.execute(httpGet);
            HttpEntity entity = response1.getEntity();

            if (entity.getContentType().getValue().contains("text/xml")) {
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
