package pp.aznu.alisiecki.internetplans.service;

import https.alisiecki_pp.internet_plans_soap.InternetPlan;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class InternetPlansService {

    private static final Map<Double, InternetPlan> internetPlans = new LinkedHashMap<>();

    @PostConstruct
    public void initData(){
        InternetPlan mini = new InternetPlan();
        mini.setName("Mini");
        mini.setNumberOfGb(5);
        mini.setCost(15);

        InternetPlan comfortable = new InternetPlan();
        comfortable.setName("Comfortable");
        comfortable.setNumberOfGb(15);
        comfortable.setCost(25);

        InternetPlan huge = new InternetPlan();
        huge.setName("Huge");
        huge.setNumberOfGb(50);
        huge.setCost(40);

        InternetPlan unlimited = new InternetPlan();
        unlimited.setName("Unlimited");
        unlimited.setNumberOfGb(999);
        unlimited.setCost(80);

        internetPlans.put(mini.getNumberOfGb(), mini);
        internetPlans.put(comfortable.getNumberOfGb(), comfortable);
        internetPlans.put(huge.getNumberOfGb(), huge);
        internetPlans.put(unlimited.getNumberOfGb(), unlimited);

    }

    public InternetPlan chooseInternetPlanByGb(double numberOfGb ) {

        for (Map.Entry<Double, InternetPlan> entry : internetPlans.entrySet()) {
            if( numberOfGb <= entry.getKey() ){
                return entry.getValue();
            }
        }

        return internetPlans.get(999.0);
    }
}
