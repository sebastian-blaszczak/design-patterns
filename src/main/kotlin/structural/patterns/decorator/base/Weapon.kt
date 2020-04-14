package structural.patterns.decorator.base

interface Weapon {
    fun description(): String
    fun shoot(): String
    fun cost(): Long
}