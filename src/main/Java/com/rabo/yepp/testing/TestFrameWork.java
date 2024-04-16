package com.rabo.yepp.testing;

import com.rabo.yepp.testing.annotation.BeforeEach;
import com.rabo.yepp.testing.annotation.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TestFrameWork {

    public static void runTests(Class<?> testClass) {

        try {
            runAnnotatedTests(testClass);
        } catch (Exception e) {
            System.out.println("Test run failed: " + e.getMessage());;

        }
    }

    private static void runAnnotatedTests(Class<?> testClass) throws Exception {

        int succes = 0;
        int failed = 0;
        int total = 0;

        // Get all methods , annotated with '@Test'
        List<Method> testMethods = getAnnotatedMethods(testClass, Test.class);
        List<Method> beforeEachMethods = getAnnotatedMethods(testClass, BeforeEach.class);

        // Only one method in the test class with this annotation
        Method beforeEach = beforeEachMethods.get(0);

        // Create an instance of the test class.
        // The instance is used in the 'invoke' method, later
        Object testClassInstance = testClass.getDeclaredConstructor().newInstance();

        for (Method method : testMethods) {
            // Get the info from the Annotation
            Test test = method.getAnnotation(Test.class);
            String testComment = test.testComment();
            if (test.skip()) {
                System.out.printf("Comment: %s \nTest '%s' skipped \n",testComment, method.getName() );
                continue;
            }
            try {
                if (beforeEach != null) {
                    // In the logging you see that the battery is recharged before every test
                    beforeEach.invoke(testClassInstance);
                }

                method.invoke(testClassInstance);
                succes++;
                System.out.printf("Comment: %s \nTest '%s' \n",testComment, method.getName() );
            } catch (InvocationTargetException e) {
                // Note: Assertions may throw an AssertionException which is handled
                // by the 'invoke' method, by throwing an InvocationTargetException
                failed++;
                System.out.printf("Comment: %s \nTest '%s' failed: %s\n", testComment, method.getName(), e.getCause().getMessage());
            }
            total++;
        }

        System.out.println("Total tests: " + total);
        System.out.println("Successful : " + succes);
        System.out.println("Failed: " + failed);
    }

    public static <T extends Annotation> List<Method> getAnnotatedMethods(Class<?> testClass, Class<T> annotation) {

        // We fill this list with methods that have a '@Test' annotation and return this list
        List<Method> methods = new ArrayList<>();

        for (Method method : testClass.getDeclaredMethods()) {
            Annotation[] annotations = testClass.getAnnotations();

            T[] ts = method.getAnnotationsByType(annotation);

            // No annotation found for this method
            if (ts.length == 0) {
                continue;
            }

            methods.add(method);
        }

        return methods;
    }
}
