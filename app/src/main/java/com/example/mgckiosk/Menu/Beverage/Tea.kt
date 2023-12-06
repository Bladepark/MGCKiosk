package com.example.mgckiosk.Menu.Beverage

import com.example.mgckiosk.AbstractMenu

class Tea() : AbstractMenu() {
    override fun displayInfo() {
        println(
            "[Tea MENU]\n" +
                    "1. 녹차          | ￦ 2.5 | 고소한 감칠맛과 부드러운 목넘김으로 산뜻하게 마음을 위로하는 국내산 녹차\n" +
                    "2. 얼그레이     ㅤ| ￦ 2.5 | 홍차 특유의 풍부한 플레이버를 만끽할 수 있는 허브티\n" +
                    "3. 캐모마일     ㅤ| ￦ 2.5 | 마음을 진정 시켜주는 산뜻한 풀내음을 느낄 수 있는 허브티\n" +
                    "4. 사과유자차     | ￦ 3.5 | 애플티의 향긋함과 유자청의 상큼달콤함을 한컵에 담아낸 과일티\n" +
                    "5. 허니자몽블랙티ㅤ| ￦ 3.7 | 달콤한 꿀청에 재운 자몽에 홍차의 부드러움을 어우른 상큼한 과일티\n" +
                    "6. 뒤로가기"
        )
        var menuNumber = isValidMenuNumber(6)
        when(menuNumber) {
            1 -> {}//greenTea()
            2 -> {}//earlGrey()
            3 -> {}//chamomile()
            4 -> {}//applecitronTea()
            5 -> {}//honeyGrapefruitBlackTea()
            6 -> back(this)
        }
    }
}