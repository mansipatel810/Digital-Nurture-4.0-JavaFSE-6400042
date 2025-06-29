package com.example;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Arrange: create mock
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Act: call method
        MyService service = new MyService(mockApi);
        service.fetchData();

        // Assert: verify interaction
        verify(mockApi).getData();
    }
}
