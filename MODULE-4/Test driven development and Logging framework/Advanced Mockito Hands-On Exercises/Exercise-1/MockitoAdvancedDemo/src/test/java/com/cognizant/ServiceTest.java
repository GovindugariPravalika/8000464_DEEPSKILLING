package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ServiceTest {

    @Test
    void testServiceWithMockRepository() {

        // Create mock repository
        Repository mockRepository = mock(Repository.class);

        // Stub repository method
        when(mockRepository.getData()).thenReturn("Mock Data");

        // Create service using mock repository
        Service service = new Service(mockRepository);

        // Call service method
        String result = service.processData();

        // Verify result
        assertEquals("Processed Mock Data", result);

        // Verify repository interaction
        verify(mockRepository).getData();

    }

}