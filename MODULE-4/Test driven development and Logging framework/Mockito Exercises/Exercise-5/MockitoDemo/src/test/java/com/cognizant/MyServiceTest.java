package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testMultipleReturns() {

        // Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Return different values on consecutive calls
        when(mockApi.getData())
                .thenReturn("First Call")
                .thenReturn("Second Call")
                .thenReturn("Third Call");

        MyService service = new MyService(mockApi);

        // Calling the method multiple times
        String result1 = service.fetchData();
        String result2 = service.fetchData();
        String result3 = service.fetchData();

        // Verify results
        assertEquals("First Call", result1);
        assertEquals("Second Call", result2);
        assertEquals("Third Call", result3);

        // Verify method was called three times
        verify(mockApi, times(3)).getData();
    }

}