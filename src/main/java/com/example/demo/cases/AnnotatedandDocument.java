package com.example.demo.cases;

import com.example.demo.annotations.ClassPranav;
import com.example.demo.annotations.MethodPranav;

/**
 * This is a class Case1.
 *
 * @ClassDocumentation "This is a class Case1"
 */
@ClassPranav("This is a class A")
public class AnnotatedandDocument {

    /**
     * This is a method1 inside CASE1.
     *
     * @MethodDocumentation "This is a method Case1Function1 inside Case1"
     */
    @MethodPranav("This is a method Case1Function1 inside Case1")
    public void CASE1function1() {
        System.out.println("CASE1function1");
    }

    /**
     * This is a method2 inside CASE2.
     *
     * @MethodDocumentation "This is a CASE1function2  inside Case1"
     */
    @MethodPranav("This is a method CASE1function2 inside Case1")
    public void CASE1function2() {
        System.out.println("CASE1function2");
    }


}
