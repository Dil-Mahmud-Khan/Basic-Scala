package basics

// TODO: Complete the expressions marked as ???.

case class Param(name: String)

class ComplexConfig(param1: Param,
                    param2: Param,
                    param3: Param,
                    param4: Param,
                    param5: Param)

class Application(specificParam: Param)(complexConfig: ComplexConfig)

object GivenUsing extends App {

  // Complex configuration params common to all apps
  val p1: Param = Param("p1")
  val p2: Param = Param("p2")
  val p3: Param = Param("p3")
  val p4: Param = Param("p4")
  val p5: Param = Param("p5")

  // Specific config params
  val specificParam1: Param = Param("App param1")
  val specificParam2: Param = Param("App param2")

  val complexConfig: ComplexConfig = new ComplexConfig(p1, p2, p3, p4, p5)

  // Application code
  val app: Application = new Application(specificParam1)(complexConfig);
  val app2: Application = new Application(specificParam2)(complexConfig);

}
