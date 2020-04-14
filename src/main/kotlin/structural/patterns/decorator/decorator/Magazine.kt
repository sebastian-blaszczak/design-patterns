package structural.patterns.decorator.decorator

import structural.patterns.decorator.base.Weapon

class Magazine(private val weapon: Weapon) : Accessory() {
    override fun description(): String {
        return weapon.description() + " with Magazine"
    }

    override fun shoot(): String {
        return weapon.description() + " " + weapon.description()
    }

    override fun cost(): Long {
        return weapon.cost() + 80L
    }

    override fun formattedCost(): String {
        return "Custom weapon costs: $${cost()}"
    }
}