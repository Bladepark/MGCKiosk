package com.example.mgckiosk.menu

class FoodMenu : AbstractMenu() {
    val deserts = arrayOf(
        arrayOf("뚱크림치즈약과쿠키",2500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("말차스모어쿠키",2000,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("초콜릿칩 쿠키",1000,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("몽쉘케이크",1900,"진하고 폭신한 초콜릿 스펀지 사이에 부드러운 생크림이 듬뿍 들어간 몽쉘 케이크.")
        ,arrayOf("치즈 케익",2400,"진한 치즈의 맛을 달콤하고 부드럽게 느낄 수 있는 케이크.")
        ,arrayOf("초코무스 케익",2300,"달콤한 초콜릿 본연의 맛을 더 진하게 느낄 수 있는 케이크.")
        ,arrayOf("와앙 피자 보름달빵",5500,"한끼로도 든든한 중독적인 추억의 와앙 큰 소시지 피자빵")
        ,arrayOf("플레인크로플",3500,"버터풍미가 가득한 크루와상의 바삭함과 와플의 부드러움을 합친 겉바속촉 베이커리 메뉴.")
        ,arrayOf("아이스허니와앙슈",1800,"꿀을 섞은 크림을 바삭한 쿠키슈 안에 넣어, 건강하고 맛있게 완성한 디저트.")
        ,arrayOf("햄앤치즈샌드",2200,"햄과 치즈의 조화로운 한끼를 만끽할 수 있는 메가커피 샌드위치")

    )
    override fun displayInfo() {
        for(i in deserts.indices){
            println("${i+1}. ${deserts[i][0]} | ${deserts[i][1]} | ${deserts[i][2]}")
        }
        println("0.뒤로")
        var choice = isValidNum(deserts.size)
        when (choice) {
            1 -> {
                val drink = DrinkMenu()
                drink.displayInfo()
            }
            2 -> {
                val adeJuice = AdeJuiceMenu()
                adeJuice.displayInfo()
            }
            3 -> {
                val tea = TeaMenu()
                tea.displayInfo()
            }
            0 ->{
                back(this)
            }
        }
    }

}