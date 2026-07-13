package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testVoidMethodThrowsException() {

        // Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub the void method to throw an exception
        doThrow(new RuntimeException("Delete Failed"))
                .when(mockApi)
                .deleteData();

        MyService service = new MyService(mockApi);

        // Verify exception is thrown
        assertThrows(RuntimeException.class, () -> {
            service.removeData();
        });

        // Verify interaction
        verify(mockApi).deleteData();
    }

}