/*키오스크 1 : 한 페이지에 코드를 작성 텍스트 프린트 노가다
package com.example.mgckiosk

// 추상클래스 몰라요, 인터페이스 몰라요 while도 아직..
// 일단 아는 걸로만 작성해 봤어요

fun printMenu() {
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
}

fun selectMenu() {
    val selectMenu: String? = readLine()
    when (selectMenu) {
        "1" -> {
            println("커피를 선택하셨습니다.") //println가 아니라 클래스 호출을 해야할 듯
            coffeeMenu()
        }
        "2" -> {
            println("티를 선택하셨습니다.")
            teaMenu()
        }
        "3" -> {
            println("에이드/쥬스를 선택하셨습니다.")
            adeJuiceMenu()
        }
        "4" -> {
            println("디저트를 선택하셨습니다.")
            dessertMenu()
        }
        else -> {
            println("❗️유효하지 않은 입력입니다. 다시 시도해 주세요 ^.^\n")
            printMenu()
            selectMenu()
        }
    }
}
//when도 가능하지만 while사용도 좋을 것 같다


fun main() {
    printMenu()
    selectMenu()
}
//메인은 하나만 사용할 수 있기 때문에 안에서 반복하는 건 좋지 못함


class Coffee(val name: String, val time: Int, val price: Int)
//공통화를 하려고 찾아보자 부모클래스 drink
//드링크 추상클래스? 이건 나중에

//카테고리별 클래스를 묶고 옵션 추가
//ex1) 아메리카노에 옵션:두유 = 소이밀크 라떼
//ex2) 소이밀크 라떼에 옵션: hot/ice = 아이스 소이밀크 라떼

//오버라이드 기능을 이용하는것 -> 방법 중 하나

fun coffeeMenu() { //오타 수정
    val coffee1 = Coffee("가메리카노 커피", 5, 1900)
    val coffee2 = Coffee("나메리카노 커피", 5, 2000)
    val coffee3 = Coffee("다메리카노 커피", 7, 3800)
    val coffee4 = Coffee("라메리카노 커피", 8, 4100)
    val coffee5 = Coffee("마메리카노 커피", 10, 4500)

    println(
        "아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n" +
                "\n" +
                "[ 1. Coffee menu ]\n" +
                " \n" +
                "1.  가메리카노      | 커피넘버 원 고품질 원두로 로스팅한 커피\n" +
                "2.  나메리카노      | 커피넘버 투 고품질 원두로 로스팅한 커피\n" +
                "3.  다메리카노      | 커피넘버 쓰리 고품질 원두로 로스팅한 커피\n" +
                "4.  라메리카노      | 커피넘버 포 고품질 원두로 로스팅한 커피\n" +
                "5.  마메리카노      | 커피넘버 파이브 고품질 원두로 로스팅한 커피\n\n" +
                "0.  뒤로가기\n"
    )
    val selectCoffee: String? = readLine()
    when (selectCoffee) {
        "1" -> println("${coffee1.name} 준비해 드리겠습니다. ${coffee1.price}원 이고, ${coffee1.time}분 정도 소요됩니다.")
        "2" -> println("${coffee2.name} 준비해 드리겠습니다 ${coffee2.price}원 이고, ${coffee2.time}분 정도 소요됩니다.")
        "3" -> println("${coffee3.name} 준비해 드리겠습니다. ${coffee3.price}원 이고, ${coffee3.time}분 정도 소요됩니다.")
        "4" -> println("${coffee4.name} 준비해 드리겠습니다. ${coffee4.price}원 이고, ${coffee4.time}분 정도 소요됩니다.")
        "5" -> println("${coffee5.name} 준비해 드리겠습니다. ${coffee5.price}원 이고, ${coffee5.time}분 정도 소요됩니다.")
        "0" -> main()
        else -> {
            println("❗유효하지 않은 입력입니다. 다시 시도해 주세요 ^.^\n")
            coffeeMenu()
        }
    }
}

class Tea(val name: String, val time: Int, val price: Int)

fun teaMenu() {
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
                "0.  뒤로가기\n"
    )
    val selectTea: String? = readLine()
    when (selectTea) {
        "1" -> println("${tea1.name} 준비해 드리겠습니다. ${tea1.price}원 이고, ${tea1.time}분 정도 소요됩니다.")
        "2" -> println("${tea2.name} 준비해 드리겠습니다. ${tea2.price}원 이고, ${tea2.time}분 정도 소요됩니다.")
        "3" -> println("${tea3.name} 준비해 드리겠습니다. ${tea3.price}원 이고, ${tea3.time}분 정도 소요됩니다.")
        "4" -> println("${tea4.name} 준비해 드리겠습니다. ${tea4.price}원 이고, ${tea4.time}분 정도 소요됩니다.")
        "5" -> println("${tea5.name} 준비해 드리겠습니다. ${tea5.price}원 이고, ${tea5.time}분 정도 소요됩니다.")
        "0" -> main()
        else -> {
            println("❗유효하지 않은 입력입니다. 다시 시도해 주세요 ^.^\n")
            teaMenu()
        }
    }
}

class AdeJuice(val name: String, val time: Int, val price: Int)

fun adeJuiceMenu() {
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
                "0.  뒤로가기\n"
    )
    val selectAdeJuice: String? = readLine()
    when (selectAdeJuice) {
        "1" -> println("${adeJuic1.name} 준비해 드리겠습니다. ${adeJuic1.price}원 이고, ${adeJuic1.time}분 정도 소요됩니다.")
        "2" -> println("${adeJuic2.name} 준비해 드리겠습니다. ${adeJuic2.price}원 이고, ${adeJuic2.time}분 정도 소요됩니다.")
        "3" -> println("${adeJuic3.name} 준비해 드리겠습니다. ${adeJuic3.price}원 이고, ${adeJuic3.time}분 정도 소요됩니다.")
        "4" -> println("${adeJuic4.name} 준비해 드리겠습니다. ${adeJuic4.price}원 이고, ${adeJuic4.time}분 정도 소요됩니다.")
        "5" -> println("${adeJuic5.name} 준비해 드리겠습니다. ${adeJuic5.price}원 이고, ${adeJuic5.time}분 정도 소요됩니다.")
        "0" -> main()
        else -> {
            println("❗유효하지 않은 입력입니다. 다시 시도해 주세요 ^.^\n")
            adeJuiceMenu()
        }
    }
}

class Dessert(val name: String, val time: Int, val price: Int)

fun dessertMenu() {
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
                "0.  뒤로가기\n"
    )
    val selectTea: String? = readLine()
    when (selectTea) {
        "1" -> println("${dessert1.name} 준비해 드리겠습니다. ${dessert1.price}원 이고, ${dessert1.time}분 정도 소요됩니다.")
        "2" -> println("${dessert2.name} 준비해 드리겠습니다. ${dessert2.price}원 이고, ${dessert2.time}분 정도 소요됩니다.")
        "3" -> println("${dessert3.name} 준비해 드리겠습니다. ${dessert3.price}원 이고, ${dessert3.time}분 정도 소요됩니다.")
        "4" -> println("${dessert4.name} 준비해 드리겠습니다. ${dessert4.price}원 이고, ${dessert4.time}분 정도 소요됩니다.")
        "5" -> println("${dessert5.name} 준비해 드리겠습니다. ${dessert5.price}원 이고, ${dessert5.time}분 정도 소요됩니다.")
        "0" -> main()
        else -> {
            println("❗유효하지 않은 입력입니다. 다시 시도해 주세요 ^.^\n")
            dessertMenu()
        }
    }
}
*/

