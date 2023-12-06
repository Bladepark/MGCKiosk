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
    val smoothieFrappe = arrayOf(arrayOf("플레인요거트스무디",1500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("슈크림허니퐁크러쉬",2500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("망고요거트스무디",2500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("딸기퐁크러쉬",2000,"대충 맛과 향이 좋다는 설명")
    )
    val mds = arrayOf(arrayOf("MGC 텀블러(웜그레이)",1500,"뛰어난 보온보냉력으로 하루종일 그대로, MGC 데일리 텀블러")
        ,arrayOf("메가 엠지씨 스틱 디카페인 아메리카노",2500,"물의 삼투압을 이용한 독일 워터 프로세스 방식으로 카페인을 줄이고,브라질 원두 특유의 산미와 달콤함, 바디감은 고스란히 담아 조화로운 맛을 느낄 수 있는 아메리카노")
        ,arrayOf("텀블러(실버)",2500,"기능성과 비주얼을 다잡은 메가MGC커피 텀블러.")
        ,arrayOf("머그(블랙)",2000,"일상 어디서든 활용하기 좋은 메가MGC커피 대용량 머그컵.")
    )
    var orderList = ArrayList<GoodsCommon>()
    println("고객이 가진 돈을 입력해주세요")
    val coin = isNumber()
    val cust = Customer(coin)

    while (true) {
        mainView(orderList)


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
                            println("카페인 옵션을 선택해주세요. \n1. 고카페인,  2. 보통,  3.디카페인")

                            var decaffOption = isNumber()
                            var decaff =""
                            var hotIce =""
                            var check=true
                            var check2= true
                            while(check){
                                when(decaffOption){
                                    1 -> {decaff = "고카페인"
                                        check=false}
                                    2 -> {decaff = "보통"
                                        check=false}
                                    3 ->{decaff = "디카페인"
                                        check=false}
                                    else -> println("잘못된 입력입니다..")
                                }
                            }
                            println("핫 or 아이스 중에서 선택해주세요. \n1. 아이스,  2. 핫")
                            val iceOption = isNumber()
                            if(iceOption==1) {
                                hotIce = "아이스"
                            }else if(iceOption==2){
                                hotIce = "핫"
                            }
                            while(check2){
                                when(iceOption){
                                    1 -> {hotIce = "아이스"
                                        check2=false}
                                    2 -> {hotIce = "핫"
                                        check2=false}
                                    else -> println("잘못된 입력입니다..")
                                }
                            }
                            orderList+=addCoffee(
                                coffees[choice2-1][0].toString(),
                                coffees[choice2-1][1].toString().toInt(),
                                coffees[choice2-1][2].toString(),
                                decaff, hotIce)
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
                            orderList += addTea(
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
                            println("얼음 옵션을 선택해주세요. \n1. 얼음 많이,  2. 얼음 적게,  3. 얼음 없음")

                            val Option1 = isNumber()
                            var ice =""
                            var soda =""
                            var check=true
                            var check2= true

                            while(check){
                                when(Option1){
                                    1 -> {ice = "얼음 많이"
                                        check=false}
                                    2 -> {ice = "얼음 적게"
                                        check=false}
                                    3 ->{ice = "얼음 없음"
                                        check=false}
                                    else -> println("잘못된 입력입니다..")
                                }
                            }
                            println("탄산을 추가하실건가요? \n1. 네,  2. 아니요")
                            var Option2 = isNumber()

                            while(check){
                                when(Option2){
                                    1 -> { soda = "탄산 추가"
                                        check=false}
                                    2 -> { soda = "탄산 없음"
                                        check=false}
                                    else -> println("잘못된 입력입니다..")
                                }
                            }
                            orderList += addAdeJuice(
                                adeJuices[choice2-1][0].toString(),
                                adeJuices[choice2-1][1].toString().toInt(),
                                adeJuices[choice2-1][2].toString(),
                                ice, soda)
                            val choice3 = isNumber()
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
            4-> {
                while (cyclePoint) {
                    for(i in smoothieFrappe.indices){
                        println("${i+1}. ${smoothieFrappe[i][0]} | ${smoothieFrappe[i][1]} | ${smoothieFrappe[i][2]}")
                    }
                    println("0.뒤로가기")
                    var choice2= isNumber()

                    when(choice2) {
                        0 -> {
                            cyclePoint=false
                            continue
                        }
                        in 1..smoothieFrappe.size -> {
                            println("단 맛 옵션을 선택해주세요. \n1. 매우 달게,  2. 보통,  3.제로 슈가")

                            val Option1 = isNumber()
                            var sugar =""
                            var check= true

                            while(check){
                                when(Option1){
                                    1 -> { sugar = "매우 달게"
                                        check=false}
                                    2 -> { sugar = "보통게"
                                        check=false}
                                    3 ->{ sugar = "제로 슈가"
                                        check=false}
                                    else -> println("잘못된 입력입니다..")
                                }
                            }

                            orderList+= addSmoothiFrappe(
                                coffees[choice2-1][0].toString(),
                                coffees[choice2-1][1].toString().toInt(),
                                coffees[choice2-1][2].toString(),
                                sugar)
                            val choice3 = isNumber()
                            if(choice3 == 1){
                                println("${ smoothieFrappe[choice2-1][0]}가 장바구니에 추가되었습니다.")
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
            }
            5 -> {
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
                            println("식기도 같이 주문하시겠습니까?. \n1. 네,  2. 아니요")

                            val Option1 = isNumber()
                            var tableware =""
                            var check= true

                            while(check){
                                when(Option1){
                                    1 -> { tableware = "식기 있음게"
                                        check=false}
                                    2 -> { tableware = "식기 없음"
                                        check =false}
                                    else -> println("잘못된 입력입니다..")
                                }
                            }

                            orderList += addDesert(
                                deserts[choice2-1][0].toString(),
                                deserts[choice2-1][1].toString().toInt(),
                                deserts[choice2-1][2].toString(),
                                tableware)
                            val choice3 = readln()
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

            } //5
            6 -> {
                while (cyclePoint) {
                    for(i in  mds.indices){
                        println("${i+1}. ${mds[i][0]} | ${ mds[i][1]} | ${ mds[i][2]}")
                    }
                    println("0.뒤로가기")
                    var choice2= isNumber()

                    when(choice2) {
                        0 -> {
                            cyclePoint=false
                            continue
                        }
                        in 1..mds.size -> {
                            println("배달서비스를 이용하시겠습니까? \n1. 아니요,  2. 점포에서 받음,  3. 집에서 받음")

                            var Option1 = isNumber()
                            var delivey =""
                            var check= true

                            while(check){
                                when(Option1){
                                    1 -> { delivey = "아니요"
                                        check=false}
                                    2 -> { delivey = "점포에서 받음"
                                        check =false}
                                    3 -> { delivey = "집에서 받음"
                                        check =false}
                                    else -> println("잘못된 입력입니다..")
                                }
                            }

                            orderList += addProduct(
                                mds[choice2-1][0].toString(),
                                mds[choice2-1][1].toString().toInt(),
                                mds[choice2-1][2].toString(),
                                delivey)
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

            } //5
            7 ->{
                if(orderList.isNotEmpty()){
                    println("[ 주문내역 ]")
                    var total=0
                    orderList.forEach{ it->
                        it.displayInfo()
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
            8 -> {
                orderList.clear()
            }
            else -> {
                println("잘못된 입력입니다")
                continue
            }
        }//when
    }

}

fun mainView(orderList:ArrayList<GoodsCommon>){
    println("MEGA커피에 오신 것을 환영합니다!!!")
    println("[ 메뉴판 ]")
    println("1.커피")
    println("2.티")
    println("3.에이드&주스")
    println("4.스무디&프라페")
    println("5.디저트")
    println("6.상품")
    if(orderList.isNotEmpty()){
        println("[ 장바구니 ]")
        println("7. 주문 : 내용 확인 후 주문합니다.")
        println("8. 취소 : 진행중인 주문을 취소합니다.")
    }
    println("0.프로그램 종료")

}

fun addCoffee(name: String, price:Int,explanation: String,decaff:String, hotIce:String) : Coffee{

    var coffee= Coffee(name, price, explanation, decaff,hotIce)

    println("${coffee.name} | ${coffee.price} | ${coffee.caffeination}, ${coffee.hotIce}")
    println("위 메뉴를 장바구니에 추가하시겠습니까?")
    println("1. 확인       2. 취소")

    return coffee
}

fun addAdeJuice(name: String, price:Int,explanation: String,ice:String, soda:String) :AdeJuice{

    var adeJuice=  AdeJuice(name, price, explanation, ice, soda)

    println("${adeJuice.name} | ${adeJuice.price} | ${adeJuice.ice}, ${adeJuice.soda}")
    println("위 메뉴를 장바구니에 추가하시겠습니까?")
    println("1. 확인       2. 취소")

    return adeJuice
}

fun addTea(name: String, price:Int,explanation: String) : Tea{

    var tea= Tea(name, price, explanation)

    println("${tea.name} | ${tea.price} | 옵션 없음")
    println("위 메뉴를 장바구니에 추가하시겠습니까?")
    println("1. 확인       2. 취소")

    return tea
}
//
fun addSmoothiFrappe (name: String, price:Int,explanation: String,sugar:String) :SmoothiFrappe{

    var smoothieFrappe= SmoothiFrappe(name, price, explanation, sugar)

    println("${smoothieFrappe.name} | ${smoothieFrappe.price} | 옵션- ${smoothieFrappe.Sugar}")
    println("위 메뉴를 장바구니에 추가하시겠습니까?")
    println("1. 확인       2. 취소")

    return smoothieFrappe
}
fun addDesert (name: String, price:Int,explanation: String,tableware:String) :Food{

    var desert= Food(name, price, explanation, tableware)

    println("${desert.name} | ${desert.price} | ${desert.explanation} | 옵션- 식기: ${desert.tableware}")
    println("위 메뉴를 장바구니에 추가하시겠습니까?")
    println("1. 확인       2. 취소")

    return desert
}
fun addProduct (name: String, price:Int,explanation: String,delivery:String) :Product{

    var product= Product(name, price, explanation, delivery)

    println("${product.name} | ${product.price} | 옵션- 배달장소: ${product.delivery}")
    println("위 메뉴를 장바구니에 추가하시겠습니까?")
    println("1. 확인       2. 취소")

    return product
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