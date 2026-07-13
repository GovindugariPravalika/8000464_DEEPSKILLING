package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class NetworkServiceTest {

    @Test
    void testServiceWithMockNetworkClient() {

        // Create mock network client
        NetworkClient mockNetworkClient = mock(NetworkClient.class);

        // Stub the connect() method
        when(mockNetworkClient.connect()).thenReturn("Mock Connection");

        // Create service object
        NetworkService networkService = new NetworkService(mockNetworkClient);

        // Call the service method
        String result = networkService.connectToServer();

        // Verify the result
        assertEquals("Connected to Mock Connection", result);

        // Verify interaction
        verify(mockNetworkClient).connect();
    }

}