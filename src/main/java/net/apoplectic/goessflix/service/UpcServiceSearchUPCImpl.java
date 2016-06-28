package net.apoplectic.goessflix.service;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

@Service
@EnableAutoConfiguration
public class UpcServiceSearchUPCImpl implements UpcService {

    @Override
    public String getUpcJson(String upc) {

        try {
            UPCSearchStub search = new UPCSearchStub();
            UPCSearchStub.GetProductJSON productJSON = new UPCSearchStub.GetProductJSON();
            productJSON.setUpc(upc);
            productJSON.setAccesstoken("5D9BCB4A-97F7-4119-B2F1-C1A1F467FAC7");

            UPCSearchStub.GetProductJSONResponse response = search.getProductJSON(productJSON);

            return response.getGetProductJSONResult();
        } catch (Exception e) {
            return "Exception, there was a problem";
        }
    }
}
