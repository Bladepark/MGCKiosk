package com.example.mgckiosk


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

    lateinit var bucket : Array<Array<Comparable<*>>>

        while (true) {
        mainView()
        var cyclePoint=true
        var choice= readlnOrNull()
        when (choice) {
            "0" -> System.exit(0)
            "1" -> {
                while (cyclePoint) {
                    showCoffe()
                    var choice2= readln()

                    when(choice2.toInt()) {
                        0 -> {
                            cyclePoint=false
                            continue
                        }
                        in 1..coffees.size -> {
                            selectMenu(
                                coffees[choice2.toInt()-1][0].toString(),
                                coffees[choice2.toInt()-1][1].toString().toInt(),
                                coffees[choice2.toInt()-1][2].toString())
                            var choice3 = readln()
                            if(choice3 =="1"){
                                println("${ coffees[choice2.toInt()-1][0]}가 장바구니에 추가되었습니다.")
                                cyclePoint=false
                                continue
                            } else if(choice3 == "2") { //취소
                                println("취소하셨습니다.")
                            }else{
                                println("잘못된 입력입니다..")
                                var choice2= readln()
                            }

                        }
                        else -> {
                            println("잘못된 입력입니다")
                        }
                    }//when
                }//while
            } //1
            "2" -> {
                while (cyclePoint) {
                    showTea()
                    var choice2= readln()

                    when(choice2.toInt()) {
                        0 -> {
                            cyclePoint=false
                            continue
                        }
                        in 1..teas.size -> {
                            selectMenu(
                                teas[choice2.toInt()-1][0].toString(),
                                teas[choice2.toInt()-1][1].toString().toInt(),
                                teas[choice2.toInt()-1][2].toString())
                                var choice3 = readln()
                            if(choice3 =="1"){
                                println("${ teas[choice2.toInt()-1][0]}가 장바구니에 추가되었습니다.")
                                //bucket = bucket.plus((teas[choice2.toInt()-1]))
                                cyclePoint=false
                                continue
                            } else if(choice3 == "2") { //취소
                                println("취소하셨습니다.")
                            }else{
                                println("잘못된 입력입니다..")
                                choice2= readln()
                            }
                        }
                        else -> {
                            println("잘못된 입력입니다")
                        }
                    }//when
                }//while
            }
            "3" -> {
                while (cyclePoint) {
                    showAdejuice()
                    var choice2= readln()

                    when(choice2.toInt()) {
                        0 -> {
                            cyclePoint=false
                            continue
                        }
                        in 1..adeJuices.size -> {
                            selectMenu(
                                adeJuices[choice2.toInt()-1][0].toString(),
                                adeJuices[choice2.toInt()-1][1].toString().toInt(),
                                adeJuices[choice2.toInt()-1][2].toString())
                            var choice3 = readln()
                            if(choice3 =="1"){
                                println("${ adeJuices[choice2.toInt()-1][0]}가 장바구니에 추가되었습니다.")
                                cyclePoint=false
                                continue
                            } else if(choice3 == "2") { //취소
                                println("취소하셨습니다.")
                            }else{
                                println("잘못된 입력입니다..")
                                choice2= readln()
                            }
                        }
                        else -> {
                            println("잘못된 입력입니다")
                        }
                    }//when
                }//while

            }
            "4" -> {
                while (cyclePoint) {
                    showDesert()
                    var choice2= readln()

                    when(choice2.toInt()) {
                        0 -> {
                            cyclePoint=false
                            continue
                        }
                        in 1..deserts.size -> {
                            selectMenu(
                                deserts[choice2.toInt()-1][0].toString(),
                                deserts[choice2.toInt()-1][1].toString().toInt(),
                                deserts[choice2.toInt()-1][2].toString())
                            var choice3 = readln()
                            if(choice3 =="1"){
                                println("${ deserts[choice2.toInt()-1][0]}가 장바구니에 추가되었습니다.")
                                cyclePoint=false
                                continue
                            } else if(choice3 == "2") { //취소
                                println("취소하셨습니다.")
                            }else{
                                println("잘못된 입력입니다..")
                                choice2= readln()
                            }
                        }
                        else -> {
                            println("잘못된 입력입니다")
                        }
                    }//when
                }//while

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
    println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.")
    println("1.커피")
    println("2.티")
    println("3.에이드/주스")
    println("4.디저트")
    println("0.프로그램 종료")

}

fun selectMenu(name: String, price:Int,explanation: String) {

    var coffee=Coffee(name,price,explanation)
    println("${coffee.name} | ${coffee.price} | ${coffee.explanation}")
    println("위 메뉴를 장바구니에 추가하시겠습니까?")
    println("1. 확인       2. 취소")
}

fun showCoffe(){
    println("1.할메가커피")
    println("2.왕할메가커피")
    println("3.헤이즐넛 아메리카노")
    println("4.바닐라 아메리카노")
    println("5.에스프레소")
    println("6.젤라또 아포가토")
    println("7.아메리카노")
    println("8.티라미수라떼")
    println("9.메가리카노")
    println("10.연유라떼")
    println("11.카라멜마끼아또")
    println("12.카페라떼")
    println("13.카페모카")
    println("14.카푸치노")
    println("15.콜드브루라떼")
    println("16.콜드브루오리지널")
    println("0. 뒤로가기")
}
fun showTea(){
    println("1.녹차")
    println("2.사과유자차")
    println("3.얼그레이")
    println("4.캐모마일")
    println("5.페퍼민트")
    println("6.복숭아아이스티")
    println("7.유자차")
    println("8.레몬차")
    println("9.자몽차")
    println("10.허니자몽블랙티")
    println("0. 뒤로가기")
}
fun showAdejuice(){
    println("1.라임모히또")
    println("2.레몬에이드")
    println("3.블루레몬에이드")
    println("4.자몽에이드")
    println("5.청포도에이드")
    println("6.유니콘매직에이드(핑크)")
    println("7.유니콘매직에이드(블루)")
    println("8.체리콕")
    println("9.메가에이드")
    println("0. 뒤로가기")
}
fun showDesert(){
    println("1.와앙 피자 보름달빵")
    println("2.와앙 콘마요 보름달빵")
    println("3.뚱크림치즈약과쿠키")
    println("4.말차스모어쿠키")
    println("5.마카다미아 쿠키")
    println("6.초콜릿칩 쿠키")
    println("7.플레인크로플")
    println("8.아이스크림크로플")
    println("9.아이스허니와앙슈")
    println("10.크로크무슈")
    println("11.몽쉘케이크")
    println("12.햄앤치즈샌드")
    println("13.치즈 케익")
    println("14.초코무스 케익")
    println("15.티라미수 케익")
    println("16.허니브레드")
    println("0. 뒤로가기")
}