//code is not working
class Queue{
    int x;
    boolean is_data_present=false;
    synchronized void store(int j){
        try{
            if(is_data_present==false){
                x=j;
                System.out.println("Produced"+x);
                is_data_present=true;
                notify();
            }
            else{
                wait();
            }
            catch(Exception e)
        }
    }
}