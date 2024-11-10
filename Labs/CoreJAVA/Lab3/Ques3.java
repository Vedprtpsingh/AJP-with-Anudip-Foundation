<<<<<<< HEAD
abstract class Vaccine{
    int firstDose=0;
    int secondDose=0;
    void firstDose(String n,int age){
        if((n.equalsIgnoreCase("Indian"))&&(age>=18)){
            System.out.println("Your First dose Sucessfilly Done.Now yopu have to pay 250 Rs.");
            firstDose=1;
        }else{
            System.out.println("You are noteligible for the first dose");
            if((age<18)&&(n.equalsIgnoreCase("Indian"))){
                System.out.println("Under age");
            }else if(!(n.equalsIgnoreCase("Indian"))&&(age>=18)){
                System.out.println("You are not Indian");
            }else{
                System.out.println("You are not Indian and also you are Under age.");
            }
        }
    }
    void secondDose(){
        if (firstDose==1) {
            System.out.println("Your second dose successfully done");
        }
        else{
            System.out.println("You are not elogible for the second dose");
        }
    }
    abstract void boosterDose();

}
class VaccinationSuccessful extends Vaccine{
    void boosterDose(){
        if((firstDose==1)&&(secondDose==1)){
            System.out.println("Your Booster dose Successfully Done");
        }
        else{
            System.out.println("Your are not eligible for the Booster dose");
        }
    }
}
public class Ques3 {
    public static void main(String[] args) {
        VaccinationSuccessful v=new VaccinationSuccessful();
        v.firstDose("Indian",18);
        v.secondDose();
        v.boosterDose();
    }
}
=======
abstract class Vaccine{
    int firstDose=0;
    int secondDose=0;
    void firstDose(String n,int age){
        if((n.equalsIgnoreCase("Indian"))&&(age>=18)){
            System.out.println("Your First dose Sucessfilly Done.Now yopu have to pay 250 Rs.");
            firstDose=1;
        }else{
            System.out.println("You are noteligible for the first dose");
            if((age<18)&&(n.equalsIgnoreCase("Indian"))){
                System.out.println("Under age");
            }else if(!(n.equalsIgnoreCase("Indian"))&&(age>=18)){
                System.out.println("You are not Indian");
            }else{
                System.out.println("You are not Indian and also you are Under age.");
            }
        }
    }
    void secondDose(){
        if (firstDose==1) {
            System.out.println("Your second dose successfully done");
        }
        else{
            System.out.println("You are not elogible for the second dose");
        }
    }
    abstract void boosterDose();

}
class VaccinationSuccessful extends Vaccine{
    void boosterDose(){
        if((firstDose==1)&&(secondDose==1)){
            System.out.println("Your Booster dose Successfully Done");
        }
        else{
            System.out.println("Your are not eligible for the Booster dose");
        }
    }
}
public class Ques3 {
    public static void main(String[] args) {
        VaccinationSuccessful v=new VaccinationSuccessful();
        v.firstDose("Indian",18);
        v.secondDose();
        v.boosterDose();
    }
}
>>>>>>> d5fa77123764c975fd733818b5f9fbfcee1af006
