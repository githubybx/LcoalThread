package InheritableThreadLocal的使用;

public class main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(ThreadLocalEntity.t.get());
        Thread.sleep(1000);
        ThreadA threadA = new ThreadA();
        Thread.sleep(1000);
        ThreadB threadB = new ThreadB();
        threadA.start();
        Thread.sleep(1000);
        threadB.start();
    }
}
