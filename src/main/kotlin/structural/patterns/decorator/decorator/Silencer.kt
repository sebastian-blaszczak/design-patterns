package structural.patterns.decorator.decorator

import structural.patterns.decorator.base.Weapon

class Silencer(private val weapon: Weapon) : Accessory() {
    override fun description(): String {
        return weapon.description() + " with Silencer"
    }

    override fun shoot(): String {
        return weapon.description().toLowerCase()
    }

    override fun cost(): Long {
        return weapon.cost() + 50L
    }

    override fun formattedCost(): String {
        return "Custom weapon costs: $${cost()}"
    }
}