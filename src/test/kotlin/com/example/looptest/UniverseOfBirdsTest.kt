package com.example.looptest

import com.codeborne.selenide.Condition.*
import com.codeborne.selenide.Configuration
import com.codeborne.selenide.Selenide.*
import org.testng.annotations.*
import org.testng.Assert.*

class UniverseOfBirdsTest {
    private val mainPage = UniverseOfBirdsView()

    @BeforeMethod
    fun setUpAll() {

        Configuration.browserSize = "1280x800"
    }

    @BeforeMethod
    fun setUp() {
        open("https://protect-us.mimecast.com/s/z31AC4xP90tzrK0okTOOsHL?domain=universe-of-birds.myshopify.com/")
    }

    @Test
    fun loopTestUniverseOfBirds() {
        mainPage.homePageProduct.shouldHave(text("Speedy"))
        assertEquals(title(), "All The Birds – Universe of Birds")
        mainPage.catalogMenuButton.click()
        mainPage.fosterBirdsProduct.shouldBe(visible)
        mainPage.fosterBirdsProduct.click()
        mainPage.addToCartButton.click()
        mainPage.shoppingCartCountIcon.shouldHave(text("1"));
        mainPage.viewCartButton.click()
        mainPage.yourCartHeader.shouldBe(visible)
        mainPage.fosterBirdsProduct.shouldBe(visible)
        assertEquals(mainPage.cartProductQuantity.value, "1")
        mainPage.shoppingCartCountIcon.shouldHave(text("1"));
    }
}
