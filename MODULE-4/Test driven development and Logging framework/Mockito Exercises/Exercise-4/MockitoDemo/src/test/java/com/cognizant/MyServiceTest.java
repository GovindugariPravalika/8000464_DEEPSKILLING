package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testVoidMethod() {

        // Arrange
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub the void method
        doNothing().when(mockApi).sendData("Mockito");

        MyService service = new MyService(mockApi);

        // Act
        service.saveData("Mockito");

        // Assert
        verify(mockApi).sendData("Mockito");

    }

}