package LearningTestNG;

import org.testng.annotations.*;

public class ExampleTestng1 {


    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

    @AfterGroups
    public void afterGroups(){
        System.out.println("After Groups");
    }

    @BeforeGroups
    public void beforeGroups(){
        System.out.println("Before Groups");
    }

    @Test
    public void test1(){
        System.out.println("Test 1");
    }

}
