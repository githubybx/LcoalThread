package InheritableThreadLocal的使用;

public class ThreadB extends ThreadA {
    @Override
    public void run() {
        System.out.println(ThreadLocalEntity.t.get());
    }
}
