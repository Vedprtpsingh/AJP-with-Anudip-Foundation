//code is not working
    class Queue{
        int x;
        void store(int j){
            x=j;
            System.out.println("Products"+x);
        }
        void retrieve(){
            System.out.println("Cousumed"+x);
        }
    }
    class Producer extends Thead{
        Queue a;
        Producer(Queue q){
            a=q;
        }
        public void run(){
            int i=1;
            for(;;){
                a.store(i++);
            }
        }
    }
    class Cousumer extends Thead{
        Queue b;
        Cousumer(Queue q){
            b=q;
        }
        public void run(){
            for(){
                b.retrieve();
            }
        }
    class demo{
        public static void main(String[] args) {
            Queue q=new Queue();
        }
    }
}
