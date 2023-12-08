package com.example.mgckiosk.menu

class CoffeeMenu : AbstractMenu() {
    val coffees = arrayOf(arrayOf("할메가커피",1500,"우리 할머니께서 즐겨드시던 달달한 믹스 커피 스타일로 만든 메가MGC커피만의 시원한 커피 음료")
        ,arrayOf("카라멜 마끼야또",2500,"폼 밀크 속에 진한 에스프레소와 달콤한 카라멜을 가미해 부드럽게 즐기는 커피")
        ,arrayOf("티라미수라떼",2500,"에스프레소와 티라미수 소스 & 우유 그리고 풍미를 더해주는 달달한 크림까지 곁들여 완성한 티라미수 라떼")
        ,arrayOf("헤이즐넛 아메리카노",2000,"아메리카노에 헤이즐넛의 풍성한 향과 달콤함을 담아 향긋하고 부드럽게 즐기는 커피")
        ,arrayOf("바닐라 아메리카노",3500,"아메리카노에 바닐라의 부드러운 향과 달콤함을 조화롭게 담아낸 커피")
        ,arrayOf("연유라떼",1000,"\"향기로운 에스프레소 샷, 부드러운 우유 그리고 달콤한 연유가 조화롭게 어우러진 라떼")
    )

    override fun displayInfo() {
        for(i in coffees.indices){
            println("${i+1}. ${coffees[i][0]} | ${coffees[i][1]} | ${coffees[i][2]}")
        }
        println("0.뒤로")
        var choice = isValidNum(coffees.size)
        when (choice) {
            1 -> {
                var coffee = CoffeeMenu()
                coffee.displayInfo()
            }
            2 -> {
                val food = FoodMenu()
                food.displayInfo()
            }
            3 -> {
                val product = ProductMenu()
                product.displayInfo()
            }
            4 -> {
                val product = ProductMenu()
                product.displayInfo()
            }
            5 -> {
                val product = ProductMenu()
                product.displayInfo()
            }
            6 -> {
                val product = ProductMenu()
                product.displayInfo()
            }
            0 ->{

            }
        }
    }
}