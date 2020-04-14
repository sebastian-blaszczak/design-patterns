package structural.patterns.decorator

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertTrue
import structural.patterns.decorator.base.M4
import structural.patterns.decorator.decorator.Magazine
import structural.patterns.decorator.decorator.Sight
import structural.patterns.decorator.decorator.Silencer


class DecoratorTest {

    @Test
    fun shouldWeaponBeCreatedWithSilencerMagazineAndSight() {
        val weaponWithAccessories = Sight(Magazine(Silencer(M4())))

        val shoot = weaponWithAccessories.shoot()
        val cost = weaponWithAccessories.cost()
        val description = weaponWithAccessories.description()

        assertTrue(shoot.contains("aim"))
        assertTrue(cost == 950L)
        assertTrue(description.contains("Sight"))
        assertTrue(description.contains("Magazine"))
        assertTrue(description.contains("Silencer"))
    }
}