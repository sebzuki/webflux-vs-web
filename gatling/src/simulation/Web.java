import io.gatling.javaapi.core.FeederBuilder;
import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpProtocolBuilder;

import java.util.HashMap;
import java.util.Map;

import static io.gatling.javaapi.core.CoreDsl.csv;
import static io.gatling.javaapi.core.CoreDsl.rampUsers;
import static io.gatling.javaapi.core.CoreDsl.scenario;
import static io.gatling.javaapi.http.HttpDsl.http;

public class Web extends Simulation {
    {
        HttpProtocolBuilder httpProtocol = http
                .baseUrl("http://localhost:8080")
                .inferHtmlResources()
                .acceptEncodingHeader("gzip, deflate")
                .acceptLanguageHeader("fr,fr-FR;q=0.5")
                .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:109.0) Gecko/20100101 Firefox/110.0");

        FeederBuilder.Batchable<String> random = csv("page.csv").random();

        Map<String, String> headers = new HashMap<>();
        headers.put("Accept", "application/json, text/plain, */*");
        headers.put("Sec-Fetch-Dest", "empty");
        headers.put("Sec-Fetch-Mode", "cors");
        headers.put("Sec-Fetch-Site", "same-origin");

        ScenarioBuilder scn = scenario("web")
                .feed(random)
                .exec(http("load")
                        .get("/load/#{pageId}")
                        .headers(headers));

        setUp(scn.injectOpen(
                        rampUsers(30000).during(30))
                .protocols(httpProtocol));
    }
}
