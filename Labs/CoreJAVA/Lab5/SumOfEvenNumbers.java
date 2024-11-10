<<<<<<< HEAD
import java.util.ArrayList;
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        // arraylist
        ArrayList<Integer> al=new ArrayList<>();
        al.add(12);
        al.add(1);
        al.add(31);
        al.add(9);
        al.add(8);
        al.add(0);
        int sum=0;
        //for loop for get even numbers from the arraylist
        for(int i=0;i<al.size();i++){
            if(al.get(i)%2==0){
                sum+=al.get(i);
            }
        }
        System.out.println("Sum of even number: "+sum);
    }
}
=======
import java.util.ArrayList;
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        // arraylist
        ArrayList<Integer> al=new ArrayList<>();
        al.add(12);
        al.add(1);
        al.add(31);
        al.add(9);
        al.add(8);
        al.add(0);
        int sum=0;
        //for loop for get even numbers from the arraylist
        for(int i=0;i<al.size();i++){
            if(al.get(i)%2==0){
                sum+=al.get(i);
            }
        }
        System.out.println("Sum of even number: "+sum);
    }
}
>>>>>>> d5fa77123764c975fd733818b5f9fbfcee1af006