/* 키오스크 2 : 노가다 코드를 간략화 하고 데이터베이스 분리 작업

/* 코드 메모
사용한 기능 : 노가다 코드 -> DB화 및 분리, listOf, filterIsInstance
구현한 기능 : 키오스크 1과 대동소이 하지만 관리자를 위한 카테고리별 DB출력 히든기능 구현, 노가다 코드 -> DB화 및 분리,
           접근 시 메인화면 작성, 키 입력 시 리턴
의문사항 : 비슷한 기능을 하는 fun을 묶는 방법은 없을까? Class로 감싸고 class.fun 식으로 호출해 사용할까?
문제사항 : 환영화면에서 숫자를 입력하고 'Enter'로 키를 입력받으면 다음 메뉴가 바로 선택되어 다음으로 넘어가버림
        'Enter'입력만을 받던지, 아무 키를 눌러서 넘어가도록 하던지 조치가 필요해 보임

요약 : 의도한 코드를 작성하고 문제가 발생했을 때 컴파일러 도움말이 많은 도움이 되었다
*/

//이 ㅅ1발 우리 깐부아니가 제발...
package com.example.mgckiosk

/*부모 클래스와 데이터 클래스 파일 분리 시도
open class AllMegaMenu(open val name: String, open val price: Int, open val time: Int)

data class Tea(override val name: String, override val price: Int, override val time: Int) : AllMegaMenu(name, price, time)
data class Coffee(override val name: String, override val price: Int, override val time: Int) : AllMegaMenu(name, price, time)
data class AdeJuice(override val name: String, override val price: Int, override val time: Int) : AllMegaMenu(name, price, time)
data class Dessert(override val name: String, override val price: Int, override val time: Int) : AllMegaMenu(name, price, time)


val menuList: List<AllMegaMenu> = listOf(
    Tea("티 메뉴 1번", 3000, 5),
    Tea("티 메뉴 2번", 3500, 7),
    Coffee("커피 메뉴 1번", 4000, 6),
    Coffee("커피 메뉴 2번", 4500, 8),
    Dessert("디저트 메뉴 1번", 5000, 10),
    Tea("티 메뉴 3번", 3500, 7),
    Dessert("디저트 메뉴 2번", 5000, 10),
    Coffee("커피 메뉴 3번", 4000, 6),
    Coffee("커피 메뉴 4번", 4000, 6),
    AdeJuice("커피 메뉴 3번", 4000, 6),
    AdeJuice("커피 메뉴 3번", 4000, 6),
    AdeJuice("커피 메뉴 3번", 4000, 6),

)*/

//Wellcome 화면 안내
fun wellcomeMenu() {
    println(
        "\n" +
                "  __    __        _  _                                     _          \n" +
                " / / /\\ \\ \\  ___ | || |  ___   ___   _ __ ___    ___      | |_   ___  \n" +
                " \\ \\/  \\/ / / _ \\| || | / __| / _ \\ | '_ ` _ \\  / _ \\     | __| / _ \\ \n" +
                "  \\  /\\  / |  __/| || || (__ | (_) || | | | | ||  __/     | |_ | (_) |\n" +
                "   \\/  \\/   \\___||_||_| \\___| \\___/ |_| |_| |_| \\___|      \\__| \\___/ \n" +
                " _____  _____  _____  _____    _____  _____  _____  _____  _____  _____ \n" +
                "|     ||   __||   __||  _  |  |     ||     ||   __||   __||   __||   __|\n" +
                "| | | ||   __||  |  ||     |  |   --||  |  ||   __||   __||   __||   __|\n" +
                "|_|_|_||_____||_____||__|__|  |_____||_____||__|   |__|   |_____||_____|\n" +
                "                                                                        \n"
    )
    print("             Press 'Enter' to Start\n" +
          "           시작하시려면 'Enter'키를 누르세요\n\n")
    // 키 입력 대기(enter = 바로시작, 키 입력 enter = 시작)
    // 다음 코드에서는 키 입력으로 바로 시작할 수 있도록 해보자 (ex: r 입력 = 바로시작)
    System.`in`.read()
}

//메뉴판 화면 안내
fun printMenu() {
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
}

