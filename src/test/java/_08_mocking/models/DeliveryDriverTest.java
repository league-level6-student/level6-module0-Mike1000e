package _08_mocking.models;

import _07_intro_to_mocking.models.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class DeliveryDriverTest {


    DeliveryDriver deliveryDriver;

    @Mock
    CellPhone phone;

    String name = "";

    @Mock
    Car car;



    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
         deliveryDriver = new DeliveryDriver(name, car, phone);

    }

    @Test
    void itShouldWasteTime() {
        //given
            boolean wasteTime = true;

            when(deliveryDriver.wasteTime()).thenReturn(true);
        //when
            boolean answer = deliveryDriver.wasteTime();
        //then
        assertEquals(wasteTime, answer);
    }

    @Test
    void itShouldRefuel() {
        //given
            boolean refuel = true;
            int octane = 93;

            when(deliveryDriver.refuel(octane)).thenReturn(true);
        //when
            boolean answer = deliveryDriver.refuel(octane);
        //then
            assertEquals(refuel, answer);
    }

    @Test
    void itShouldContactCustomer() {
        //given
            String phoneNumber = "832-321-3124";
            boolean contacted = true;

            when(deliveryDriver.contactCustomer(phoneNumber)).thenReturn(true);
        //when
            boolean answer = deliveryDriver.contactCustomer(phoneNumber);
        //then
            assertEquals(answer, contacted);
    }

}