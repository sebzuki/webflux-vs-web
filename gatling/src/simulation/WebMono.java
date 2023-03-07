import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpProtocolBuilder;

import java.util.Map;

import static io.gatling.javaapi.core.CoreDsl.csv;
import static io.gatling.javaapi.core.CoreDsl.rampUsers;
import static io.gatling.javaapi.core.CoreDsl.scenario;
import static io.gatling.javaapi.http.HttpDsl.http;
import static io.gatling.javaapi.http.HttpDsl.status;

public class WebMono extends Simulation {
    public WebMono() {
        HttpProtocolBuilder httpProtocol = http
                .baseUrl("http://localhost:8081")
                //.inferHtmlResources()
                .acceptEncodingHeader("gzip, deflate")
                .acceptLanguageHeader("fr,fr-FR;q=0.5")
                .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:109.0) Gecko/20100101 Firefox/110.0");

        Map<String, String> headers = Map.of("Accept", "application/json, text/plain, */*",
                                            "Sec-Fetch-Dest", "empty",
                                            "Sec-Fetch-Mode", "cors",
                                            "Sec-Fetch-Site", "same-origin");

        ScenarioBuilder scn = scenario("web")
                .feed(csv("page.csv").random())
                .exec(http("load-mono")
                        .get("/load-mono/#{pageId}")
                        .check(status().is(200))
                        .headers(headers));

        setUp(scn.injectOpen(
                        rampUsers(35000).during(10))
                .protocols(httpProtocol));
    }
}
