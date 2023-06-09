
import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface VIP{

    int rating() default 1;
    String star();
    String status = "very important person";
 }
 @Retention(RetentionPolicy.RUNTIME)
 @interface PriorityContainer { 

    VIP[] value();

 }