
//fun 파일 분리
//사용위치 : 키오스크4

package com.example.mgckiosk

import kotlin.random.Random
//랜덤 주문번호에 사용

//사용불가 기능 묶음
fun accessDenied() {
    println("\n'Enter' to Return")
    System.`in`.read()
    printMenu()
    selectMenu()
}

//카테고리 선택 안내
fun selectMenu() {
    val coffeeList: List<Coffee> = menuList.filterIsInstance<Coffee>()
    val teaList: List<Tea> = menuList.filterIsInstance<Tea>()
    val adeJuiceList: List<AdeJuice> = menuList.filterIsInstance<AdeJuice>()
    val dessertList: List<Dessert> = menuList.filterIsInstance<Dessert>()
    //각 항목별 하나씩 있던 것을 fun 초기에 불러와 코드를 줄이고 보기 좋게 함
    //manuList의 여러 요소 중 filterIsInstance 함수로 <Coffee>만 필터링 하고 coffeeList의 List에 <Coffee>타입 외에는 에러를 발생한다

    val selectMenu: String? = readLine()

    when (selectMenu) {
        "1" -> {
            if (coffeeList.isNotEmpty()) {
                println("\n커피를 선택하셨습니다.")
                selectCoffeeMenu()
                coffeeMenu()
            }else{
                println("지금은 커피 상품을 이용하실 수 없습니다.\n이용에 불편을 드려 죄송합니다.")
                accessDenied()
            }
        }
        "11" -> {
            println("\nAdmin: View all coffee list\n")
            if (coffeeList.isNotEmpty()){
                coffeeList.forEachIndexed {index, item ->
                    println("${index + 1}. ${item.name} - ${item.price}원, 소요 시간: ${item.time}분")
                }
            }else{
                println("Empty")
            }
            accessDenied()
        }
        "2" -> {
            if (teaList.isNotEmpty()) {
                println("\n티를 선택하셨습니다.")
                selectTeaMenu()
                teaMenu()
            }else{
                println("지금은 티 상품을 이용하실 수 없습니다.\n이용에 불편을 드려 죄송합니다.")
                accessDenied()
            }
        }
        "22" -> {
            println("\nAdmin: View all Tea list\n")
            if (teaList.isNotEmpty()){
                teaList.forEachIndexed {index, item ->
                    println("${index + 1}. ${item.name} - ${item.price}원, 소요 시간: ${item.time}분")
                }
            }else{
                println("Empty")
            }
            accessDenied()
        }
        "3" -> {
            if (adeJuiceList.isNotEmpty()) {
                println("\n에이드/쥬스를 선택하셨습니다.")
                selectAdeJuiceMenu()
                adeJuiceMenu()
            }else{
                println("지금은 에이드/쥬스 상품을 이용하실 수 없습니다.\n이용에 불편을 드려 죄송합니다.")
                accessDenied()
            }
        }
        "33" -> {
            println("\nAdmin: View all Ade/Juice list\n")
            if (adeJuiceList.isNotEmpty()){
                adeJuiceList.forEachIndexed {index, item ->
                    println("${index + 1}. ${item.name} - ${item.price}원, 소요 시간: ${item.time}분")
                }
            }else{
                println("Empty")
            }
            accessDenied()
        }
        "4" -> {
            if (dessertList.isNotEmpty()) {
                println("\n디저트를 선택하셨습니다.")
                selectDessertMenu()
                dessertMenu()
            }else{
                println("지금은 디저트 상품을 이용하실 수 없습니다.\n이용에 불편을 드려 죄송합니다.")
                accessDenied()
            }
        }
        "44" -> {
            println("\nAdmin: View all Dessert list\n")
            if (dessertList.isNotEmpty()){
                dessertList.forEachIndexed {index, item ->
                    println("${index + 1}. ${item.name} - ${item.price}원, 소요 시간: ${item.time}분")
                }
            }else{
                println("Empty")
            }
            accessDenied()
        }
        "0" -> jangBaGuNiOrder()
        else -> {
            println("❗️유효하지 않은 입력입니다. 다시 시도해 주세요 ^.^\n")
            printMenu()
            selectMenu()
        }
    }
}

