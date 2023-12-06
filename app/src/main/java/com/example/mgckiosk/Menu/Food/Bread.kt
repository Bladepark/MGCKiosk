package com.example.mgckiosk.Menu.Food

import com.example.mgckiosk.AbstractMenu

class Bread() : AbstractMenu() {
    override fun displayInfo() {
        println(
            "[Bread MENU]\n" +
                    "1. 와앙피자보름달빵   ㅤ| ￦ 4.5 | 한끼로도 든든한 중독적인 추억의 와앙 큰 소시지 피자빵\n" +
                    "2. 와앙콘마요보름달빵   | ￦ 4.5 | 톡톡 터지는 옥수수콘이 매력적인 와앙 큰 콘치즈마요 보름달빵\n" +
                    "3. 허니브레드   ㅤ   ㅤ| ￦ 4.5 | 바삭하고 쫄깃하게 구워낸 빵에 달콤한 크림을 올려 즐기는 조화로운 베이커리 메뉴\n" +
                    "4. 버터버터소금빵      | ￦ 2.5 | 고소한 프랑스산 프레지덩 버터를 듬뿍넣어 더 부드럽고 짭쪼롬하게 즐길 수 있는 베이커리 메뉴\n" +
                    "5. 크루아상           | ￦ 2.5 | 바삭하고 부드러운 식감에 고소한 버터향을 가득 담은 베이커리 메뉴\n" +
                    "6. 감자빵        ㅤ   | ￦ 3.5 | 쫄깃한 빵 속 포슬포슬한 감자를 가득 담아낸 베이커리 메뉴\n" +
                    "7. 핫도그           ㅤ| ￦ 3.0 | 부드러운 빵 속에 쫄깃한 소시지를 넣어 알찬 한입을 완성한 베이커리 메뉴\n" +
                    "8. 뒤로가기"
        )
        var menuNumber = isValidMenuNumber(8)
        when(menuNumber) {
            1 -> {}//pizzaBread()
            2 -> {}//cornMayoBread()
            3 -> {}//honeyBread()
            4 -> {}//saltyButterRoll()
            5 -> {}//mangoYogurtSmoothie()
            6 -> {}//potatoBread()
            7 -> {}//hotdog()
            8 -> back(this)
        }
    }
}