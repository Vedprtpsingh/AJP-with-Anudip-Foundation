<<<<<<< HEAD
public class Q2 {
    public static void checkLeapYear(int year){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }
    }
    public static void main(String[] args) {
        checkLeapYear(1600);
    }
=======
public class Q2 {
    public static void checkLeapYear(int year){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }
    }
    public static void main(String[] args) {
        checkLeapYear(1600);
    }
>>>>>>> d5fa77123764c975fd733818b5f9fbfcee1af006
}