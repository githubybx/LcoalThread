package 测试不同线程间数据的共享性;

public class main {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        threadA.start();
        threadB.start();
        System.out.println(ThreadLocalEntity.t.get());
        ThreadLocalEntity.t.set("这是主线程私有的共享变量");
        System.out.println(ThreadLocalEntity.t.get());
    }
}
