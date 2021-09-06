package com.example.looptest

import com.codeborne.selenide.Selectors
import com.codeborne.selenide.Selectors.byXpath
import com.codeborne.selenide.Selenide.element

class UniverseOfBirdsView {
    val addToCartButton = element("button[id='AddToCart-product-template']")
    val catalogMenuButton = element(byXpath("/html/body/div[2]/div/header/div/nav/ul/li[2]/a"))
    val fosterBirdsProduct = element(Selectors.byText("Foster Birds!"))
    val homePageProduct = element("div[class='h4 grid-view-item__title']")
    val shoppingCartCountIcon = element(byXpath("//html/body/div[2]/div/header/div/div[2]/div/a/div/span[1]"))

}
