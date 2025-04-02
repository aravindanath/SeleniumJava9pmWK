package LearningTestNG;

import org.testng.annotations.Test;

public class TC02 extends BaseClass{


    @Test
    public void test(){
        driver.get("https://www.amazon.com");
    }
}
