package com.example.demo.cases;
import com.example.demo.annotations.ClassPranav;
import com.example.demo.annotations.MethodPranav;

@ClassPranav("This is a Case3")
public class Only_Annotated {

    @MethodPranav("This is a method Case3function1 inside CASE3")
    public void Case3Function1() {
        System.out.println("Case3Function1");
    }

    @MethodPranav("This is a method Case3Function2 inside Case3")
    public void EB() {
        System.out.println("Case3Function2");
    }


}