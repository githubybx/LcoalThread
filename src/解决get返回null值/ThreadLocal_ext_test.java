package 解决get返回null值;

public class ThreadLocal_ext_test {
    public static void main(String[] args) {
        System.out.println(ThreadLocalEntity.t.get());
        ThreadA threadA = new ThreadA();
        threadA.start();
    }
}
