package com.example.flightstatus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class FlightStatusApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlightStatusApplication.class, args);
    }

    @RestController
    class FlightController {

        @GetMapping("/api/flights")
        public ResponseEntity<List<Flight>> getFlights() {
            List<Flight> flights = Arrays.asList(
                new Flight(1, "Airline A", "AA123", "On Time"),
                new Flight(2, "Airline B", "BB456", "Delayed")
            );
            return ResponseEntity.ok(flights);
        }

        @GetMapping("/api/fetch_airport_data")
        public ResponseEntity<List<Flight>> fetchAirportData() {
            List<Flight> mockData = Arrays.asList(
                new Flight(1, "Airline A", "AA123", "On Time"),
                new Flight(2, "Airline B", "BB456", "Delayed")
            );
            return ResponseEntity.ok(mockData);
        }
    }

    class Flight {
        private int id;
        private String airline;
        private String number;
        private String status;

        public Flight(int id, String airline, String number, String status) {
            this.id = id;
            this.airline = airline;
            this.number = number;
            this.status = status;
        }

        // Getters and Setters
    }
}
