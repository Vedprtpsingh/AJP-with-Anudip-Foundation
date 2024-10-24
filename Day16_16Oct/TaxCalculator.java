class CountryNotValidException extends Exception {
    public CountryNotValidException(String message) {
        super(message);
    }
}
class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String message) {
        super(message);
    }
}
class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String message) {
        super(message);
    }
}
public class TaxCalculator {
    double taxAmount;
    public void calculateTax(String empName, double empSal, boolean isIndian) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
        // Check if the employee is Indian
        if (!isIndian) {
            throw new CountryNotValidException("The employee should be an Indian citizen to calculate tax.");
        }
        // Check if the employee name is null or empty
        if (empName == null || empName.isEmpty()) {
            throw new EmployeeNameInvalidException("The employee name should not be empty.");
        }
        // Calculate tax based on salary range
        if (empSal > 1000000) {
            taxAmount = empSal * 0.08; // 8% tax for salary above 1,000,000
            System.out.println("Tax amount is " + taxAmount);
        } else if (empSal > 500000 && empSal <= 1000000) {
            taxAmount = empSal * 0.06; // 6% tax for salary between 500,001 and 1,000,000
            System.out.println("Tax amount is " + taxAmount);
        } else if (empSal > 300000 && empSal <= 500000) {
            taxAmount = empSal * 0.05; // 5% tax for salary between 300,001 and 500,000
            System.out.println("Tax amount is " + taxAmount);
        } else if (empSal > 100000 && empSal <= 300000) {
            taxAmount = empSal * 0.04; // 4% tax for salary between 100,001 and 300,000
            System.out.println("Tax amount is " + taxAmount);
        } else {
            // If salary is below the threshold, no tax is applicable
            throw new TaxNotEligibleException("The employee does not need to pay tax.");
        }
    }
    public static void main(String[] args) {
        TaxCalculator tax = new TaxCalculator();
        try {
            tax.calculateTax("Tim", 10000, true);
        } catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
            System.out.println(e.getMessage());
        }
    }
}