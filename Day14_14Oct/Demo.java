import java.util.Scanner;
class Demo1 extends Thread{
    public void run(){
        Thread t=Thread.currentThread();
        String name=t.getName();
        if(name.equals("ADD")){
            add();
        }else{
            printNum();
        }
    }
    public void add(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Addition started...");
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Addition is: "+c);
        System.out.println("Addition complited...");
    }
    public void printNum(){
        System.out.println("Number printing task started....");
        for(int i=0;i<=5;i++){
            System.out.println(i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Number printing task completed...");
    }
}
public class Demo {
    public static void main(String[] args){
        Demo1 d1=new Demo1();
        Demo1 d2=new Demo1();
        d1.setName("ADD");
        d2.setName("NUM");
        d1.start();
        d2.start();
    }
}


/*
class Demo1 extends Exception implements Runnable{
    public void run(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Addition started...");
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Addition is: "+c);
        System.out.println("Addition complited...");
    }
}
class Demo2 implements Runnable{
    public void run(){
        System.out.println("Number printing task started....");
        for(int i=0;i<=5;i++){
            System.out.println(i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Number printing task completed...");
    }
}

public class Demo {
    public static void main(String[] args){
        Demo1 d1=new Demo1();
        Demo2 d2=new Demo2();
        Thread t1=new Thread(d1);
        Thread t2=new Thread(d2);
        t1.start();
        t2.start();
    }
}
 */
/*
class Demo1 implements Runnable{
    public void run(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Addition started...");
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Addition is: "+c);
        System.out.println("Addition complited...");
    }
}
class Demo2 implements Runnable{
    public void run(){
        System.out.println("Number printing task started....");
        for(int i=0;i<=5;i++){
            System.out.println(i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Number printing task completed...");
    }
}

public class Demo {
    public static void main(String[] args){
        Demo1 d1=new Demo1();
        Demo2 d2=new Demo2();
        Thread t1=new Thread(d1);
        Thread t2=new Thread(d2);
        t1.start();
        t2.start();
    }
}

 */

/*class Demo1 extends Thread{
    public void run(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Addition started...");
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Addition is: "+c);
        System.out.println("Addition complited...");
    }
}
class Demo2 extends Thread{
    public void run(){
        System.out.println("Number printing task started....");
        for(int i=0;i<=5;i++){
            System.out.println(i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Number printing task completed...");
    }
}

public class Demo {
    public static void main(String[] args){
        Demo1 d1=new Demo1();
        Demo2 d2=new Demo2();
        d1.start();
        d2.start();
    }
}
 */

/*
class Demo1{
    void fun1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Addition started...");
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Addition is: "+c);
        System.out.println("Addition complited...");
    }
}
class Demo2{
    void fun2() throws Exception{
        System.out.println("Number printing task started....");
        for(int i=0;i<=5;i++){
            System.out.println(i);
            Thread.sleep(2000);
        }
        System.out.println("Number printing task completed...");
    }
}

public class Demo {
    public static void main(String[] args) throws Exception{
        Demo1 d1=new Demo1();
        Demo2 d2=new Demo2();
        d1.fun1();
        d2.fun2();
    }
}
 */



/*
public class Demo {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("Addition started...");
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Addition is: "+c);
        System.out.println("Addition complited...");
        System.out.println("Number printing task started....");
        for(int i=0;i<=5;i++){
            System.out.println(i);
            Thread.sleep(2000);
        }
        System.out.println("Number printing task completed...");
    }
}
    */