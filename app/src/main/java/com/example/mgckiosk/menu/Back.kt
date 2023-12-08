package com.example.mgckiosk.menu

interface Back {
    fun back(Page: AbstractMenu) {
        when(Page) {
            is DrinkMenu, is FoodMenu, is ProductMenu -> {
                val mainMenu = MainMenu()
                mainMenu.displayInfo()
            }
            is CoffeeMenu, is AdeJuiceMenu, is SmoothieFrappeMenu, is TeaMenu -> {
                val drink = DrinkMenu()
                drink.displayInfo()
            }

        }
    }
}