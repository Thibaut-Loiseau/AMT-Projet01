package com.mycompany.projet.rest;

import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


/**
 * Defining properties for the API
 * 
 * @author Ioannis Noukakis & Thibaut Loiseau
 */
@ApplicationPath("/api")
public class RESTApiApplication extends Application {
    @Override
    public Map<String, Object> getProperties() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("jersey.config.disable.MoxyJson", true);
        return properties;
    }
}