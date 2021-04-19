package computerdatabase

import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder

class WebFluxRestSimulation extends Simulation {

  val httpProtocol: HttpProtocolBuilder = http
    .baseUrl("http://localhost:8081") // Here is the root for all relative URLs

  val scn: ScenarioBuilder = scenario("Web-Flux") // A scenario is a chain of requests and pauses
    .exec(http("Web-Flux-Load-Rest")
      .get("/load-rest"))

  setUp(scn.inject(constantUsersPerSec(1500).during(20))
    .protocols(httpProtocol))
}
