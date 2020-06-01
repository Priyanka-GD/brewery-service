package com.springframework.breweryservice.web.model;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
@org.springframework.boot.test.autoconfigure.json.JsonTest
public class JsonTest extends BaseTest {
    @Autowired
    ObjectMapper objectMapper;
    @Test
    void testSerialization() throws JsonProcessingException {
        JsonPojo jsonPojo=getJsonPogo();
        String str= objectMapper.writeValueAsString(jsonPojo);
        System.out.println(str);

    }
    @Test
    void testDeserialization() throws JsonProcessingException {
        String json="{\"id\":\"21691020-7272-4e5c-8ef6-d886625b020e\",\"beerName\":\"Galaxy Cat\",\"beerStyle\":\"PALE_ALE\",\"upc\":1246895}\n";
        JsonPojo jsonPojo=objectMapper.readValue(json,JsonPojo.class);
        System.out.println(jsonPojo);

    }


}
