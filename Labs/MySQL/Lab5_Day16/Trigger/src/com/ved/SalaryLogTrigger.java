
/*
Create salary Log Table:
create table Salary_Log(log_id int primary key auto_increment,employee_id int,new_salary decimal(10,2),change_date timestamp default current_timestamp);
*/
package com.ved;

import java.sql.Connection;
import java.sql.Statement;

public class SalaryLogTrigger {
    public static void main(String[] args) {
        try (Connection con = ConnectDB.dbConnect();
             Statement statement = con.createStatement()) {
            // Define the SQL statement to create a trigger
            String createTriggerSQL = """
                CREATE TRIGGER update_salary_trigger
                AFTER UPDATE ON employee
                FOR EACH ROW
                BEGIN
                    IF NEW.salary != OLD.salary THEN
                        INSERT INTO Salary_Log (employee_id, new_salary) 
                        VALUES (NEW.eid, NEW.salary);
                    END IF;
                END;
                """;
            // Execute the SQL statement to create the trigger
            statement.executeUpdate(createTriggerSQL);
            System.out.println("Salary update trigger created successfully.");
            
        } catch (Exception e) {
            System.out.println("Error creating salary trigger:");
            e.printStackTrace();
        }
    }
}
/*
Not Run Sql command:
UPDATE employee SET salary =60000  WHERE eid =6;
*/