//메뉴 선택 안내
fun selectMenu() {
    val selectMenu: String? = readLine()
    //이번에는 when을 사용하고 다음에는 while 사용해 보기
    when (selectMenu) {
        "1" -> {
            println("\n커피를 선택하셨습니다.") //println가 아니라 클래스 호출을 해야할 듯
            selectCoffeeMenu()
            coffeeMenu()
        }
        "11" -> {
            println("\nAdmin: View all coffee list\n")
            val coffeeList: List<Coffee> = menuList.filterIsInstance<Coffee>()
            coffeeList.forEachIndexed {index, coffee ->
                println("${index + 1}. ${coffee.name} - ${coffee.price}원, 소요 시간: ${coffee.time}분")
            }
            println("'Enter' to Return")
            System.`in`.read()
            printMenu()
            selectMenu()
        }
        "2" -> {
            println("\n티를 선택하셨습니다.")
            selectTeaMenu()
            TeaMenu()
        }
        "22" -> {
            println("\nAdmin: View all Tea list\n")
            val teaList: List<Tea> = menuList.filterIsInstance<Tea>()
            teaList.forEachIndexed {index, tea ->
                println("${index + 1}. ${tea.name} - ${tea.price}원, 소요 시간: ${tea.time}분")
            }
            println("'Enter' to Return")
            System.`in`.read()
            printMenu()
            selectMenu()
        }
        "3" -> {
            println("\n에이드/쥬스를 선택하셨습니다.")
            selectAdeJuiceMenu()
            adeJuiceMenu()
        }
        "33" -> {
            println("\nAdmin: View all Ade/Juice list\n")
            val adeJuiceList: List<AdeJuice> = menuList.filterIsInstance<AdeJuice>()
            adeJuiceList.forEachIndexed {index, adeJuice ->
                println("${index + 1}. ${adeJuice.name} - ${adeJuice.price}원, 소요 시간: ${adeJuice.time}분")
            }
            println("'Enter' to Return")
            System.`in`.read()
            printMenu()
            selectMenu()
        }
        "4" -> {
            println("\n디저트를 선택하셨습니다.")
            selectDessertMenu()
            dessertMenu()
        }
        "44" -> {
            println("\nAdmin: View all Dessert list\n")
            val dessertList: List<Dessert> = menuList.filterIsInstance<Dessert>()
            dessertList.forEachIndexed {index, dessert ->
                println("${index + 1}. ${dessert.name} - ${dessert.price}원, 소요 시간: ${dessert.time}분")
            }
            println("'Enter' to Return")
            System.`in`.read()
            printMenu()
            selectMenu()
        }
        else -> {
            println("❗️유효하지 않은 입력입니다. 다시 시도해 주세요 ^.^\n")
            printMenu()
            selectMenu()
        }
    }
}


//메뉴 선택 후 안내
fun selectCoffeeMenu() {
    println(
        "아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n" +
                "\n" +
                "[ 1. Coffee menu ]\n" +
                " \n" +
                "1.  가메리카노      | 커피넘버 원 고품질 원두로 로스팅한 커피\n" +
                "2.  나메리카노      | 커피넘버 투 고품질 원두로 로스팅한 커피\n" +
                "3.  다메리카노      | 커피넘버 쓰리 고품질 원두로 로스팅한 커피\n" +
                "4.  라메리카노      | 커피넘버 포 고품질 원두로 로스팅한 커피\n" +
                "5.  마메리카노      | 커피넘버 파이브 고품질 원두로 로스팅한 커피\n\n" +
                "0.  전체 메뉴로 돌아가기\n"
    )
}
fun selectTeaMenu() {
    println(
        "아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n" +
                "\n" +
                "[ 1. Coffee menu ]\n" +
                " \n" +
                "1.  티메뉴임다      | 커피넘버 원 고품질 원두로 로스팅한 커피\n" +
                "2.  티메뉴임다      | 커피넘버 투 고품질 원두로 로스팅한 커피\n" +
                "3.  티메뉴임다      | 커피넘버 쓰리 고품질 원두로 로스팅한 커피\n" +
                "4.  티메뉴임다      | 커피넘버 포 고품질 원두로 로스팅한 커피\n" +
                "5.  티메뉴임다      | 커피넘버 파이브 고품질 원두로 로스팅한 커피\n\n" +
                "0.  전체 메뉴로 돌아가기\n"
    )
}
fun selectAdeJuiceMenu() {
    println(
        "아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n" +
                "\n" +
                "[ 1. Coffee menu ]\n" +
                " \n" +
                "1.  에이드냠냠      | 커피넘버 원 고품질 원두로 로스팅한 커피\n" +
                "2.  에이드냠냠      | 커피넘버 투 고품질 원두로 로스팅한 커피\n" +
                "3.  에이드냠냠      | 커피넘버 쓰리 고품질 원두로 로스팅한 커피\n" +
                "4.  에이드냠냠      | 커피넘버 포 고품질 원두로 로스팅한 커피\n" +
                "5.  에이드냠냠      | 커피넘버 파이브 고품질 원두로 로스팅한 커피\n\n" +
                "0.  전체 메뉴로 돌아가기\n"
    )
}
fun selectDessertMenu() {
    println(
        "아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n" +
                "\n" +
                "[ 1. Coffee menu ]\n" +
                " \n" +
                "1.  에이드냠냠      | 커피넘버 원 고품질 원두로 로스팅한 커피\n" +
                "2.  에이드냠냠      | 커피넘버 투 고품질 원두로 로스팅한 커피\n" +
                "3.  에이드냠냠      | 커피넘버 쓰리 고품질 원두로 로스팅한 커피\n" +
                "4.  에이드냠냠      | 커피넘버 포 고품질 원두로 로스팅한 커피\n" +
                "5.  에이드냠냠      | 커피넘버 파이브 고품질 원두로 로스팅한 커피\n\n" +
                "0.  전체 메뉴로 돌아가기\n"
    )
}


