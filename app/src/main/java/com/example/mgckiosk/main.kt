package com.example.mgckiosk

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Date


// 메가 커피 키오스크 팀 과제 3조 파이팅!!


fun main() {
    //val menu = Menu()
    val coffees = arrayOf(arrayOf("할메가커피",1500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("할메가커피",2500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("왕할메가커피",2500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("헤이즐넛 아메리카노",2000,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("바닐라 아메리카노",3500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("에스프레소",1000,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("젤라또 아포가토",3500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("아메리카노",2700,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("티라미수라떼",1800,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("메가리카노",1700,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("연유라떼",1900,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("카라멜마끼아또",2200,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("카페라떼",2400,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("카페모카",2300,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("카푸치노",2100,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("콜드브루라떼",3000,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("콜드브루오리지널",3200,"대충 맛과 향이 좋다는 설명")
    )
    val teas = arrayOf(arrayOf("녹차",1500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("사과유자차",2500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("얼그레이",2500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("캐모마일",2000,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("페퍼민트",3500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("에스프레소",1000,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("복숭아아이스티",3500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("유자차",2700,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("레몬차",1800,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("자몽차",1700,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("허니자몽블랙티",1900,"대충 맛과 향이 좋다는 설명")
    )
    val adeJuices = arrayOf(arrayOf("라임모히또",1500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("레몬에이드",2500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("블루레몬에이드",2500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("자몽에이드",2000,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("청포도에이드",3500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("유니콘매직에이드(핑크)",1000,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("유니콘매직에이드(블루)",3500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("체리콕",2700,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("메가에이드",2600,"대충 맛과 향이 좋다는 설명")
    )
    val deserts = arrayOf(arrayOf("와앙 피자 보름달빵",1500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("와앙 콘마요 보름달빵",2500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("뚱크림치즈약과쿠키",2500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("말차스모어쿠키",2000,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("마카다미아 쿠키",3500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("초콜릿칩 쿠키",1000,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("플레인크로플",3500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("아이스크림크로플",2700,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("아이스허니와앙슈",1800,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("크로크무슈",1700,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("몽쉘케이크",1900,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("햄앤치즈샌드",2200,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("치즈 케익",2400,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("초코무스 케익",2300,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("티라미수 케익",2100,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("허니브레드",3000,"대충 맛과 향이 좋다는 설명")
    )
    var orderList = ArrayList<Drink>()
    println("고객이 가진 돈을 입력해주세요")
    var coin = isNumber()
    var cust = Customer(coin)

    while (true) {
        mainView()
        if(orderList.isNotEmpty()){
            println("[ 장바구니 ]")
            println("5. 주문 : 내용 확인 후 주문합니다.")
            println("6. 취소 : 진행중인 주문을 취소합니다.")
        }

//        orderList.forEach{ it->
//            println(it.name)
//            println(it.explanation)
//            println(it.price)
//        }

        var cyclePoint=true
        var choice= isNumber()
        when (choice) {
            0 -> System.exit(0)
            1 -> {
                while (cyclePoint) {
                    for(i in coffees.indices){
                        println("${i+1}. ${coffees[i][0]} | ${coffees[i][1]} | ${coffees[i][2]}")
                    }
                    println("0.뒤로가기")
                    var choice2= isNumber()

                    when(choice2) {
                        0 -> {
                            cyclePoint=false
                            continue
                        }
                        in 1..coffees.size -> {
                            orderList+=selectMenu(
                                coffees[choice2-1][0].toString(),
                                coffees[choice2-1][1].toString().toInt(),
                                coffees[choice2-1][2].toString())
                            var choice3 = isNumber()
                            if(choice3 == 1){
                                println("${ coffees[choice2-1][0]}가 장바구니에 추가되었습니다.")
                                cyclePoint=false
                                continue
                            } else if(choice3 == 2) { //취소
                                println("취소하셨습니다.")
                            }else{
                                println("잘못된 입력입니다..")
                                //var choice2= isNumber()
                            }
                        }
                        else -> {
                            println("잘못된 입력입니다")
                        }
                    }//when
                }//while
            } //1
            2 -> {
                while (cyclePoint) {
                    for(i in teas.indices){
                        println("${i+1}. ${teas[i][0]} | ${teas[i][1]} | ${teas[i][2]}")
                    }
                    println("0.뒤로가기")
                    var choice2 = isNumber()

                    when(choice2) {
                        0 -> {
                            cyclePoint=false
                            continue
                        }
                        in 1..teas.size -> {
                            orderList += selectMenu(
                                teas[choice2-1][0].toString(),
                                teas[choice2-1][1].toString().toInt(),
                                teas[choice2-1][2].toString())
                                var choice3 = readln()
                            if(choice3 =="1"){
                                println("${ teas[choice2-1][0]}가 장바구니에 추가되었습니다.")
                                //bucket = bucket.plus((teas[choice2.toInt()-1]))
                                cyclePoint=false
                                continue
                            } else if(choice3 == "2") { //취소
                                println("취소하셨습니다.")
                            }else{
                                println("잘못된 입력입니다..")
                                choice2= isNumber()
                            }
                        }
                        else -> {
                            println("잘못된 입력입니다")
                        }
                    }//when
                }//while
            }
            3 -> {
                while (cyclePoint) {
                    for(i in adeJuices.indices){
                        println("${i+1}. ${adeJuices[i][0]} | ${adeJuices[i][1]} | ${adeJuices[i][2]}")
                    }
                    println("0.뒤로가기")
                    var choice2= isNumber()

                    when(choice2) {
                        0 -> {
                            cyclePoint=false
                            continue
                        }
                        in 1..adeJuices.size -> {
                            orderList += selectMenu(
                                adeJuices[choice2-1][0].toString(),
                                adeJuices[choice2-1][1].toString().toInt(),
                                adeJuices[choice2-1][2].toString())
                            var choice3 = isNumber()
                            if(choice3 ==1){
                                println("${ adeJuices[choice2-1][0]}가 장바구니에 추가되었습니다.")
                                cyclePoint=false
                                continue
                            } else if(choice3 == 2) { //취소
                                println("취소하셨습니다.")
                            }else{
                                println("잘못된 입력입니다..")
                                choice2= isNumber()
                            }
                        }
                        else -> {
                            println("잘못된 입력입니다")
                        }
                    }//when
                }//while

            }
            4 -> {
                while (cyclePoint) {
                    for(i in  deserts.indices){
                        println("${i+1}. ${deserts[i][0]} | ${ deserts[i][1]} | ${ deserts[i][2]}")
                    }
                    println("0.뒤로가기")
                    var choice2= isNumber()

                    when(choice2) {
                        0 -> {
                            cyclePoint=false
                            continue
                        }
                        in 1..deserts.size -> {
                            orderList += selectMenu(
                                deserts[choice2-1][0].toString(),
                                deserts[choice2-1][1].toString().toInt(),
                                deserts[choice2-1][2].toString())
                            var choice3 = readln()
                            if(choice3 =="1"){
                                println("${ deserts[choice2-1][0]}가 장바구니에 추가되었습니다.")
                                cyclePoint=false
                                continue
                            } else if(choice3 == "2") { //취소
                                println("취소하셨습니다.")
                            }else{
                                println("잘못된 입력입니다..")
                                choice2= isNumber()
                            }
                        }
                        else -> {
                            println("잘못된 입력입니다")
                        }
                    }//when
                }//while

            } //4
            5 ->{
                if(orderList.isNotEmpty()){
                    println("[ 주문내역 ]")
                    var total=0
                    orderList.forEach{ it->
                        println("${it.name} | ${it.price} | ${it.explanation}")
                        total+=it.price
                    }
                    println("[ 총합 ]")
                    println("￦ ${total} \n")
                    println("1. 주문     2. 메뉴판으로")
                    var choice3 = isNumber()
                    when(choice3){
                        1 ->{
                            if(cust.money>=total){
                                var localDate = LocalDateTime.now()
                                val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss")
                                val now = localDate.format(formatter)
                                println("결제를 완료했습니다.(${now})")
                                cust.money-=total
                                orderList.clear()
                            } else{
                                println("현재 잔액은 ${cust.money} 으로 ${total-cust.money}이 부족해서 주문할 수 없습니다.")
                            }
                        }
                        2 -> continue
                    }
                }else{
                    println("잘못된 입력입니다")
                    continue
                }
            } //5
            6 -> {
                orderList.clear()
            }
            else -> {
                println("잘못된 입력입니다")
                continue
            }
        }//when
    }

}

fun mainView(){
    println("MEGA커피에 오신 것을 환영합니다!!!")
    println("[ 메뉴판 ]")
    println("1.커피")
    println("2.티")
    println("3.에이드/주스")
    println("4.디저트")
    println("0.프로그램 종료")

}

fun selectMenu(name: String, price:Int,explanation: String) :Drink{

    var drink= Drink(name, price, explanation)

    println("${drink.name} | ${drink.price} | ${drink.explanation}")
    println("위 메뉴를 장바구니에 추가하시겠습니까?")
    println("1. 확인       2. 취소")

    return drink
}

fun isNumber() : Int{
    while (true) {
        try {
            var num = readln().toInt()
            return num
        } catch (e: NumberFormatException) {
            println("숫자를 입력해주세요.")
        }
    }
}