package ma.education.tp7.annotations;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class TestReflectionAnnotation {
    public static void main(String[] args) {
        Class c = CalculatriceMath.class;
        Programmer programmer = (Programmer) c.getAnnotation(Programmer.class);
        System.out.println(programmer.id()+":"+programmer.name());

    }
}
