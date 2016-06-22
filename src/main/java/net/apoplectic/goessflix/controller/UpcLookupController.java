package net.apoplectic.goessflix.controller;

import net.apoplectic.goessflix.service.UpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/upc")
public class UpcLookupController {

    @Autowired
    private UpcService upcService;

    @RequestMapping(method = GET, value = "/lookup")
    public String getUpcInfo(@RequestParam(value = "upc") String upc) {
        return upcService.getUpcJson(upc);
    }
}
