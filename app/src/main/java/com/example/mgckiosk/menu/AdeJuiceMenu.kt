package com.example.mgckiosk.menu

class AdeJuiceMenu : AbstractMenu(){
    val adeJuices = arrayOf(arrayOf("라임모히또",1500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("레몬에이드",2500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("블루레몬에이드",2500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("자몽에이드",2000,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("청포도에이드",3500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("유니콘매직에이드(핑크)",1000,"대충 맛과 향이 좋다는 설명")
    )
    override fun displayInfo() {
        for(i in adeJuices.indices){
            println("${i+1}. ${adeJuices[i][0]} | ${adeJuices[i][1]} | ${adeJuices[i][2]}")
        }
        println("0.뒤로")
        var choice = isValidNum(adeJuices.size)
        when (choice) {
            1 -> {

                //val LimeMojito = AdeJuice()
                //LimeMojito.displayInfo()
            }
            2 -> {
                //val food = AdeJuice()
               // food.displayInfo()
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