//제품 선택 후 펑션
fun coffeeMenu() {
    val coffee: Coffee? = menuList.filterIsInstance<Coffee>().firstOrNull()
    val selectCoffee: String? = readLine()

    if (coffee != null) {
        // menuList에 <Coffee> 인덱스가 있을 때
        when (selectCoffee?.toIntOrNull()) {
            //readline으로 가져온 string숫자를 int로 치환한다
            in 1..5 -> {
                val selectedCoffee = menuList[selectCoffee!!.toInt() - 1]
                println("${selectedCoffee.name} 준비해 드리겠습니다. ${selectedCoffee.price}원 이고 ${selectedCoffee.time}분 정도 소요됩니다.")
            }
            0 -> {
                println("메뉴 선택으로 돌아가기")
                main()
            }
            else -> {
                println("❗유효하지 않은 입력입니다. 다시 시도해 주세요 ^.^\n")
                selectCoffeeMenu()
                coffeeMenu()
            }
        }
    } else {
        // menuList에 <Coffee> 인덱스가 없을 때
        println("커피 메뉴가 없어요 ㅠㅠ")
    }
}
fun TeaMenu() {
    val tea: Tea? = menuList.filterIsInstance<Tea>().firstOrNull()
    val selectTea: String? = readLine()

    if (tea != null) {
        // menuList에 <Coffee> 인덱스가 있을 때
        when (selectTea?.toIntOrNull()) {
            //readline으로 가져온 string숫자를 int로 치환한다
            in 1..5 -> {
                val selectedTea = menuList[selectTea!!.toInt() - 1]
                println("${selectedTea.name} 준비해 드리겠습니다. ${selectedTea.price}원 이고 ${selectedTea.time}분 정도 소요됩니다.")
            }
            0 -> {
                println("메뉴 선택으로 돌아가기")
                main()
            }
            else -> {
                println("❗유효하지 않은 입력입니다. 다시 시도해 주세요 ^.^\n")
                selectTeaMenu()
                TeaMenu()
            }
        }
    } else {
        // menuList에 <Tea> 인덱스가 없을 때
        println("티 메뉴가 없어요 ㅠㅠ")
    }
}
fun adeJuiceMenu() {
    val adeJuice: AdeJuice? = menuList.filterIsInstance<AdeJuice>().firstOrNull()
    val selectAdeJuice: String? = readLine()

    if (adeJuice != null) {
        // menuList에 <AdeJuice> 인덱스가 있을 때
        when (selectAdeJuice?.toIntOrNull()) {
            //readline으로 가져온 string숫자를 int로 치환한다
            in 1..5 -> {
                val selectedAdeJuice = menuList[selectAdeJuice!!.toInt() - 1]
                println("${selectedAdeJuice.name} 준비해 드리겠습니다. ${selectedAdeJuice.price}원 이고 ${selectedAdeJuice.time}분 정도 소요됩니다.")
            }
            0 -> {
                println("메뉴 선택으로 돌아가기")
                main()
            }
            else -> {
                println("❗유효하지 않은 입력입니다. 다시 시도해 주세요 ^.^\n")
                selectAdeJuiceMenu()
                adeJuiceMenu()
            }
        }
    } else {
        // menuList에 <AdeJuice> 인덱스가 없을 때
        println("에이드/쥬스 메뉴가 없어요 ㅠㅠ")
    }
}
fun dessertMenu() {
    val dessert: Dessert? = menuList.filterIsInstance<Dessert>().firstOrNull()
    val selectDessert: String? = readLine()

    if (dessert != null) {
        // menuList에 <Dessert> 인덱스가 있을 때
        when (selectDessert?.toIntOrNull()) {
            //readline으로 가져온 string숫자를 int로 치환한다
            in 1..5 -> {
                val selectedDessert = menuList[selectDessert!!.toInt() - 1]
                println("${selectedDessert.name} 준비해 드리겠습니다. ${selectedDessert.price}원 이고 ${selectedDessert.time}분 정도 소요됩니다.")
            }
            0 -> {
                println("메뉴 선택으로 돌아가기")
                main()
            }
            else -> {
                println("❗유효하지 않은 입력입니다. 다시 시도해 주세요 ^.^\n")
                selectDessertMenu()
                dessertMenu()
            }
        }
    } else {
        // menuList에 <Dessert> 인덱스가 없을 때
        println("디저트 메뉴가 없어요 ㅠㅠ")
    }
}

fun main(){
    wellcomeMenu()
    printMenu()
    selectMenu()
}
*/

/* 키오스크 3 : 코드 보강, 전 코드에서 발생한 문제 수정 및 개선, 텍스트 프린트 파일 분리
/* 코드 메모

사용한 기능 : 없음

구현한 기능 : fun accessDenied()로 반복 사용되는 기능을 묶어 가독성을 향상시켰다, 그외 이전 문제해결 참고

의문사항 : 반복되는 기능이 많은데 while문을 사용하면 반복되는 코드를 줄일 수 있을 것 같다

문제사항 : 코드의 가독성이 너무 떨어진다 -> 기능 추가가 남았기 때문에 후에 개선해 볼 예정
         비슷한 기능을 하는 fun을 묶는 방법을 찾아봐야 할 것 같다, Class로 감싸고 class.fun 식으로 호출해 사용?
         또한 when을 사용하는 코드에 while을 사용하면 좋을 것 같다

요약 :

이전 문제해결 :
            문제 1 : 메뉴에 리스트가 없을 때 메뉴판을 먼저 메뉴판을 호출하는 문제 -> 메인 메뉴판에서 리스트 정보를 먼저 조회하도록 변경

            문제 2 : 필터가 제대로 작동하지 않고 모든 리스트를 불러오는 오류 -> filterIsInstance 코드 수정
                    val coffee: Coffee? = menuList.filterIsInstance<Coffee>().firstOrNull()
                      coffee 타입의 요소를 필터링하고 첫 번째 요소를 반환한다
                      filter기능은 인터넷 검색, firstOrNull은 컴파일러 추천을 사용했는데 의도했던 바와 달라 필터링 기능만 살렸다,
                      ?null도 마찬가지로 부정조건을 사용해서 필요없다

                    old -> new

                    val coffeeList: List<Coffee> = menuList.filterIsInstance<Coffee>()
                    coffeeList 불변변수의 List를 생성하는데 여기에는 오직 <Coffee>지정된 타입만 담을 수 있고 다른 타입의 데이터가 들어오면 오류가 생긴다
                    이 불변변수는 menuList로 초기화 되는데 filterIsInstance는 전체 리스트 중 Coffee 타입만 가져와 리스트에 추가한다

           문제 3 : 키보드 입력 중 Enter 값만 입력 받도록 하고 싶다

*/

package com.example.mgckiosk



//denied 기능 합침 (NEW! 반복 사용해야 하는 fun을 묶어 간결성 확보)
fun accessDenied() {
    println("\n'Enter' to Return")
    System.`in`.read()
    printMenu()
    selectMenu()
}

