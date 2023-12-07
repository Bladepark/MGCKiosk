package com.example.mgckiosk

import com.example.mgckiosk.menu.MGCMenu
import com.example.mgckiosk.menu.beverage.Beverage
import com.example.mgckiosk.menu.beverage.adeJuice.AdeJuice
import com.example.mgckiosk.menu.beverage.adeJuice.BlueLemonAde
import com.example.mgckiosk.menu.beverage.adeJuice.CherryCoke
import com.example.mgckiosk.menu.beverage.adeJuice.GrapefruitAde
import com.example.mgckiosk.menu.beverage.adeJuice.GreenGrapeAde
import com.example.mgckiosk.menu.beverage.adeJuice.LimeMojito
import com.example.mgckiosk.menu.beverage.adeJuice.MegaAde
import com.example.mgckiosk.menu.beverage.adeJuice.UnicornMagicAde
import com.example.mgckiosk.menu.beverage.coffee.Americano
import com.example.mgckiosk.menu.beverage.coffee.CaramelMacchiato
import com.example.mgckiosk.menu.beverage.coffee.Coffee
import com.example.mgckiosk.menu.beverage.coffee.Espresso
import com.example.mgckiosk.menu.beverage.coffee.MegaMixCoffee
import com.example.mgckiosk.menu.beverage.coffee.VanillaLatte
import com.example.mgckiosk.menu.beverage.smoothieFrappe.ChocolateHoneyPongCrush
import com.example.mgckiosk.menu.beverage.smoothieFrappe.CookieFrappe
import com.example.mgckiosk.menu.beverage.smoothieFrappe.GreenTeaFrappe
import com.example.mgckiosk.menu.beverage.smoothieFrappe.MangoYogurtSmoothie
import com.example.mgckiosk.menu.beverage.smoothieFrappe.PlainYogurtSmoothie
import com.example.mgckiosk.menu.beverage.smoothieFrappe.SmoothieFrappe
import com.example.mgckiosk.menu.beverage.smoothieFrappe.StrawberryPongCrush
import com.example.mgckiosk.menu.beverage.smoothieFrappe.StrawberryYogurtSmoothie
import com.example.mgckiosk.menu.beverage.tea.ApplecitronTea
import com.example.mgckiosk.menu.beverage.tea.Chamomile
import com.example.mgckiosk.menu.beverage.tea.EarlGrey
import com.example.mgckiosk.menu.beverage.tea.GreenTea
import com.example.mgckiosk.menu.beverage.tea.HoneyGrapefruitBlackTea
import com.example.mgckiosk.menu.beverage.tea.Tea
import com.example.mgckiosk.menu.food.Food
import com.example.mgckiosk.menu.food.bread.Bread
import com.example.mgckiosk.menu.food.bread.CornMayoBread
import com.example.mgckiosk.menu.food.bread.Croissant
import com.example.mgckiosk.menu.food.bread.HoneyBread
import com.example.mgckiosk.menu.food.bread.Hotdog
import com.example.mgckiosk.menu.food.bread.PizzaBread
import com.example.mgckiosk.menu.food.bread.PotatoBread
import com.example.mgckiosk.menu.food.bread.SaltyButterRoll
import com.example.mgckiosk.menu.food.cake.Cake
import com.example.mgckiosk.menu.food.cake.CheeseCake
import com.example.mgckiosk.menu.food.cake.ChocolateMousseCake
import com.example.mgckiosk.menu.food.cake.MonCherCreamCake
import com.example.mgckiosk.menu.food.cake.OatmealPancake
import com.example.mgckiosk.menu.food.cake.TiramisuCake
import com.example.mgckiosk.menu.food.cake.TiramisuPancake
import com.example.mgckiosk.menu.food.cookiemacaron.ChocolateChipCookie
import com.example.mgckiosk.menu.food.cookiemacaron.CookieMacaron
import com.example.mgckiosk.menu.food.cookiemacaron.CreamCheeseYakgwaCookie
import com.example.mgckiosk.menu.food.cookiemacaron.MacadamiaCookie
import com.example.mgckiosk.menu.food.cookiemacaron.MatchaSmoresCookie
import com.example.mgckiosk.menu.food.cookiemacaron.MegaChocolateMacaron
import com.example.mgckiosk.menu.food.cookiemacaron.StrawberryYogurtMacaron
import com.example.mgckiosk.menu.food.cookiemacaron.UnicornFrappeMacaron
import com.example.mgckiosk.menu.product.Product
import com.example.mgckiosk.menu.product.mug.BasicMug
import com.example.mgckiosk.menu.product.mug.MGCMug
import com.example.mgckiosk.menu.product.mug.Mug
import com.example.mgckiosk.menu.product.stickcoffee.StickCoffee
import com.example.mgckiosk.menu.product.stickcoffee.StickDecafAmericano
import com.example.mgckiosk.menu.product.stickcoffee.StickOriginalAmericano
import com.example.mgckiosk.menu.product.stickcoffee.StickSteviaDecafMixCoffee
import com.example.mgckiosk.menu.product.stickcoffee.StickSteviaMixCoffee
import com.example.mgckiosk.menu.product.teapleasure.TeaPleasure
import com.example.mgckiosk.menu.product.teapleasure.TeaPleasureBloomingChamomile
import com.example.mgckiosk.menu.product.teapleasure.TeaPleasureFruityRooibos
import com.example.mgckiosk.menu.product.teapleasure.TeaPleasureSweetHibiscus
import com.example.mgckiosk.menu.product.tumbler.BasicTumbler
import com.example.mgckiosk.menu.product.tumbler.MGCTumbler
import com.example.mgckiosk.menu.product.tumbler.Tumbler


