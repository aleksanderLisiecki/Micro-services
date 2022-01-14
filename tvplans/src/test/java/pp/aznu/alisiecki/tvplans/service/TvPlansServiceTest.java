package pp.aznu.alisiecki.tvplans.service;

import org.junit.jupiter.api.Test;
import pp.aznu.alisiecki.tvplans.TvPlan;

import static org.junit.jupiter.api.Assertions.*;

class TvPlansServiceTest {

    @Test
    void chooseTvPlanByNumberOfChannelsTest(){
        TvPlansService tvPlansService = new TvPlansService();
        tvPlansService.initData();

        TvPlan tvPlan = new TvPlan("Codzienny", 50, 40);

        assertEquals(tvPlan.toString(), TvPlansService.chooseTvPlanByNumberOfChannels(40).toString());

        assertNotEquals(tvPlan.toString(), TvPlansService.chooseTvPlanByNumberOfChannels(60).toString());

        assertNotEquals(tvPlan.toString(), TvPlansService.chooseTvPlanByNumberOfChannels(250).toString());
    }
}