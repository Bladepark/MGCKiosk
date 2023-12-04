package com.example.mgckiosk

// 추상클래스 몰라요, 인터페이스 몰라요
// 일단 아는 걸로만 작성해 봤어요

fun main() {

    println(
        "아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n" +
                "\n" +
                "[ MEGA Coffee menu ]\n" +
                "1.  Coffee       | 에티오피아의 카프카의 고품질 원두로 로스팅한 커피\n" +
                "2.  Tea          | 오스트레일리아 유명 티 메이커 [T2] Collaboration\n" +
                "3.  Ade/Juice    | 매일 아침 시장에서 공수해 오는 신선한 과일로 제조한 음료\n" +
                "4.  Dessert      | [Le Cordon Bleu]를 수석 졸업 김앤장 셰프의 걸작\n\n" +
                "원하시는 메뉴의 번호를 입력해주세요."
    )

    var selectMenu: String? = readLine()
    when (selectMenu) {
        "1" -> {
            println("커피를 선택하셨습니다.") //println가 아니라 클래스 호출을 해야할 듯
            coffeeManu()
        }
        "2" -> {
            println("티를 선택하셨습니다.")
            teaManu()
        }
        "3" -> {
            println("에이드/쥬스를 선택하셨습니다.")
            adeJuiceManu()
        }
        "4" -> {
            println("디저트를 선택하셨습니다.")
            dessertManu()
        }
        else -> {
            println("❗️유효하지 않은 입력입니다. 다시 시도해 주세요 ^.^\n")
            main()
        }
    }
}

class Coffee(val name: String, val time: Int, val price: Int)
fun coffeeManu() {
    val coffee1 = Coffee("가메리카노 커피", 5, 1900)
    val coffee2 = Coffee("나메리카노 커피", 5, 2000)
    val coffee3 = Coffee("다메리카노 커피", 7, 3800)
    val coffee4 = Coffee("라메리카노 커피", 8, 4100)
    val coffee5 = Coffee("마메리카노 커피", 10, 4500)

    println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n" +
            "\n" +
            "[ 1. Coffee menu ]\n" +
            " \n" +
            "1.  가메리카노      | 커피넘버 원 고품질 원두로 로스팅한 커피\n" +
            "2.  나메리카노      | 커피넘버 투 고품질 원두로 로스팅한 커피\n" +
            "3.  다메리카노      | 커피넘버 쓰리 고품질 원두로 로스팅한 커피\n" +
            "4.  라메리카노      | 커피넘버 포 고품질 원두로 로스팅한 커피\n" +
            "5.  마메리카노      | 커피넘버 파이브 고품질 원두로 로스팅한 커피\n\n" +
            "0.  뒤로가기\n")
    var selectCoffee: String? = readLine()
    when (selectCoffee) {
        "1" -> println("${coffee1.name} 준비해 드리겠습니다. ${coffee1.price}원 이고, ${coffee1.time}분 정도 소요됩니다.")
        "2" -> println("${coffee2.name} 준비해 드리겠습니다 ${coffee2.price}원 이고, ${coffee2.time}분 정도 소요됩니다.")
        "3" -> println("${coffee3.name} 준비해 드리겠습니다. ${coffee3.price}원 이고, ${coffee3.time}분 정도 소요됩니다.")
        "4" -> println("${coffee4.name} 준비해 드리겠습니다. ${coffee4.price}원 이고, ${coffee4.time}분 정도 소요됩니다.")
        "5" -> println("${coffee5.name} 준비해 드리겠습니다. ${coffee5.price}원 이고, ${coffee5.time}분 정도 소요됩니다.")
        "0" -> main()
        else -> {
            println("❗유효하지 않은 입력입니다. 다시 시도해 주세요 ^.^\n")
            coffeeManu()
        }
    }
}

class Tea(val name: String, val time: Int, val price: Int)
fun teaManu() {
    val tea1 = Tea("아난티", 7, 3400)
    val tea2 = Tea("아이티", 8, 3400)
    val tea3 = Tea("부가티", 7, 3800)
    val tea4 = Tea("반팔티", 9, 4300)
    val tea5 = Tea("로열티", 6, 5000)

    println(
        "아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n" +
                "\n" +
                "[ 1. Coffee menu ]\n" +
                " \n" +
                "1.  아난티         | 티넘버 원 세계최초 특별한 티\n" +
                "2.  아이티         | 티넘버 투 세계최초 특별한 티\n" +
                "3.  부가티         | 티넘버 쓰리 세계최초 특별한 티\n" +
                "4.  반팔티         | 티넘버 포 세계최초 특별한 티\n" +
                "5.  로열티         | 티넘버 파이브 세계최초 특별한 티\n\n" +
                "0.  뒤로가기\n")
    var selectTea: String? = readLine()
    when (selectTea) {
        "1" -> println("${tea1.name} 준비해 드리겠습니다. ${tea1.price}원 이고, ${tea1.time}분 정도 소요됩니다.")
        "2" -> println("${tea2.name} 준비해 드리겠습니다. ${tea2.price}원 이고, ${tea2.time}분 정도 소요됩니다.")
        "3" -> println("${tea3.name} 준비해 드리겠습니다. ${tea3.price}원 이고, ${tea3.time}분 정도 소요됩니다.")
        "4" -> println("${tea4.name} 준비해 드리겠습니다. ${tea4.price}원 이고, ${tea4.time}분 정도 소요됩니다.")
        "5" -> println("${tea5.name} 준비해 드리겠습니다. ${tea5.price}원 이고, ${tea5.time}분 정도 소요됩니다.")
        "0" -> main()
        else -> {
            println("❗유효하지 않은 입력입니다. 다시 시도해 주세요 ^.^\n")
            teaManu()
        }
    }
}

