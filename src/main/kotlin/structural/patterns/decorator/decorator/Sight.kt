package structural.patterns.decorator.decorator

import structural.patterns.decorator.base.Weapon

class Sight(private val weapon: Weapon) : Accessory() {
    override fun description(): String {
        return weapon.description() + " with Sight"
    }

    override fun shoot(): String {
        return weapon.shoot() + " and aim"
    }

    override fun cost(): Long {
        return weapon.cost() + 120L
    }

    override fun formattedCost(): String {
        return "Custom weapon costs: $${cost()}"
    }

}