//메뉴 선택 안내 (NEW! 항목별 인덱스 오류 수정, 항목이 없는 경우 이용불가 안내 추가, 이용불가 안내 시 메뉴판 노출 블락, Denied 기능 묶어 간결성 확보)
fun selectMenu() {
    val selectMenu: String? = readLine()
    //readLine으로 키보드 입력을 받아 기능을 선택할 수 있도록 함
    when (selectMenu) { //이번에는 when을 사용하고 다음에는 while 사용해 보기
        "1" -> {
            val coffeeList: List<Coffee> = menuList.filterIsInstance<Coffee>()
            //val coffeeList = 불변변수 coffeeList, : List<Coffee> = 데이터 타입 지정(Coffee외 다른 타입이 들어오면 에러 발생)
            //manuList = database.kt의 데이터 리스트로 초기화, .filterIsInstance<Coffee>() = Coffee 타입만 필터링해 가져온다
            //요약하면 manuList의 Coffee 타입을 필터링하고 불변변수coffeeList의 List에 추가하지만 Coffee가 아닌 경우 컴파일 에러를 발생시킨다

            if (coffeeList.isNotEmpty()) {
                //초기화된 리스트에 값이 있는 경우를 가정한다 = 필터에 null 조건이 필요가 없어진다
                //isEmpty 사용도 상관없지만 가독성을 위해 값이 있는 경우를 우선으로 조건을 설정했다
                println("\n커피를 선택하셨습니다.")
                selectCoffeeMenu()
                coffeeMenu()
            }else{
                //초기화된 리스트에 값이 없는 경우를 가정한다
                println("지금은 커피 상품을 이용하실 수 없습니다.\n이용에 불편을 드려 죄송합니다.")
                accessDenied()
                //리턴 안내, 메뉴 출력, 선택화면 복귀를 한 펑션에 담아 코드를 줄였다
            }
        }
        "11" -> {
            //코드 Run 상태에서 리스트에 올바르게 추가되었는지 확인하기 위한 히든메뉴
            println("\nAdmin: View all coffee list\n")
            val coffeeList: List<Coffee> = menuList.filterIsInstance<Coffee>()
            //val coffeeList = 불변변수 coffeeList, : List<Coffee> = 데이터 타입 지정(Coffee외 다른 타입이 들어오면 에러 발생)
            //manuList = database.kt의 데이터 리스트로 초기화, .filterIsInstance<Coffee>() = Coffee 타입만 필터링해 가져온다
            //요약하면 manuList의 Coffee 타입을 필터링하고 불변변수coffeeList의 List에 추가하지만 Coffee가 아닌 경우 컴파일 에러를 발생시킨다

            if (coffeeList.isNotEmpty()){
                coffeeList.forEachIndexed {index, coffee ->
                    println("${index + 1}. ${coffee.name} - ${coffee.price}원, 소요 시간: ${coffee.time}분")
                }//인덱스튼 0번 부터 시작하기 때문에 사용 편의상 +1을 해 주었다
            }else{
                println("Empty")
            }
            accessDenied()
        }
        "2" -> {
            val teaList: List<Tea> = menuList.filterIsInstance<Tea>()
            if (teaList.isNotEmpty()) {
                println("\n티를 선택하셨습니다.") //println가 아니라 클래스 호출을 해야할 듯
                selectTeaMenu()
                teaMenu()
            }else{
                println("지금은 티 상품을 이용하실 수 없습니다.\n이용에 불편을 드려 죄송합니다.")
                accessDenied()
            }
        }
        "22" -> {
            println("\nAdmin: View all Tea list\n")
            val teaList: List<Tea> = menuList.filterIsInstance<Tea>()
            if (teaList.isNotEmpty()){
                teaList.forEachIndexed {index, tea ->
                    println("${index + 1}. ${tea.name} - ${tea.price}원, 소요 시간: ${tea.time}분")
                }
            }else{
                println("Empty")
            }
            accessDenied()
        }
        "3" -> {
            val adeJuiceList: List<AdeJuice> = menuList.filterIsInstance<AdeJuice>()
            if (adeJuiceList.isNotEmpty()) {
                println("\n티를 선택하셨습니다.") //println가 아니라 클래스 호출을 해야할 듯
                selectAdeJuiceMenu()
                adeJuiceMenu()
            }else{
                println("지금은 티 상품을 이용하실 수 없습니다.\n이용에 불편을 드려 죄송합니다.")
                accessDenied()
            }
        }
        "33" -> {
            println("\nAdmin: View all Ade/Juice list\n")
            val adeJuiceList: List<AdeJuice> = menuList.filterIsInstance<AdeJuice>()
            if (adeJuiceList.isNotEmpty()){
                adeJuiceList.forEachIndexed {index, adeJuice ->
                    println("${index + 1}. ${adeJuice.name} - ${adeJuice.price}원, 소요 시간: ${adeJuice.time}분")
                }
            }else{
                println("Empty")
            }
            accessDenied()
        }
        "4" -> {
            val dessertList: List<Dessert> = menuList.filterIsInstance<Dessert>()
            if (dessertList.isNotEmpty()) {
                println("\n티를 선택하셨습니다.") //println가 아니라 클래스 호출을 해야할 듯
                selectDessertMenu()
                dessertMenu()
            }else{
                println("지금은 티 상품을 이용하실 수 없습니다.\n이용에 불편을 드려 죄송합니다.")
                accessDenied()
            }
        }
        "44" -> {
            println("\nAdmin: View all Dessert list\n")
            val dessertList: List<Dessert> = menuList.filterIsInstance<Dessert>()
            if (dessertList.isNotEmpty()){
                dessertList.forEachIndexed {index, dessert ->
                    println("${index + 1}. ${dessert.name} - ${dessert.price}원, 소요 시간: ${dessert.time}분")
                }
            }else{
                println("Empty")
            }
            accessDenied()
        }
        else -> {
            println("❗️유효하지 않은 입력입니다. 다시 시도해 주세요 ^.^\n")
            printMenu()
            selectMenu()
        }
    }
}





