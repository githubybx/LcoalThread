package 解决get返回null值;

public class ThreadA extends Thread{
    @Override
    public void run() {
        System.out.println(ThreadLocalEntity.t.get());
    }
}
