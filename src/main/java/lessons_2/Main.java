package lessons_2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        Ticer ferst =  new Ticer("Первый", 1000);
        Ticer second =  new Ticer("Второй", 500);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(ferst);
        executorService.submit(second);


    }



    public static class Ticer implements Runnable{
        String name;
        int time;
        public Ticer(String name, int time) {
            this.name = name;
            this.time = time;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(name + ":" + i);
                try {
                    Thread.sleep(time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