//제품 선택 후 펑션 (COMMENT! 이용불가 안내를 메뉴판에서 구현해서 메뉴가 없어요 기능 수정이 필요함)
fun coffeeMenu() {
    val coffeeList: List<Coffee> = menuList.filterIsInstance<Coffee>()
    //val coffeeList = 불변변수 coffeeList, : List<Coffee> = 데이터 타입 지정(Coffee외 다른 타입이 들어오면 에러 발생)
    //manuList = database.kt의 데이터 리스트로 초기화, .filterIsInstance<Coffee>() = Coffee 타입만 필터링해 가져온다
    //요약하면 manuList의 Coffee 타입을 필터링하고 불변변수coffeeList의 List에 추가하지만 Coffee가 아닌 경우 컴파일 에러를 발생시킨다

    val selectCoffee: String? = readLine()

    if (coffeeList.isNotEmpty()) { //coffeeList가 비어있지 않은 경우 when을 실행한다
        when (selectCoffee?.toIntOrNull()) { //selectCoffee가 단독입력 불가하다, toInt 도 null 예외 처리 하라고 에러가 발생함, null의 이중검을으로 이해하면 될 듯
            in 1..coffeeList.size -> { //List의 크기를 가져와 최대값을 직접 변경할 필요가 없도록 작성함
                val selectedCoffee = coffeeList[selectCoffee!!.toInt() - 1]
                //인덱스는 0부터 시작하기 때문에
                println("${selectedCoffee.name} 준비해 드리겠습니다. ${selectedCoffee.price}원 이고 ${selectedCoffee.time}분 정도 소요됩니다.")
            }
            0 -> {
                println("메뉴 선택으로 돌아가기")
                main()
            }
            else -> {
                println("❗유효하지 않은 입력입니다. 다시 시도해 주세요 ^.^\n")
                selectCoffeeMenu()
                coffeeMenu()
            }
        }
    } else {
        println("커피 메뉴가 없어요 ㅠㅠ") //COMMENT! 여기 else를 없애거나 다른 기능을 추가하던가?
    }
}
fun teaMenu() {
    val teaList: List<Tea> = menuList.filterIsInstance<Tea>()

    val selectTea: String? = readLine()

    if (teaList.isNotEmpty()) {
        when (selectTea?.toIntOrNull()) {
            in 1..teaList.size -> {
                val selectedTea = teaList[selectTea!!.toInt() - 1]
                println("${selectedTea.name} 준비해 드리겠습니다. ${selectedTea.price}원 이고 ${selectedTea.time}분 정도 소요됩니다.")
            }
            0 -> {
                println("메뉴 선택으로 돌아가기")
                main()
            }
            else -> {
                println("❗유효하지 않은 입력입니다. 다시 시도해 주세요 ^.^\n")
                selectTeaMenu()
                teaMenu()
            }
        }
    } else {
        println("커피 메뉴가 없어요 ㅠㅠ") //COMMENT! 여기 else를 없애거나 다른 기능을 추가하던가?
    }
}
fun adeJuiceMenu() {
    val adeJuiceList: List<Tea> = menuList.filterIsInstance<Tea>()

    val selectAdeJuice: String? = readLine()

    if (adeJuiceList.isNotEmpty()) {
        when (selectAdeJuice?.toIntOrNull()) {
            in 1..adeJuiceList.size -> {
                val selectedAdeJuice = adeJuiceList[selectAdeJuice!!.toInt() - 1]
                println("${selectedAdeJuice.name} 준비해 드리겠습니다. ${selectedAdeJuice.price}원 이고 ${selectedAdeJuice.time}분 정도 소요됩니다.")
            }
            0 -> {
                println("메뉴 선택으로 돌아가기")
                main()
            }
            else -> {
                println("❗유효하지 않은 입력입니다. 다시 시도해 주세요 ^.^\n")
                selectAdeJuiceMenu()
                adeJuiceMenu()
            }
        }
    } else {
        println("커피 메뉴가 없어요 ㅠㅠ") //COMMENT! 여기 else를 없애거나 다른 기능을 추가하던가?
    }
}
fun dessertMenu() {
    val dessertList: List<Dessert> = menuList.filterIsInstance<Dessert>()

    val selectDessert: String? = readLine()

    if (dessertList.isNotEmpty()) {
        when (selectDessert?.toIntOrNull()) {
            in 1..dessertList.size -> {
                val selectedDessert = dessertList[selectDessert!!.toInt() - 1]
                println("${selectedDessert.name} 준비해 드리겠습니다. ${selectedDessert.price}원 이고 ${selectedDessert.time}분 정도 소요됩니다.")
            }
            0 -> {
                println("메뉴 선택으로 돌아가기")
                main()
            }
            else -> {
                println("❗유효하지 않은 입력입니다. 다시 시도해 주세요 ^.^\n")
                selectDessertMenu()
                dessertMenu()
            }
        }
    } else {
        println("커피 메뉴가 없어요 ㅠㅠ") //COMMENT! 여기 else를 없애거나 다른 기능을 추가하던가?
    }
}



fun main(){
    wellcomeMenu()
    printMenu()
    selectMenu()
}

*/


/* 코드 메모

사용한 기능 : 없음

구현한 기능 : fun accessDenied()로 반복 사용되는 기능을 묶어 가독성을 향상시켰다, 그외 이전 문제해결 참고

의문사항 : 반복되는 기능이 많은데 while문을 사용하면 반복되는 코드를 줄일 수 있을 것 같다

문제사항 : 코드의 가독성이 너무 떨어진다 -> 기능 추가가 남았기 때문에 후에 개선해 볼 예정
         비슷한 기능을 하는 fun을 묶는 방법을 찾아봐야 할 것 같다, Class로 감싸고 class.fun 식으로 호출해 사용?
         또한 when을 사용하는 코드에 while을 사용하면 좋을 것 같다

요약 :

이전 문제해결 :
            문제 1 : 메뉴에 리스트가 없을 때 메뉴판을 먼저 메뉴판을 호출하는 문제 -> 메인 메뉴판에서 리스트 정보를 먼저 조회하도록 변경

            문제 2 : 필터가 제대로 작동하지 않고 모든 리스트를 불러오는 오류 -> filterIsInstance 코드 수정
                    val coffee: Coffee? = menuList.filterIsInstance<Coffee>().firstOrNull()
                      coffee 타입의 요소를 필터링하고 첫 번째 요소를 반환한다
                      filter기능은 인터넷 검색, firstOrNull은 컴파일러 추천을 사용했는데 의도했던 바와 달라 필터링 기능만 살렸다,
                      ?null도 마찬가지로 부정조건을 사용해서 필요없다

                    old -> new

                    val coffeeList: List<Coffee> = menuList.filterIsInstance<Coffee>()
                    coffeeList 불변변수의 List를 생성하는데 여기에는 오직 <Coffee>지정된 타입만 담을 수 있고 다른 타입의 데이터가 들어오면 오류가 생긴다
                    이 불변변수는 menuList로 초기화 되는데 filterIsInstance는 전체 리스트 중 Coffee 타입만 가져와 리스트에 추가한다

           문제 3 : 키보드 입력 중 Enter 값만 입력 받도록 하고 싶다

*/

