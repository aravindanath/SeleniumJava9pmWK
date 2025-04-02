package LearningTestNG;

import org.testng.annotations.Test;

public class TC03 extends BaseClass{


    @Test
    public void test(){
        driver.get("https://www.flipkart.com");
    }
}
