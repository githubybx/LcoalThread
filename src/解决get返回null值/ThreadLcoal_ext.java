package 解决get返回null值;

import java.time.LocalTime;

public class ThreadLcoal_ext extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return  LocalTime.now().toString();
    }
}
