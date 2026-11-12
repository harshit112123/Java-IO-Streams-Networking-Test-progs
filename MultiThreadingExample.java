import java.lang.Thread;

class MultiThreadingExample extends Thread{

    private int id;

    MultiThreadingExample(int i){
        this.id = i;
    }

    public void run(){
       System.out.println(id);
    }

    public static void main(String[] args) {

       MultiThreadingExample m1 = new MultiThreadingExample(101);
       MultiThreadingExample m2 = new MultiThreadingExample(102);

       Thread t = new Thread(m1);
       

        Thread t2 = new Thread(m2);
        t2.setPriority(1);

      
        t2.start();
        t.start();



        System.out.println(Runtime.getRuntime().availableProcessors());

        
    }
}