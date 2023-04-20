package Homework;

public class LatticeSign implements Runnable {
    public void run(){
        System.out.println("Start");

    try{
        for (int i= 0;i<100;i++){
            Thread.sleep(100);
            System.out.println("#");
        }
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

    }

}
/* Задача
Написать метод 100 раз печатающий символ и вывести на экран результат его работы для двух потоков
 (Например, один поток печатает # а второй *).
В конце работы на экран должно выводиться "end of main"*/
