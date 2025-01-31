package com.mituuz;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FixtureClass {
    public void helloFixture() {
        System.out.println("Hello from the fixture");

        MockRecord mockRecord = mock(MockRecord.class);
        when(mockRecord.getString()).thenReturn("There");
        System.out.println(mockRecord.getString());
    }

    public record MockRecord() {
        public String getString() {
            return "Hello";
        }
    }
}
