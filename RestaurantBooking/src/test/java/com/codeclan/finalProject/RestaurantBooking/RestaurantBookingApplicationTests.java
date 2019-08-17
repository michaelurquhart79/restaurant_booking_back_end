package com.codeclan.finalProject.RestaurantBooking;

import com.codeclan.finalProject.RestaurantBooking.models.Customer;
import com.codeclan.finalProject.RestaurantBooking.models.Table;
import com.codeclan.finalProject.RestaurantBooking.repositories.CustomerRepository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestaurantBookingApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

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

	@Test
	public void customerCanBeSaved() {
		Customer customer = new Customer("Bob", "07999999999");
		assertEquals(null, customer.getId());
		customerRepository.save(customer);
		assertNotNull(customer.getId());
	}

	@Test
	public void tableHasCapacity() {
		Table table = new Table(4);
		assertEquals(4, table.getCapacity());
	}

}
