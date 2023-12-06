package com.example.mgckiosk

class BucketMenu : AbstractMenu() {

    //val array = arrayOf("주문","취소")
    override fun displayInfo() {

        println("장바구니에 추가하시겠습니까?\n 1. 네,  2.아니요")
        var choice = isValidNum(2)
        when (choice) {
            1 -> {
                var coffee = BucketMenu()
                coffee.displayInfo()
            }
            2 -> {
                val food = FoodMenu()
                food.displayInfo()
            }
        }
    }
}