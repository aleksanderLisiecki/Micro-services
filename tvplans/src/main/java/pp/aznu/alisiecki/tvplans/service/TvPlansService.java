package pp.aznu.alisiecki.tvplans.service;

import org.springframework.stereotype.Service;
import pp.aznu.alisiecki.tvplans.TvPlan;

import javax.annotation.PostConstruct;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class TvPlansService {
    private static final Map<Double, TvPlan> TvPlans = new LinkedHashMap<>();

    @PostConstruct
    public void initData(){
        TvPlan tvplan1 = new TvPlan("Niedzielny", 10, 10);

        TvPlan tvplan2 = new TvPlan("Kinowy", 30, 30);

        TvPlan tvplan3 = new TvPlan("Codzienny", 50, 40);

        TvPlan tvplan4 = new TvPlan("Kompletny", 100, 70);

        TvPlans.put(tvplan1.getNumberOfChannels(), tvplan1);
        TvPlans.put(tvplan2.getNumberOfChannels(), tvplan2);
        TvPlans.put(tvplan3.getNumberOfChannels(), tvplan3);
        TvPlans.put(tvplan4.getNumberOfChannels(), tvplan4);
    }

    public static TvPlan chooseTvPlanByNumberOfChannels(double numberOfChannels ) {

        for (Map.Entry<Double, TvPlan> entry : TvPlans.entrySet()) {
            if( numberOfChannels <= entry.getKey() ){
                return entry.getValue();
            }
        }

        return TvPlans.get(100.0);
    }
}
