package pp.aznu.alisiecki.internetplans.service;

import https.alisiecki_pp.internet_plans_soap.InternetPlan;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InternetPlansServiceTest {

    @Test
    void choseInternetPlanByGbTest() {
        InternetPlansService internetPlansService = new InternetPlansService();

        internetPlansService.initData();


        InternetPlan mini = new InternetPlan();
        mini.setName("Mini");
        mini.setNumberOfGb(5.0);
        mini.setCost(15);

        String expected = mini.toString();

        String actual = internetPlansService.chooseInternetPlanByGb(4).toString();

        assertTrue(expected.equals(actual));
    }
}