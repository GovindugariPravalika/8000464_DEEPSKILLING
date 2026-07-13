package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class FileServiceTest {

    @Test
    void testServiceWithMockFileIO() {

        // Create mock objects
        FileReader mockFileReader = mock(FileReader.class);
        FileWriter mockFileWriter = mock(FileWriter.class);

        // Stub the read() method
        when(mockFileReader.read()).thenReturn("Mock File Content");

        // Create service object
        FileService fileService = new FileService(mockFileReader, mockFileWriter);

        // Call the service method
        String result = fileService.processFile();

        // Verify the result
        assertEquals("Processed Mock File Content", result);

        // Verify interactions
        verify(mockFileReader).read();
        verify(mockFileWriter).write("Processed Mock File Content");
    }

}