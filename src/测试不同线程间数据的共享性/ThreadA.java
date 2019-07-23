package 测试不同线程间数据的共享性;

public class ThreadA extends Thread {
    @Override
    public void run() {
        System.out.println(ThreadLocalEntity.t.get());
        ThreadLocalEntity.t.set("这是线程A私有的共享变量");
        System.out.println(ThreadLocalEntity.t.get());
    }
}