object MenuList {
    val menuList = arrayOf(
        MGCMenu(),
        Beverage(),
        Food(),
        Product(),
        Coffee(),
        Tea(),
        AdeJuice(),
        SmoothieFrappe(),
        Espresso(),
        Americano(),
        MegaMixCoffee(),
        CaramelMacchiato(),
        VanillaLatte(),
        GreenTea(),
        EarlGrey(),
        Chamomile(),
        ApplecitronTea(),
        HoneyGrapefruitBlackTea(),
        MegaAde(),
        BlueLemonAde(),
        UnicornMagicAde(),
        GrapefruitAde(),
        GreenGrapeAde(),
        LimeMojito(),
        CherryCoke(),
        CookieFrappe(),
        GreenTeaFrappe(),
        PlainYogurtSmoothie(),
        StrawberryYogurtSmoothie(),
        MangoYogurtSmoothie(),
        StrawberryPongCrush(),
        ChocolateHoneyPongCrush(),
        PizzaBread(),
        CornMayoBread(),
        HoneyBread(),
        SaltyButterRoll(),
        Croissant(),
        PotatoBread(),
        Hotdog(),
        MonCherCreamCake(),
        ChocolateMousseCake(),
        TiramisuCake(),
        CheeseCake(),
        OatmealPancake(),
        TiramisuPancake(),
        CreamCheeseYakgwaCookie(),
        MatchaSmoresCookie(),
        MacadamiaCookie(),
        ChocolateChipCookie(),
        StrawberryYogurtMacaron(),
        MegaChocolateMacaron(),
        UnicornFrappeMacaron(),
        MGCMug(),
        Mug(),
        StickCoffee(),
        StickSteviaDecafMixCoffee(),
        StickSteviaMixCoffee(),
        StickDecafAmericano(),
        StickOriginalAmericano(),
        BasicMug(),
        Bread(),
        Cake(),
        CookieMacaron(),
        TeaPleasure(),
        TeaPleasureSweetHibiscus(),
        TeaPleasureFruityRooibos(),
        TeaPleasureBloomingChamomile(),
        BasicTumbler(),
        MGCTumbler(),
        Tumbler()
    ).toCollection(ArrayList())
}

