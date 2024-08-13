package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define @BeforeTest annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BeforeTest {
}

// Define @AfterTest annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface AfterTest {
}

// Define @Test annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Test {
}
