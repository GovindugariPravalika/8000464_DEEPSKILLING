package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ApiServiceTest {

    @Test
    void testServiceWithMockRestClient() {

        // Create mock REST client
        RestClient mockRestClient = mock(RestClient.class);

        // Stub the REST client method
        when(mockRestClient.getResponse()).thenReturn("Mock Response");

        // Create service object
        ApiService apiService = new ApiService(mockRestClient);

        // Call the service method
        String result = apiService.fetchData();

        // Verify the result
        assertEquals("Fetched Mock Response", result);

        // Verify interaction
        verify(mockRestClient).getResponse();
    }

}