class AdeJuice(val name: String, val time: Int, val price: Int)
fun adeJuiceManu() {
    val adeJuic1 = AdeJuice("아난티", 7, 3400)
    val adeJuic2 = AdeJuice("아이티", 8, 3400)
    val adeJuic3 = AdeJuice("부가티", 7, 3800)
    val adeJuic4 = AdeJuice("반팔티", 9, 4300)
    val adeJuic5 = AdeJuice("로열티", 6, 5000)

    println(
        "아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n" +
                "\n" +
                "[ 1. Coffee menu ]\n" +
                " \n" +
                "1.  아난티         | 티넘버 원 세계최초 특별한 티\n" +
                "2.  아이티         | 티넘버 투 세계최초 특별한 티\n" +
                "3.  부가티         | 티넘버 쓰리 세계최초 특별한 티\n" +
                "4.  반팔티         | 티넘버 포 세계최초 특별한 티\n" +
                "5.  로열티         | 티넘버 파이브 세계최초 특별한 티\n\n" +
                "0.  뒤로가기\n")
    var selectAdeJuice: String? = readLine()
    when (selectAdeJuice) {
        "1" -> println("${adeJuic1.name} 준비해 드리겠습니다. ${adeJuic1.price}원 이고, ${adeJuic1.time}분 정도 소요됩니다.")
        "2" -> println("${adeJuic2.name} 준비해 드리겠습니다. ${adeJuic2.price}원 이고, ${adeJuic2.time}분 정도 소요됩니다.")
        "3" -> println("${adeJuic3.name} 준비해 드리겠습니다. ${adeJuic3.price}원 이고, ${adeJuic3.time}분 정도 소요됩니다.")
        "4" -> println("${adeJuic4.name} 준비해 드리겠습니다. ${adeJuic4.price}원 이고, ${adeJuic4.time}분 정도 소요됩니다.")
        "5" -> println("${adeJuic5.name} 준비해 드리겠습니다. ${adeJuic5.price}원 이고, ${adeJuic5.time}분 정도 소요됩니다.")
        "0" -> main()
        else -> {
            println("❗유효하지 않은 입력입니다. 다시 시도해 주세요 ^.^\n")
            adeJuiceManu()
        }
    }
}

class Dessert(val name: String, val time: Int, val price: Int)
fun dessertManu() {
    val dessert1 = Dessert("브뤼셀 와플", 15, 6700)
    val dessert2 = Dessert("크렘브륄레", 13, 8600)
    val dessert3 = Dessert("마카롱", 9, 2800)
    val dessert4 = Dessert("바움쿠헨", 14, 9800)
    val dessert5 = Dessert("에그타르트", 6, 1500)

    println(
        "아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n" +
                "\n" +
                "[ 1. Coffee menu ]\n" +
                " \n" +
                "1.  브뤼셀 와플     | 벨기에 대표 간식\n" +
                "2.  크렘브륄레      | 프랑스 대표 간식\n" +
                "3.  마ㅤ카ㅤ롱      | 이탈리아 대표 간식\n" +
                "4.  바 움 쿠 헨ㅤ   | 독일 대표 간식\n" +
                "5.  에그타르트      | 포르투갈 대표 간식\n\n" +
                "0.  뒤로가기\n")
    var selectTea: String? = readLine()
    when (selectTea) {
        "1" -> println("${dessert1.name} 준비해 드리겠습니다. ${dessert1.price}원 이고, ${dessert1.time}분 정도 소요됩니다.")
        "2" -> println("${dessert2.name} 준비해 드리겠습니다. ${dessert2.price}원 이고, ${dessert2.time}분 정도 소요됩니다.")
        "3" -> println("${dessert3.name} 준비해 드리겠습니다. ${dessert3.price}원 이고, ${dessert3.time}분 정도 소요됩니다.")
        "4" -> println("${dessert4.name} 준비해 드리겠습니다. ${dessert4.price}원 이고, ${dessert4.time}분 정도 소요됩니다.")
        "5" -> println("${dessert5.name} 준비해 드리겠습니다. ${dessert5.price}원 이고, ${dessert5.time}분 정도 소요됩니다.")
        "0" -> main()
        else ->  {
            println("❗유효하지 않은 입력입니다. 다시 시도해 주세요 ^.^\n")
            dessertManu()
        }
    }
}
