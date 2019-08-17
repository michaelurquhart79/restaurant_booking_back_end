package com.codeclan.finalProject.RestaurantBooking.components;

import com.codeclan.finalProject.RestaurantBooking.models.Booking;
import com.codeclan.finalProject.RestaurantBooking.models.Customer;
import com.codeclan.finalProject.RestaurantBooking.models.Table;
import com.codeclan.finalProject.RestaurantBooking.repositories.BookingRepository.BookingRepository;
import com.codeclan.finalProject.RestaurantBooking.repositories.CustomerRepository.CustomerRepository;
import com.codeclan.finalProject.RestaurantBooking.repositories.TableRepository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    TableRepository tableRepository;

    @Autowired
    BookingRepository bookingRepository;


    public DataLoader() {

    }

    public void run(ApplicationArguments args){

        Customer customer = new Customer("Bob", "07999999999");
        customerRepository.save(customer);



        Table table = new Table(4);
        tableRepository.save(table);



        Booking booking = new Booking("2019-08-18", "18:15", 4,
                "No Comment", customer, table);
        bookingRepository.save(booking);

    }

}
