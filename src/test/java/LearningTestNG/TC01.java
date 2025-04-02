package LearningTestNG;

import org.testng.annotations.Test;

public class TC01 extends BaseClass{


    @Test
    public void test(){
        driver.get("https://www.google.com");
    }
}
