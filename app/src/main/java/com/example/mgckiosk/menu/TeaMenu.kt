package com.example.mgckiosk.menu

class TeaMenu : AbstractMenu() {
    val teas = arrayOf(arrayOf("녹차",1500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("사과유자차",2500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("얼그레이",2500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("캐모마일",2000,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("페퍼민트",3500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("에스프레소",1000,"대충 맛과 향이 좋다는 설명")
    )
    override fun displayInfo() {
        for(i in teas.indices){
            println("${i+1}. ${teas[i][0]} | ${teas[i][1]} | ${teas[i][2]}")
        }
        println("0.뒤로")
        var choice = isValidNum(teas.size)
        when (choice) {
            1 -> {
                val drink = CoffeeMenu()
                drink.displayInfo()
            }
            2 -> {
                val food = FoodMenu()
                food.displayInfo()
            }
            3 -> {
                val product = ProductMenu()
                product.displayInfo()
            }
            0 ->{

            }
        }
    }
}