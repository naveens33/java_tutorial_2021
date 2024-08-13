package annotations;

import java.lang.reflect.Method;

public class CustomTestFramework {

    public static void main(String[] args) throws Exception {
        runTests(SampleTest.class);
    }

    public static void runTests(Class testClass) throws Exception {
        Object testInstance = testClass.getDeclaredConstructor().newInstance();

        // Run methods annotated with @BeforeTest
        for (Method method : testClass.getDeclaredMethods()) {
            if (method.isAnnotationPresent(BeforeTest.class)) {
                method.invoke(testInstance);
            }
        }

        // Run methods annotated with @Test
        for (Method method : testClass.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Test.class)) {
                method.invoke(testInstance);
            }
        }

        // Run methods annotated with @AfterTest
        for (Method method : testClass.getDeclaredMethods()) {
            if (method.isAnnotationPresent(AfterTest.class)) {
                method.invoke(testInstance);
            }
        }
    }
}
