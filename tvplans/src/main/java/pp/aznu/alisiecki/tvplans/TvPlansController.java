package pp.aznu.alisiecki.tvplans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pp.aznu.alisiecki.tvplans.service.TvPlansService;

@RestController
public class TvPlansController {

    private static final Logger log = LoggerFactory.getLogger(TvPlansController.class);

    @GetMapping("/tvplan")
    public TvPlan tvplan(@RequestParam(value = "numberOfChannels") double numberOfChannels) {
        log.info("Get request numberOfChannels value: {}", numberOfChannels);
        TvPlan choosenPlan = TvPlansService.chooseTvPlanByNumberOfChannels(numberOfChannels);
        log.info("Choosen plan: {}", choosenPlan.toString());
        return choosenPlan;
    }
}
