package structural.patterns.decorator.decorator

import structural.patterns.decorator.base.Weapon

abstract class Accessory : Weapon {
    abstract fun formattedCost(): String
}