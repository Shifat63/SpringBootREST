package com.shifat63.rest_application.services.serviceImpl;

import com.shifat63.rest_application.model.DataPage;
import com.shifat63.rest_application.services.service.ApiService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

// Author: Shifat63

@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;

    private final String api_url = "https://reqres.in/api/users";

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public DataPage getDataPage(Integer pageNo) {

        UriComponentsBuilder uriBuilder = UriComponentsBuilder
                .fromUriString(api_url)
                .queryParam("page", pageNo);

        DataPage dataPage = restTemplate.getForObject(uriBuilder.toUriString(), DataPage.class);
        return dataPage;
    }
}
