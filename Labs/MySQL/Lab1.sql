CREATE TABLE Client_Master (
    ClientNo VARCHAR(10) PRIMARY KEY,
    Name VARCHAR(50) NOT NULL,
    Address1 VARCHAR(100),
    Address2 VARCHAR(100),
    City VARCHAR(50),
    Pincode VARCHAR(6),
    State VARCHAR(50),
    BalDue DECIMAL(10,2)
);



    
    
    INSERT INTO Client_Master (ClientNo, Name, Address1, Address2, City, Pincode, State, BalDue) VALUES 
    ('C001', 'Dev Singh', 'Akash nagar', 'Apartment 23M', 'Ghaziabad', '200001', 'Uttar Pradesh', 55000.00),
    ('C002', 'Priya Patel', '456 Palm Road', 'Near City Mall', 'Bangalore', '560001', 'Karnataka', 8500.50),
    ('C003', 'Rajesh Kumar', '789 Green Avenue', 'Sector 7', 'Delhi', '110001', 'Delhi', 22450.75),
    ('C004', 'Sarah Wilson', '321 Church Lane', NULL, 'Chennai', '600001', 'Tamil Nadu', 5000.00),
    ('C005', 'Amit Shah', '567 Ring Road', 'Behind Central Park', 'Kolkata', '700001', 'West Bengal', 12750.25),
    ('C006', 'Mary Johnson', '890 Beach Road', 'Tower B', 'Pune', '411001', 'Maharashtra', 9999.99),
    ('C007', 'Parth Singh', '123  Street', 'Apartment 4B', 'Mumbai', '400001', 'Maharashtra', 15000.00);
    
    
SELECT * FROM Client_Master;

SELECT Name, City FROM Client_Master;