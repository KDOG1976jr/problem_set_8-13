fun main() {
    val Steps = 4000
    val calBurned = PEDOMETERstepsTOcalories(Steps);
    println("Walking $Steps steps burns $calBurned calories")
}
fun PEDOMETERstepsTOcalories(NumberOFStepS: Int) : Double {
    val calBurnedPerStep = 0.04
    val totalCal = NumberOFStepS * calBurnedPerStep
    return totalCal
}