package com.example.looptest

import com.codeborne.selenide.Selectors
import com.codeborne.selenide.Selectors.byXpath
import com.codeborne.selenide.Selenide.element

class UniverseOfBirdsView {
    val addToCartButton = element("button[id='AddToCart-product-template']")
    val catalogMenuButton = element(byXpath("/html/body/div[2]/div/header/div/nav/ul/li[2]/a"))
    val viewCartButton = element(byXpath("/html/body/div[2]/div/header/div/div[2]/div/a"))
    val fosterBirdsProduct = element(Selectors.byText("Foster Birds!"))
    val yourCartHeader = element(Selectors.byText("Your cart"))
    val homePageProduct = element("div[class='h4 grid-view-item__title']")
    val shoppingCartCountIcon = element(byXpath("//html/body/div[2]/div/header/div/div[2]/div/a/div/span[1]"))
    val cartProductQuantity = element(byXpath("//html/body/div[3]/main/div/div/form/table/tbody/tr/td[4]/div/input"))
}
