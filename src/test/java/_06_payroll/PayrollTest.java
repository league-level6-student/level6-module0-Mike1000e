package _06_payroll;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PayrollTest {

    Payroll payroll = new Payroll();

    @Test
    void itShouldCalculatePaycheck() {
        //given
        double hourlyWage = 15;
        int hours = 40;
        //when
        double answer = payroll.calculatePaycheck(hourlyWage, hours);
        //then
        assertEquals(600, answer);

    }

    @Test
    void itShouldCalculateMileageReimbursement() {
        //given
        int milesTraveled = 1000;
        //when
        double answer2 = payroll.calculateMileageReimbursement(milesTraveled);
        //then
        assertEquals(575, answer2);
    }

    @Test
    void itShouldCreateOfferLetter() {
        //given
        String employee = "Joe";
        double wage = 15;
        //when
        String answer3 = payroll.createOfferLetter(employee, wage);
        //then
        assertEquals("Hello Joe, We are pleased to offer you an hourly wage of 15.0", answer3);
    }

}