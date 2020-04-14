package structural.patterns.decorator.base

open class M4 : Weapon {
    private val description = "M4"
    private val cost = 700L

    override fun description(): String {
        return description
    }

    override fun shoot(): String {
        return "SHOOT! BAAAANG! BAAAANG!"
    }

    override fun cost(): Long {
        return cost
    }
}