package com.codeclan.finalProject.RestaurantBooking;

import com.codeclan.finalProject.RestaurantBooking.models.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestaurantBookingApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void customerHasName() {
		Customer customer = new Customer("Bob", "07999999999");
		assertEquals("Bob", customer.getName());
	}

	@Test
	public void customerHasContact() {
		Customer customer = new Customer("Bob", "07999999999");
		assertEquals("07999999999", customer.getContact());
	}

	@Test
	public void customerHasNoVisitsInitially() {
		Customer customer = new Customer("Bob", "07999999999");
		assertEquals(0, customer.getNoOfVisits());		
	}

}
