package com.shifat63.rest_application.services.serviceImpl;

import com.shifat63.rest_application.model.DataPage;
import com.shifat63.rest_application.services.service.ApiService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Author: Shifat63

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ApiServiceImplTest {

    @Autowired
    ApiService apiService;

    @BeforeEach
    public void setUp() throws Exception {
    }


    @Test
    public void testGetDataPage() throws Exception {

        DataPage dataPage = apiService.getDataPage(1);

        assertEquals(6, dataPage.getData().size());
    }
}