//메뉴 선택 안내
fun coffeeMenu() {
    val coffeeList: List<Coffee> = menuList.filterIsInstance<Coffee>()

    val selectCoffee: String? = readLine()

    if (coffeeList.isNotEmpty()) {
        when (selectCoffee?.toIntOrNull()) {
            in 1..coffeeList.size -> {
                val selectedCoffee = coffeeList[selectCoffee!!.toInt() - 1]
                println("${selectedCoffee.name}를 선택하셨습니다. ${selectedCoffee.price}원 이고 ${selectedCoffee.time}분 정도 소요됩니다.")

                val addList = AllMegaMenu(selectedCoffee.name,selectedCoffee.price,selectedCoffee.time,selectedCoffee.termo)
                jangBaGuNiList.add(addList)
                println("장바구니에 추가되었습니다\n")
                selectCoffeeMenu()
                coffeeMenu()
            }
            0 -> {
                printMenu()
                selectMenu()
            }
            else -> {
                println("❗유효하지 않은 입력입니다. 다시 시도해 주세요 ^.^\n")
                selectCoffeeMenu()
                coffeeMenu()
            }
        }
    } else {
        println("커피 메뉴가 없어요 ㅠㅠ")
    }
}
fun teaMenu() {
    val teaList: List<Tea> = menuList.filterIsInstance<Tea>()

    val selectTea: String? = readLine()

    if (teaList.isNotEmpty()) {
        when (selectTea?.toIntOrNull()) {
            in 1..teaList.size -> {
                val selectedTea = teaList[selectTea!!.toInt() - 1]
                println("${selectedTea.name}를 선택하셨습니다. ${selectedTea.price}원 이고 ${selectedTea.time}분 정도 소요됩니다.")

                val addList = AllMegaMenu(selectedTea.name,selectedTea.price,selectedTea.time,selectedTea.termo)
                jangBaGuNiList.add(addList)
                println("장바구니에 추가되었습니다\n")
                selectTeaMenu()
                teaMenu()
            }
            0 -> {
                printMenu()
                selectMenu()
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
    val adeJuiceList: List<AdeJuice> = menuList.filterIsInstance<AdeJuice>()

    val selectAdeJuice: String? = readLine()

    if (adeJuiceList.isNotEmpty()) {
        when (selectAdeJuice?.toIntOrNull()) {
            in 1..adeJuiceList.size -> {
                val selectedAdeJuice = adeJuiceList[selectAdeJuice!!.toInt() - 1]
                println("${selectedAdeJuice.name}를 선택하셨습니다. ${selectedAdeJuice.price}원 이고 ${selectedAdeJuice.time}분 정도 소요됩니다.")

                val addList = AllMegaMenu(selectedAdeJuice.name,selectedAdeJuice.price,selectedAdeJuice.time,selectedAdeJuice.termo)
                jangBaGuNiList.add(addList)
                println("장바구니에 추가되었습니다\n")
                selectAdeJuiceMenu()
                adeJuiceMenu()
            }
            0 -> {
                printMenu()
                selectMenu()
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
                println("${selectedDessert.name}를 선택하셨습니다. ${selectedDessert.price}원 이고 ${selectedDessert.time}분 정도 소요됩니다.")

                val addList = AllMegaMenu(selectedDessert.name,selectedDessert.price,selectedDessert.time,selectedDessert.termo)
                jangBaGuNiList.add(addList)
                println("장바구니에 추가되었습니다\n")
                selectDessertMenu()
                dessertMenu()
            }
            0 -> {
                printMenu()
                selectMenu()
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

//장바구니 add/remove
fun jangBaGuNiOrder(){
    println("\n[     장 바 구 니     ]\n")
    if (jangBaGuNiList.isNotEmpty()){
        var finalPrice = 0
        jangBaGuNiList.forEachIndexed {index, item ->
            //jangBaGuNiList의 요소를 forEachIndexed 함수로 각기 다른 요소를 item 이름으로 일원화 하여 출력
            println("${index + 1}. ${item.name} - ${item.price}원, 소요 시간: ${item.time}분")
            finalPrice += item.price
            //+= : 모두 덧셈 후 결과값을 finalPrice에 대입한다
        }
        println("\n전체상품 가격 : $finalPrice")
        println("-----------------\n1.주문하기  2.선택취소\n-----------------\n    0.뒤로가기\n")

    }else{
        println("장바구니가 beer있어요\n\n")
        printMenu()
        selectMenu()
    }

    val randomNumber = Random.nextInt(1, 101)
    val rotoeowif: String? = readLine()
    when (rotoeowif?.toIntOrNull()) {
        0 -> {printMenu()
            selectMenu()
        }
        1 -> {
            println("주문번호 ${randomNumber}번 입니다. 잠시만 기다려 주세요~")
            return
        }
        2 -> jangBaGuNiRemove()
        else -> {
            println("❗유효하지 않은 입력입니다. 다시 시도해 주세요 ^.^\n")
            jangBaGuNiOrder()
        }
    }
}
fun jangBaGuNiRemove(){
    val jangList = jangBaGuNiList

    println("\n[     장 바 구 니     ]\n")
    if (jangBaGuNiList.isNotEmpty()){
        var finalPrice = 0
        jangBaGuNiList.forEachIndexed {index, item ->
            //jangBaGuNiList의 요소를 forEachIndexed 함수로 각기 다른 요소를 item 이름으로 일원화 하여 출력
            println("${index + 1}. ${item.name} - ${item.price}원, 소요 시간: ${item.time}분")
            finalPrice += item.price
            //+= : 모두 덧셈 후 결과값을 finalPrice에 대입한다
        }
        println("\n전체상품 가격 : $finalPrice")

    }else{
        println("장바구니가 beer있어요\n\n")
        printMenu()
        selectMenu()
    }

    println("\n[장바구니에서 삭제할 항목의 번호를 입력해주세요]\n0.장바구니로 돌아가기\n999.장바구니 모두 비우기")
    val goStop: String? = readLine()
    when (goStop?.toIntOrNull()) {
        0 -> jangBaGuNiOrder()
        999 -> {
            jangBaGuNiList.clear()
            println("장바구니를 모두 비웠습니다\n")
            jangBaGuNiRemove()
        }
        in 1..jangList.size -> {
            val selToRemove = jangList[goStop!!.toInt() - 1]
            jangBaGuNiList.remove(selToRemove)
            jangBaGuNiRemove()
        }
        else ->{
            println("❗유효하지 않은 입력입니다. 다시 시도해 주세요 ^.^\n")
            jangBaGuNiRemove()
        }
    }
    //jangBaGuNiList.remove(인덱스 번호)
    //jangBaGuNiList.clear()
}