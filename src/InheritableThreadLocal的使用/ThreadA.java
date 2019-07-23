package InheritableThreadLocal的使用;

public class ThreadA extends Thread {
    @Override
    public void run() {
        //ThreadLocalEntity.t.set("这是父线程的共享变量");
        System.out.println(ThreadLocalEntity.t.get());
    }
}
