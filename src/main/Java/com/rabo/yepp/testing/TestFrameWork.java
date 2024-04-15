package com.rabo.yepp.testing;

import com.rabo.yepp.testing.test.CalculatorTest;
import com.rabo.yepp.testing.annotation.BeforeEach;
import com.rabo.yepp.testing.annotation.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TestFrameWork {

    public static void runTests(Class<?> clazz) {

        try {
            runAnnotatedTests(clazz);
        } catch (Exception e) {
            e.printStackTrace();
            // Don't leave this empty
        }
    }

    private static void runAnnotatedTests(Class<?> clazz) throws Exception {

        int succes = 0;
        int failed = 0;
        int total = 0;

        List<Method> testMethods = getAnnotatedMethods(clazz, Test.class);
        List<Method> beforeEachMethods = getAnnotatedMethods(clazz, BeforeEach.class);
        Method beforeEach = beforeEachMethods.get(0);

        Object testClass = clazz.getDeclaredConstructor().newInstance();

        for (Method method : testMethods) {
            Test test = method.getAnnotation(Test.class);
            if (test.skip()) {
                System.out.println("Test " + method.getName() + " skipped ");
                continue;
            }
            try {
                if (beforeEach != null) {
                    beforeEach.invoke(testClass);
                }

                method.invoke(testClass);
                succes++;
                System.out.println("Test " + method.getName() + " OK! ");
            } catch (InvocationTargetException e) {
                failed++;
                System.out.println("Test " + method.getName() + " failed: " + e.getCause().getMessage());
            }
            total++;
        }

        System.out.println("Total tests: " + total);
        System.out.println("Successful : " + succes);
        System.out.println("Failed: " + failed);
    }

    public static <T extends Annotation> List<Method> getAnnotatedMethods(Class<?> testClass, Class<T> annotation) {

        List<Method> methods = new ArrayList<>();

        for (Method method : testClass.getDeclaredMethods()) {
            Annotation[] annotations = testClass.getAnnotations();
            System.out.printf("", annotations[0]);

            T[] ts = method.getAnnotationsByType(annotation);

            if (ts.length == 0) {
                continue;
            }

            methods.add(method);
        }

        return methods;
    }
}
