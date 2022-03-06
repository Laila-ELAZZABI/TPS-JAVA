package ma.education.tp7.annotations;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface Programmer {
    abstract int id();
    String name();
}
