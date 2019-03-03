package com.hkdemircan.petclinc;

import com.hkdemircan.model.Owner;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

public class PetClinicRestControllerTest {
    private RestTemplate restTemplate;

    @Before
    public void setUp(){
        restTemplate = new RestTemplate();
    }

    @Test
    public void  testGetOwnerById(){
        ResponseEntity<Owner> responseEntity = restTemplate.getForEntity("http://localhost:8080/rest/owner/1", Owner.class);

        MatcherAssert.assertThat(responseEntity.getStatusCodeValue(), Matchers.equalTo(200));
        MatcherAssert.assertThat(responseEntity.getBody().getFirstName(), Matchers.equalTo("kadir"));
    }

    @Test
    public void testGetOwnersByLastName(){
        ResponseEntity<List> responseEntity = restTemplate.getForEntity("http://localhost:8080/rest/owner?ln=demircan",List.class);
        MatcherAssert.assertThat(responseEntity.getStatusCodeValue(), Matchers.equalTo(200));

        List<Map<String, String>> body = responseEntity.getBody();

        List<String> firstNames = body.stream().map(e->e.get("firstName")).collect(Collectors.toList());
        MatcherAssert.assertThat(firstNames, Matchers.containsInAnyOrder("kadir","hasan"));
    }

    @Test
    public void testGetOwners(){
        ResponseEntity<List> responseEntity = restTemplate.getForEntity("http://localhost:8080/rest/owners", List.class);
        MatcherAssert.assertThat(responseEntity.getStatusCodeValue(), Matchers.equalTo(200));

        List<Map<String, String>> body = responseEntity.getBody();
        List<String> firstNames = body.stream().map(e->e.get("firstName")).collect(Collectors.toList());
        MatcherAssert.assertThat(firstNames, Matchers.containsInAnyOrder("kadir","hasan"));
    }
}