package com.example.mgckiosk



//denied 기능 합침 (NEW! 반복 사용해야 하는 fun을 묶어 간결성 확보)
fun accessDenied() {
    println("\n'Enter' to Return")
    System.`in`.read()
    printMenu()
    selectMenu()
}

//메뉴 선택 안내 (NEW! 항목별 인덱스 오류 수정, 항목이 없는 경우 이용불가 안내 추가, 이용불가 안내 시 메뉴판 노출 블락, Denied 기능 묶어 간결성 확보)
fun selectMenu() {
    val selectMenu: String? = readLine()
    //readLine으로 키보드 입력을 받아 기능을 선택할 수 있도록 함
    when (selectMenu) { //이번에는 when을 사용하고 다음에는 while 사용해 보기
        "1" -> {
            val coffeeList: List<Coffee> = menuList.filterIsInstance<Coffee>()
            //val coffeeList = 불변변수 coffeeList, : List<Coffee> = 데이터 타입 지정(Coffee외 다른 타입이 들어오면 에러 발생)
            //manuList = database.kt의 데이터 리스트로 초기화, .filterIsInstance<Coffee>() = Coffee 타입만 필터링해 가져온다
            //요약하면 manuList의 Coffee 타입을 필터링하고 불변변수coffeeList의 List에 추가하지만 Coffee가 아닌 경우 컴파일 에러를 발생시킨다

            if (coffeeList.isNotEmpty()) {
                //초기화된 리스트에 값이 있는 경우를 가정한다 = 필터에 null 조건이 필요가 없어진다
                //isEmpty 사용도 상관없지만 가독성을 위해 값이 있는 경우를 우선으로 조건을 설정했다
                println("\n커피를 선택하셨습니다.")
                selectCoffeeMenu()
                coffeeMenu()
            }else{
                //초기화된 리스트에 값이 없는 경우를 가정한다
                println("지금은 커피 상품을 이용하실 수 없습니다.\n이용에 불편을 드려 죄송합니다.")
                accessDenied()
                //리턴 안내, 메뉴 출력, 선택화면 복귀를 한 펑션에 담아 코드를 줄였다
            }
        }
        "11" -> {
            //코드 Run 상태에서 리스트에 올바르게 추가되었는지 확인하기 위한 히든메뉴
            println("\nAdmin: View all coffee list\n")
            val coffeeList: List<Coffee> = menuList.filterIsInstance<Coffee>()
            //val coffeeList = 불변변수 coffeeList, : List<Coffee> = 데이터 타입 지정(Coffee외 다른 타입이 들어오면 에러 발생)
            //manuList = database.kt의 데이터 리스트로 초기화, .filterIsInstance<Coffee>() = Coffee 타입만 필터링해 가져온다
            //요약하면 manuList의 Coffee 타입을 필터링하고 불변변수coffeeList의 List에 추가하지만 Coffee가 아닌 경우 컴파일 에러를 발생시킨다

            if (coffeeList.isNotEmpty()){
                coffeeList.forEachIndexed {index, coffee ->
                    println("${index + 1}. ${coffee.name} - ${coffee.price}원, 소요 시간: ${coffee.time}분")
                }//인덱스튼 0번 부터 시작하기 때문에 사용 편의상 +1을 해 주었다
            }else{
                println("Empty")
            }
            accessDenied()
        }
        "2" -> {
            val teaList: List<Tea> = menuList.filterIsInstance<Tea>()
            if (teaList.isNotEmpty()) {
                println("\n티를 선택하셨습니다.") //println가 아니라 클래스 호출을 해야할 듯
                selectTeaMenu()
                teaMenu()
            }else{
                println("지금은 티 상품을 이용하실 수 없습니다.\n이용에 불편을 드려 죄송합니다.")
                accessDenied()
            }
        }
        "22" -> {
            println("\nAdmin: View all Tea list\n")
            val teaList: List<Tea> = menuList.filterIsInstance<Tea>()
            if (teaList.isNotEmpty()){
                teaList.forEachIndexed {index, tea ->
                    println("${index + 1}. ${tea.name} - ${tea.price}원, 소요 시간: ${tea.time}분")
                }
            }else{
                println("Empty")
            }
            accessDenied()
        }
        "3" -> {
            val adeJuiceList: List<AdeJuice> = menuList.filterIsInstance<AdeJuice>()
            if (adeJuiceList.isNotEmpty()) {
                println("\n티를 선택하셨습니다.") //println가 아니라 클래스 호출을 해야할 듯
                selectAdeJuiceMenu()
                adeJuiceMenu()
            }else{
                println("지금은 티 상품을 이용하실 수 없습니다.\n이용에 불편을 드려 죄송합니다.")
                accessDenied()
            }
        }
        "33" -> {
            println("\nAdmin: View all Ade/Juice list\n")
            val adeJuiceList: List<AdeJuice> = menuList.filterIsInstance<AdeJuice>()
            if (adeJuiceList.isNotEmpty()){
                adeJuiceList.forEachIndexed {index, adeJuice ->
                    println("${index + 1}. ${adeJuice.name} - ${adeJuice.price}원, 소요 시간: ${adeJuice.time}분")
                }
            }else{
                println("Empty")
            }
            accessDenied()
        }
        "4" -> {
            val dessertList: List<Dessert> = menuList.filterIsInstance<Dessert>()
            if (dessertList.isNotEmpty()) {
                println("\n티를 선택하셨습니다.") //println가 아니라 클래스 호출을 해야할 듯
                selectDessertMenu()
                dessertMenu()
            }else{
                println("지금은 티 상품을 이용하실 수 없습니다.\n이용에 불편을 드려 죄송합니다.")
                accessDenied()
            }
        }
        "44" -> {
            println("\nAdmin: View all Dessert list\n")
            val dessertList: List<Dessert> = menuList.filterIsInstance<Dessert>()
            if (dessertList.isNotEmpty()){
                dessertList.forEachIndexed {index, dessert ->
                    println("${index + 1}. ${dessert.name} - ${dessert.price}원, 소요 시간: ${dessert.time}분")
                }
            }else{
                println("Empty")
            }
            accessDenied()
        }
        else -> {
            println("❗️유효하지 않은 입력입니다. 다시 시도해 주세요 ^.^\n")
            printMenu()
            selectMenu()
        }
    }
}





