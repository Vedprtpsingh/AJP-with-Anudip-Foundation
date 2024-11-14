/*First create Products table-
create table products(product_id int primary key auto_increment,product_name varchar(10),price decimal(10,2));

create Product_Metadata table-
create table Product_Metadata(product_id int,last_modified Timestamp default CURRENT_TIMESTAMP ON uPDATE CURRENT_TIMESTAMP);
*/
package com.ved;

import java.sql.Connection;
import java.sql.Statement;

public class ProductTrigger {
    public static void main(String[] args) {
        try (Connection con = ConnectDB.dbConnect();
             Statement statement = con.createStatement()) {
            // Define the SQL statement to create a trigger
            String createTriggerSQL = """
                CREATE TRIGGER update_last_modified_trigger
                AFTER INSERT ON Products
                FOR EACH ROW
                BEGIN
                    INSERT INTO Product_Metadata (product_id) 
                    VALUES (NEW.product_id)
                    ON DUPLICATE KEY UPDATE last_modified = CURRENT_TIMESTAMP;
                END;
                """;
            // Execute the SQL statement to create the trigger
            statement.executeUpdate(createTriggerSQL);
            System.out.println("Product metadata trigger created successfully.");
            
        } catch (Exception e) {
            System.out.println("Error creating product trigger:");
            e.printStackTrace();
        }
    }
}

/*
 * Run Insert query ffrom SQL CommandLine client
 * INSERT INTO Products (product_name, price) VALUES ("phone", 60000);
 */