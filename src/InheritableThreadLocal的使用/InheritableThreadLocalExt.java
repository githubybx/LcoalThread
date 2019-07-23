package InheritableThreadLocal的使用;

import java.time.LocalTime;

public class InheritableThreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return LocalTime.now().toString();
    }
    //子线程中显示的
    @Override
    protected Object childValue(Object parentValue) {
        return "我在子线程中加的";
    }
}
