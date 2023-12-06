package com.example.mgckiosk

class ProductMenu : AbstractMenu() {
    val mds = arrayOf(arrayOf("MGC 텀블러(웜그레이)",1500,"뛰어난 보온보냉력으로 하루종일 그대로, MGC 데일리 텀블러")
        ,arrayOf("메가 엠지씨 스틱 디카페인 아메리카노",2500,"물의 삼투압을 이용한 독일 워터 프로세스 방식으로 카페인을 줄이고,브라질 원두 특유의 산미와 달콤함, 바디감은 고스란히 담아 조화로운 맛을 느낄 수 있는 아메리카노")
        ,arrayOf("텀블러(실버)",2500,"기능성과 비주얼을 다잡은 메가MGC커피 텀블러.")
        ,arrayOf("머그(블랙)",2000,"일상 어디서든 활용하기 좋은 메가MGC커피 대용량 머그컵.")
    )
    override fun displayInfo() {
        for(i in mds.indices){
            println("${i+1}. ${mds[i][0]} | ${mds[i][1]} | ${mds[i][2]}")
        }
        println("0.뒤로")
        var choice = isValidNum(mds.size)
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
            4 -> {
                val tea = TeaMenu()
                tea.displayInfo()
            }
            0 ->{
                back(this)
            }
        }
    }
}