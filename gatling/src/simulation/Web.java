import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpProtocolBuilder;

import java.util.Map;

import static io.gatling.javaapi.core.CoreDsl.csv;
import static io.gatling.javaapi.core.CoreDsl.rampUsers;
import static io.gatling.javaapi.core.CoreDsl.scenario;
import static io.gatling.javaapi.http.HttpDsl.http;
import static io.gatling.javaapi.http.HttpDsl.status;

public class Web extends Simulation {
    public Web() {
        HttpProtocolBuilder httpProtocol = http
                .baseUrl("http://localhost:8080")
                //.inferHtmlResources()
                .acceptEncodingHeader("gzip, deflate")
                .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:109.0) Gecko/20100101 Firefox/110.0");

        Map<String, String> headers = Map.of("Accept", "application/json,text/plain",
                "Sec-Fetch-Dest", "empty",
                "Sec-Fetch-Mode", "cors",
                "Sec-Fetch-Site", "same-origin");

        ScenarioBuilder scn = scenario("web")
                .feed(csv("page.csv").random())
                .exec(http("load")
                        .get("/load/#{pageId}")
                        .check(status().is(200))
                        .headers(headers));

        setUp(scn
                .injectOpen(rampUsers(10000).during(10))
                .protocols(httpProtocol));
    }
}
