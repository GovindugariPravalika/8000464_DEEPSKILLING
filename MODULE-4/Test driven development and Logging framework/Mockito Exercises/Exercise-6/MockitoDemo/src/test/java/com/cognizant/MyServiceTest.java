package com.cognizant;

import org.junit.jupiter.api.Test;

import org.mockito.InOrder;

import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testInteractionOrder() {

        // Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Create service
        MyService service = new MyService(mockApi);

        // Call method
        service.fetchData();

        // Verify the order of method calls
        InOrder inOrder = inOrder(mockApi);

        inOrder.verify(mockApi).connect();
        inOrder.verify(mockApi).getData();
        inOrder.verify(mockApi).disconnect();

    }

}