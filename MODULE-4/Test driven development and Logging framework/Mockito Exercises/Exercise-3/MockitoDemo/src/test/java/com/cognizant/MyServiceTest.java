package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testArgumentMatching() {

        // Arrange
        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        // Act
        service.processData("Hello Mockito");

        // Assert
        verify(mockApi).sendData(anyString());

    }

}