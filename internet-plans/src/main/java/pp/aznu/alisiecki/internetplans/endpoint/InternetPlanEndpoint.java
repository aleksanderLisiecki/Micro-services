package pp.aznu.alisiecki.internetplans.endpoint;

import https.alisiecki_pp.internet_plans_soap.GetInternetPlanRequest;
import https.alisiecki_pp.internet_plans_soap.GetInternetPlanResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pp.aznu.alisiecki.internetplans.service.InternetPlansService;

@Endpoint
public class InternetPlanEndpoint {

    @Autowired
    private InternetPlansService internetPlansService;

    @PayloadRoot(namespace = "https://alisiecki.pp/internet-plans-soap",
            localPart = "getInternetPlanRequest")
    @ResponsePayload
    public GetInternetPlanResponse getInternetPlanRequest(@RequestPayload GetInternetPlanRequest request){
        GetInternetPlanResponse response = new GetInternetPlanResponse();
        response.setInternetPlan(internetPlansService.chooseInternetPlanByGb(request.getNumberOfGb()));
        return response;
    }

}
