CREATE TABLE flights (
    id SERIAL PRIMARY KEY,
    airline VARCHAR(255) NOT NULL,
    number VARCHAR(255) NOT NULL,
    status VARCHAR(255) NOT NULL
);

INSERT INTO flights (airline, number, status) VALUES 
('Airline A', 'AA123', 'On Time'),
('Airline B', 'BB456', 'Delayed');
