package anubis.utils;

import anubis.generic.bean.SimpleGenericBean;

import java.util.Arrays;
import java.util.function.Function;

public class  ObjectUtils {

    public static <T> boolean equalsAttr(Function<T, Object> getAtributes, T bean1, T bean2) {
        Object attr1 = getAtributes.apply(bean1);
        Object attr2 = getAtributes.apply(bean2);
        return attr1.equals(attr2);
    }

    public static<T> boolean equalsAny(T reference, T ... objs) {
        return Arrays.asList(objs)
                .stream()
                .anyMatch(reference::equals);
    }


}