//제품 선택 후 펑션 (COMMENT! 이용불가 안내를 메뉴판에서 구현해서 메뉴가 없어요 기능 수정이 필요함)
fun coffeeMenu() {
    val coffeeList: List<Coffee> = menuList.filterIsInstance<Coffee>()
    //val coffeeList = 불변변수 coffeeList, : List<Coffee> = 데이터 타입 지정(Coffee외 다른 타입이 들어오면 에러 발생)
    //manuList = database.kt의 데이터 리스트로 초기화, .filterIsInstance<Coffee>() = Coffee 타입만 필터링해 가져온다
    //요약하면 manuList의 Coffee 타입을 필터링하고 불변변수coffeeList의 List에 추가하지만 Coffee가 아닌 경우 컴파일 에러를 발생시킨다

    val selectCoffee: String? = readLine()

    if (coffeeList.isNotEmpty()) { //coffeeList가 비어있지 않은 경우 when을 실행한다
        when (selectCoffee?.toIntOrNull()) { //selectCoffee가 단독입력 불가하다, toInt 도 null 예외 처리 하라고 에러가 발생함, null의 이중검을으로 이해하면 될 듯
            in 1..coffeeList.size -> { //List의 크기를 가져와 최대값을 직접 변경할 필요가 없도록 작성함
                val selectedCoffee = coffeeList[selectCoffee!!.toInt() - 1]
                //인덱스는 0부터 시작하기 때문에
                println("${selectedCoffee.name} 준비해 드리겠습니다. ${selectedCoffee.price}원 이고 ${selectedCoffee.time}분 정도 소요됩니다.")
            }
            0 -> {
                println("메뉴 선택으로 돌아가기")
                main()
            }
            else -> {
                println("❗유효하지 않은 입력입니다. 다시 시도해 주세요 ^.^\n")
                selectCoffeeMenu()
                coffeeMenu()
            }
        }
    } else {
        println("커피 메뉴가 없어요 ㅠㅠ") //COMMENT! 여기 else를 없애거나 다른 기능을 추가하던가?
    }
}
fun teaMenu() {
    val teaList: List<Tea> = menuList.filterIsInstance<Tea>()

    val selectTea: String? = readLine()

    if (teaList.isNotEmpty()) {
        when (selectTea?.toIntOrNull()) {
            in 1..teaList.size -> {
                val selectedTea = teaList[selectTea!!.toInt() - 1]
                println("${selectedTea.name} 준비해 드리겠습니다. ${selectedTea.price}원 이고 ${selectedTea.time}분 정도 소요됩니다.")
            }
            0 -> {
                println("메뉴 선택으로 돌아가기")
                main()
            }
            else -> {
                println("❗유효하지 않은 입력입니다. 다시 시도해 주세요 ^.^\n")
                selectTeaMenu()
                teaMenu()
            }
        }
    } else {
        println("커피 메뉴가 없어요 ㅠㅠ") //COMMENT! 여기 else를 없애거나 다른 기능을 추가하던가?
    }
}
fun adeJuiceMenu() {
    val adeJuiceList: List<Tea> = menuList.filterIsInstance<Tea>()

    val selectAdeJuice: String? = readLine()

    if (adeJuiceList.isNotEmpty()) {
        when (selectAdeJuice?.toIntOrNull()) {
            in 1..adeJuiceList.size -> {
                val selectedAdeJuice = adeJuiceList[selectAdeJuice!!.toInt() - 1]
                println("${selectedAdeJuice.name} 준비해 드리겠습니다. ${selectedAdeJuice.price}원 이고 ${selectedAdeJuice.time}분 정도 소요됩니다.")
            }
            0 -> {
                println("메뉴 선택으로 돌아가기")
                main()
            }
            else -> {
                println("❗유효하지 않은 입력입니다. 다시 시도해 주세요 ^.^\n")
                selectAdeJuiceMenu()
                adeJuiceMenu()
            }
        }
    } else {
        println("커피 메뉴가 없어요 ㅠㅠ") //COMMENT! 여기 else를 없애거나 다른 기능을 추가하던가?
    }
}
fun dessertMenu() {
    val dessertList: List<Dessert> = menuList.filterIsInstance<Dessert>()

    val selectDessert: String? = readLine()

    if (dessertList.isNotEmpty()) {
        when (selectDessert?.toIntOrNull()) {
            in 1..dessertList.size -> {
                val selectedDessert = dessertList[selectDessert!!.toInt() - 1]
                println("${selectedDessert.name} 준비해 드리겠습니다. ${selectedDessert.price}원 이고 ${selectedDessert.time}분 정도 소요됩니다.")
            }
            0 -> {
                println("메뉴 선택으로 돌아가기")
                main()
            }
            else -> {
                println("❗유효하지 않은 입력입니다. 다시 시도해 주세요 ^.^\n")
                selectDessertMenu()
                dessertMenu()
            }
        }
    } else {
        println("커피 메뉴가 없어요 ㅠㅠ") //COMMENT! 여기 else를 없애거나 다른 기능을 추가하던가?
    }
}



fun main(){
    wellcomeMenu()
    printMenu()
    selectMenu()
}


/* 기능구현 메모

!!! 4 번째에는 While 기능을 공부해서 구현해 보는 것을 우선으로 한다. !!!

인터페이스는 반드시 구현되어야 하는 기능을 선언하여 강제한다
가령 핫/아이스 선택, 쿠폰코드 입력

추상클래스로 일부 기능은 공유하되 자세한 기능은 하위 클레스에서 한다

일단 기존의 틀은 그대로 유지하되 반복되는 것을 하나의 클래스로 묶는 것을 목표로 한다

목표 : Class drinkMenu로 음료 통합


[ 나중에 사용해 볼 것, 클래스의 추상화? ]

abstract class Drink(val name: String, val time: Int, val price: Int) {
    abstract fun coffeeMenu()
    abstract fun selectTea()
    abstract fun selectAdeJuice()
    abstract fun selectDessert()

class Coffee: Drink(){
    fun coffeeMenu()
}

//여러 변수를 array로 생성
open var drinks: Array<Drink?> = arrayOfNulls(5)

*/
