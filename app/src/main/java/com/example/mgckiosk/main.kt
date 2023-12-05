package com.example.mgckiosk


// 메가 커피 키오스크 팀 과제 3조 파이팅!!


fun main() {
    val menu = Menu()
    val coffees = arrayOf(arrayOf("할메가커피",1500)
        ,arrayOf("할메가커피",2500)
        ,arrayOf("왕할메가커피",2500)
        ,arrayOf("헤이즐넛 아메리카노",2000)
        ,arrayOf("바닐라 아메리카노",3500)
        ,arrayOf("에스프레소",1000)
        ,arrayOf("젤라또 아포가토",3500)
        ,arrayOf("아메리카노",2700)
        ,arrayOf("티라미수라떼",1800)
        ,arrayOf("메가리카노",1700)
        ,arrayOf("연유라떼",1900)
        ,arrayOf("카라멜마끼아또",2200)
        ,arrayOf("카페라떼",2400)
        ,arrayOf("카페모카",2300)
        ,arrayOf("카푸치노",2100)
        ,arrayOf("콜드브루라떼",3000)
        ,arrayOf("콜드브루오리지널",3200)
    )
    val teas = arrayOf(arrayOf("녹차",1500)
        ,arrayOf("사과유자차",2500)
        ,arrayOf("얼그레이",2500)
        ,arrayOf("캐모마일",2000)
        ,arrayOf("페퍼민트",3500)
        ,arrayOf("에스프레소",1000)
        ,arrayOf("복숭아아이스티",3500)
        ,arrayOf("유자차",2700)
        ,arrayOf("레몬차",1800)
        ,arrayOf("자몽차",1700)
        ,arrayOf("허니자몽블랙티",1900)
    )
    val adaeJuices = arrayOf(arrayOf("라임모히또",1500)
        ,arrayOf("레몬에이드",2500)
        ,arrayOf("블루레몬에이드",2500)
        ,arrayOf("자몽에이드",2000)
        ,arrayOf("청포도에이드",3500)
        ,arrayOf("유니콘매직에이드(핑크)",1000)
        ,arrayOf("유니콘매직에이드(블루)",3500)
        ,arrayOf("체리콕",2700)
    )
    while (true) {
        mainView()
        var choice= readlnOrNull()
        when (choice) {
            "0" -> System.exit(0)
            "1" -> {
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
                var choice2= readln()
                while(choice2.isNotEmpty()){
                    if(choice2.toInt() >= 17) {
                        println("올바른 값을 입력해주세요.")
                        var choice2= readln()
                    }



                }
                menu.selectMenu(coffees[choice2.toInt()-1][0],coffees[choice2.toInt()-1][1])


            }
            "2" -> {
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
                var choice2= readlnOrNull()
                menu.selectMenu(choice2)
            }
            "3" -> {
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
                var choice2= readlnOrNull()
                menu.selectMenu(choice2)
            }
            "4" -> {
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
                var choice2= readlnOrNull()
                menu.selectMenu(choice2)
            }
            else -> {
                println("잘못된 입력입니다")
                continue
            }
        }//when
    }

}

fun mainView(){
    println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.")
    println("1.커피")
    println("2.티")
    println("3.에이드/주스")
    println("4.디저트")
    println("0.프로그램 종료")

}

