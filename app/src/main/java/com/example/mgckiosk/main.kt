package com.example.mgckiosk
//ㅤ/ /<-특수공백문자있음

// 메가 커피 키오스크 팀 과제 3조 파이팅!!
//큰 틀 카테고리 3개 [Beverage] [Food] [Product]

//Beverage -> [Coffee] [Tea] [Ade&Juice] [Smoothie&Frappe] / Food -> [Bread] [Cookie&Macaron] [Cake] / Product ->[Mug] [Tumbler] [StickCoffee] [TeaPleasure]

// Coffee -> 에스프레소[Hot] 아메리카노[Hot/Ice] 왕할메가커피[Ice] 카라멜마끼아또[Hot/Ice] 바닐라라떼[Hot/Ice]
// Tea   -> 복숭아아이스티[Ice] 녹차[Hot/Ice] 얼그레이[Hot/Ice] 캐모마일[Hot/Ice] 허니자몽블랙티[Hot/Ice]
// Ade&Juice -> Only Ice 메가에이드 라임모히또 블루레몬에이드 유니콘매직에이드 자몽에이드 체리콕 청포도에이드
// Smoothie&Frappe -> Only Ice 쿠키프라페 딸기요거트스무디 녹차프라페 망고요거트스무디 플레인요거트스무디 딸기퐁크러쉬 초코허니퐁크러쉬

// Bread -> 와앙피자보름달빵 와앙콘마요보름달빵 핫도그 감자빵 허니브레드 버터버터소금빵 크루아상
// Cookie&Macaron -> 뚱크림치즈약과쿠키 말차스모어쿠키 마카다미아쿠키 초콜릿칩쿠키 딸기요거트마카롱 메가초코마카롱 유니콘프라페마카롱 쿠키프라페마카롱
// Cake -> 몽쉘케이크 치즈케익 초코무스케익 티라미수케익 오트밀팬케이크 티라미수팬케이크

// Mug -> 엠지씨머그(옐로우) 머그(옐로우) 머그(블랙)
// Tumbler -> 엠지씨텀블러(웜그레이) 엠지씨텀블러(옐로우) 엠지씨텀블러(스카이) 텀블러(화이트) 텀블러(실버) 텀블러(브론즈)
// StickCoffee -> 메가엠지씨스틱오리지날아메리카노 메가엠지씨스틱디카페인아메리카노 메가엠지씨스틱스테비아믹스커피 메가엠지씨스틱스테비아디카페인믹스커피
// TeaPleasure -> 메가엠지씨티플레저블루밍캐모마일 메가엠지씨티플레저프루티루이보스 메가엠지씨티플레저스위트히비스커스
fun main() {
    println(
        "아래 메뉴판을 보시고 메뉴를 골라 해당하는 번호를 입력해주세요.\n\n" +
        "[MEGA COFFEE MENU]\n" +
        "1. Beverage    | 깊고 부드러운 커피 맛의 비밀 행복을 선사하는 다양한 음료\n" +
        "2. Food        | 음료와 잘 어울리는 다양한 디저트\n" +
        "3. Product     | 메가커피와 함께하는 데일리 굿즈"
    )
    var menuNumber = readLine()!!.toInt()
    when(menuNumber) {
        1 -> beverage()
        2 -> food()
        3 -> product()
    }
}

fun beverage() {
    println(
        "[Beverage MENU]\n" +
        "1. Coffee          | 메가커피만의 깊고 부드러운 커피 맛의 비밀\n" +
        "2. Tea             | 향긋함으로 산뜻하게 마음을 위로하는 차\n" +
        "3. Ade&Juice       | 상콤&달콤&새콤 3콤보 에이드&주스\n" +
        "4. Smoothie&Frappe | 과일과 토핑의 콜라보 부드러운데 찐한 스무디&프라\n" +
        "5. 뒤로가기"
    )
    var menuNumber = readLine()!!.toInt()
    when(menuNumber) {
        1 -> coffee()
        2 -> tea()
        3 -> adeJuice()
        4 -> smoothieFrappe()
        5 -> return
    }
}

fun food() {
    println(
        "[Food MENU]\n" +
        "1. Bread           | 메가커피와 잘 어울리고 한끼로도 든든한 빵\n" +
        "2. Cookie&Macaron  | 바삭하고 고소한 달달한 맛의 강자 쿠키와 마카롱\n" +
        "3. Cake            | 부드럽고 진하게 달콤한 맛을 느낄 수 있는 케이크\n" +
        "4. 뒤로가기"
    )
    var menuNumber = readLine()!!.toInt()
    when(menuNumber) {
        1 -> bread()
        2 -> cookieMacaron()
        3 -> cake()
        4 -> return
    }
}
fun product() {
    println(
        "[Product MENU]\n" +
        "1. Mug           | 일상 어디서든 활용하기 좋은 메가MGC커피 대용량 머그\n" +
        "2. Tumbler       | 뛰어난 보온보냉력으로 하루종일 그대로, 기능성과 비주얼을 다잡은 메가MGC커피 텀블러\n" +
        "3. StickCoffee   | 커피원두 원산지의 프로세스 방식으로 본 고장 커피 본연의 맛을 그대로 담은 스틱커피\n" +
        "4. TeaPleasure   | 마음의 안정과 여유를 주는 은은하면서도 무게감있는 메가MGC만의 티플레저\n" +
        "5. 뒤로가기"
    )
    var menuNumber = readLine()!!.toInt()
    when(menuNumber) {
        1 -> mug()
        2 -> tumbler()
        3 -> stickCoffee()
        4 -> teaPleasure()
        5 -> return
    }
}


fun coffee() {
    println(
        "[Coffee MENU]\n" +
        "1. 에스프레소        | ￦ 1.5 |  메가MGC커피 원두의 향미를 온전히 즐길 수 있는 에스프레소\n" +
        "2. 아메리카노        | ￦ 2.0 |  메가MGC커피 블렌드 원두로 추출한 에스프레소에 물을 더해, 풍부한 바디감을 느낄 수 있는 스탠다드 커피\n" +
        "3. 왕할메가커피   ㅤㅤ| ￦ 3.5 |  우리 할머니께서 즐겨드시던 달달한 믹스 커피 스타일로 만든 메가MGC커피만의 메가사이즈 커피 음료\n" +
        "4. 카라멜마끼아또   ㅤ| ￦ 3.7 |  폼 밀크 속에 진한 에스프레소와 달콤한 카라멜을 가미해 부드럽게 즐기는 커피\n" +
        "5. 바닐라라떼        | ￦ 3.4 |  바닐라의 짙은 향과 풍부한 폼 밀크의 조화가 인상적인 달콤한 라떼\n" +
        "6. 뒤로가기"
    )
    var menuNumber = readLine()!!.toInt()
    when(menuNumber) {
        1 -> {}//espresso()
        2 -> {}//americano()
        3 -> {}//bigMixCoffee()
        4 -> {}//caramelMacchiato()
        5 -> {}//vanillaLatte()
        6 -> return
    }
}
fun tea() {
    println(
        "[Tea MENU]\n" +
        "1. 녹차          | ￦ 2.5 | 고소한 감칠맛과 부드러운 목넘김으로 산뜻하게 마음을 위로하는 국내산 녹차\n" +
        "2. 얼그레이     ㅤ| ￦ 2.5 | 홍차 특유의 풍부한 플레이버를 만끽할 수 있는 허브티\n" +
        "3. 캐모마일     ㅤ| ￦ 2.5 | 마음을 진정 시켜주는 산뜻한 풀내음을 느낄 수 있는 허브티\n" +
        "4. 사과유자차     | ￦ 3.5 | 애플티의 향긋함과 유자청의 상큼달콤함을 한컵에 담아낸 과일티\n" +
        "5. 허니자몽블랙티ㅤ| ￦ 3.7 | 달콤한 꿀청에 재운 자몽에 홍차의 부드러움을 어우른 상큼한 과일티\n" +
        "6. 뒤로가기"
    )
    var menuNumber = readLine()!!.toInt()
    when(menuNumber) {
        1 -> {}//greenTea()
        2 -> {}//earlGrey()
        3 -> {}//chamomile()
        4 -> {}//applecitronTea()
        5 -> {}//honeyGrapefruitBlackTea()
        6 -> return
    }
}
fun adeJuice() {
    println(
        "[Ade & Juice MENU]\n" +
        "1. 메가에이드          | ￦ 3.9 | 상큼한 레몬, 상쾌한 라임, 달콤쌉싸름한 자몽의 3색 맛을 한데 어우른 메가MGC커피 시그니처 에이드\n" +
        "2. 블루레몬에이드     ㅤ| ￦ 3.5 | 레몬에이드의 상큼한 청량감에 블루큐라소의 진한 향미를 더한 에이드\n" +
        "3. 유니콘매직에이드     | ￦ 3.8 | 섞으면 마법처럼 색이 변하는 재미에 라임의 청량함으로 입까지 즐거운 이색 에이드\n" +
        "4. 자몽에이드          | ￦ 3.5 | 자몽의 달콤쌉싸름한 맛과 탄산의 톡쏘는 목넘김이 어우러진 트로피컬 에이드\n" +
        "5. 청포도에이드       ㅤ| ￦ 3.5 | 산뜻한 청포도와 상쾌한 탄산의 달달한 조화가 인상적인 에이드\n" +
        "6. 라임모히또          | ￦ 3.8 | 상큼한 라임과 달콤한 향기의 애플민트가 어우러져 상쾌함을 한잔에 가득 채운 모히또 음료\n" +
        "7. 체리콕             | ￦ 3.3 | 체리의 새콤함과 청량감을 동시에 즐길 수 있는 환상적인 에이드\n" +
        "8. 뒤로가기"
    )
    var menuNumber = readLine()!!.toInt()
    when(menuNumber) {
        1 -> {}//megaAde()
        2 -> {}//blueLemonAde()
        3 -> {}//unicornMagicAde()
        4 -> {}//grapefruitAde()
        5 -> {}//greenGrapeAde()
        6 -> {}//limeMojito()
        7 -> {}//cherryCoke()
        8 -> return
    }
}
fun smoothieFrappe() {
    println(
        "[Smoothie & Frappe MENU]\n" +
        "1. 쿠키프라페           | ￦ 3.9 | 바삭하고 달콤한 오레오와 고소한 우유, 부드러운 바닐라향의 조화를 느낄 수 있는 프라페\n" +
        "2. 녹차프라페     ㅤ  ㅤ | ￦ 3.9 | 향긋한 녹차 위에 우유와 휘핑크림을 더해 더 부드럽게 즐길 수 있는 프라페\n" +
        "3. 플레인요거트스무디   ㅤ| ￦ 3.9 | 더 시원하게 요거트의 새콤달콤한 맛을 오롯이 만끽할 수 있는 스무디\n" +
        "4. 딸기요거트스무디      | ￦ 3.9 | 요거트의 상큼함과 딸기의 상큼함을 상냥하게 어우른 상큼 스무디\n" +
        "5. 망고요거트스무디      | ￦ 3.9 | 열대과일 망고의 진한 단 맛과 산뜻한 요거트의 하모니가 인상적인 스무디\n" +
        "6. 딸기퐁크러쉬        ㅤ| ￦ 3.9 | 바삭하고 달달한 퐁에 상큼한 딸기와 부드러운 우유, 얼음을 함께 블렌딩해 시원하게 즐기는 프라페\n" +
        "7. 초코허니퐁크러쉬      | ￦ 3.9 | 리얼 벌꿀이 들어가 더 달콤한 퍼프허니 시리얼과 부드럽게 달달한 초코가 함께 만드는 즐거운 맛의 프라페\n" +
        "8. 뒤로가기"
    )
    var menuNumber = readLine()!!.toInt()
    when(menuNumber) {
        1 -> {}//cookieFrappe()
        2 -> {}//greenTeaFrappe()
        3 -> {}//plainYogurtSmoothie()
        4 -> {}//strawberryYogurtSmoothie()
        5 -> {}//mangoYogurtSmoothie()
        6 -> {}//strawberryPongCrush()
        7 -> {}//chocolateHoneyPongCrush()
        8 -> return
    }
}
fun bread() {
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
    var menuNumber = readLine()!!.toInt()
    when(menuNumber) {
        1 -> {}//pizzaBread()
        2 -> {}//cornMayoBread()
        3 -> {}//honeyBread()
        4 -> {}//saltyButterRoll()
        5 -> {}//mangoYogurtSmoothie()
        6 -> {}//potatoBread()
        7 -> {}//hotdog()
        8 -> return
    }
}
fun cookieMacaron() {
    println(
        "[Cookie & Macaron MENU]\n" +
        "1. 뚱크림치즈약과쿠키   ㅤ| ￦ 2.9 | 쿠키 안에 바닐라맛 크림치즈 가득! 달달하고 꾸덕한 약과가 통째로 올라간 쫀득한 쿠키\n" +
        "2. 말차스모어쿠키     ㅤㅤ| ￦ 2.9 | 화이트 초코칩이 가득 박힌 말차 쿠키에 달콤하게 구운 마시멜로우를 얹어 달콤쌉싸름한 매력을 간직한 쿠키\n" +
        "3. 마카다미아쿠키   ㅤ  ㅤ| ￦ 1.8 | 고소한 마카다미아를 넣어 만든 메가MGC커피 시그니처 쿠키\n" +
        "4. 초콜릿칩쿠키        ㅤ| ￦ 1.8 | 진한 초콜릿칩을 넣어 만든 메가MGC커피 시그니처 쿠키\n" +
        "5. 딸기요거트마카롱   ㅤㅤ| ￦ 1.8 | 딸기요거트 스무디를 연상하게 하는 상큼한 마카롱\n" +
        "6. 메가초코마카롱      ㅤ| ￦ 1.8 | 메가커피 시그니처 음료 메가초코를 모티브로 만든 초코맛 마카롱\n" +
        "7. 유니콘프라페마카롱   ㅤ| ￦ 1.8 | 메가커피 인기 음료인 유니콘 프라페를 모티브로 만든 매지컬 비주얼 마카롱\n" +
        "8. 뒤로가기"
    )
    var menuNumber = readLine()!!.toInt()
    when(menuNumber) {
        1 -> {}//creamCheeseYakgwaCookie()
        2 -> {}//matchaSmoresCookie()
        3 -> {}//macadamiaCookie()
        4 -> {}//chocolateChipCookie()
        5 -> {}//strawberryYogurtMacaron()
        6 -> {}//megaChocolateMacaron()
        7 -> {}//unicornFrappeMacaron()
        8 -> return
    }
}
fun cake() {
    println(
        "[Cake MENU]\n" +
        "1. 몽쉘케이크        | ￦ 4.9 | 진하고 폭신한 초콜릿 스펀지 사이에 부드러운 생크림이 듬뿍 들어간 몽쉘 케이크\n" +
        "2. 초코무스케익    ㅤ | ￦ 3.3 | 달콤한 초콜릿 본연의 맛을 더 진하게 느낄 수 있는 케이크\n" +
        "3. 티라미수케익   ㅤ  | ￦ 3.3 | 부드러운 치즈 맛과 코코아의 조화로운 향으로 호불호 없이 즐기는 케이크\n" +
        "4. 치즈케익          | ￦ 3.3 | 진한 치즈의 맛을 달콤하고 부드럽게 느낄 수 있는 케이크\n" +
        "5. 오트밀팬케이크     | ￦ 4.5 | 건강한 오트밀가루로 만든 팬케이크에 달콤한 메이플 시럽과 프레지덩 버터, 쥬에그 과일잼이 더해진 팬케이크\n" +
        "6. 티라미수팬케이크   | ￦ 4.5 | 에스프레소의 향이 느껴지는 달콤한 팬케이크에 크리미한 크림이 가득 올라간 부드러운 티라미수 팬케이크\n" +
        "7. 뒤로가기"
    )
    var menuNumber = readLine()!!.toInt()
    when(menuNumber) {
        1 -> {}//monCherCreamCake()
        2 -> {}//chocolateMousseCake()
        3 -> {}//tiramisuCake()
        4 -> {}//cheeseCake()
        5 -> {}//oatmealPancake()
        6 -> {}//tiramisuPancake()
        7 -> return
    }
}
fun mug() {
    println(
        "[Mug MENU]\n" +
        "1. MGC머그   ㅤ | ￦ 6.5 | 귀여운 디테일로 소장가치를 더한 대용량 머그\n" +
        "2. 머그     ㅤㅤ| ￦ 5.0 | 일상 어디서든 활용하기 좋은 메가MGC커피 대용량 머그컵\n" +
        "3. 뒤로가기"
    )
    var menuNumber = readLine()!!.toInt()
    when(menuNumber) {
        1 -> {}//mgcMug()
        2 -> {}//basicMug()
        3 -> return
    }
}

fun tumbler() {
    println(
        "[Tumbler MENU]\n" +
        "1. MGC텀블러    ㅤ| ￦ 3.9 | 뛰어난 보온보냉력으로 하루종일 그대로, MGC 데일리 텀블러\n" +
        "2. 텀블러     ㅤ  | ￦ 3.9 | 기능성과 비주얼을 다잡은 메가MGC커피 텀블러\n" +
        "3. 뒤로가기"

    )
    var menuNumber = readLine()!!.toInt()
    when(menuNumber) {
        1 -> {}//mgcTumbler()
        2 -> {}//basicTumbler()
        3 -> return
    }
}
fun stickCoffee() {
    println(
        "[StickCoffee MENU]\n" +
        "1. 오리지날아메리카노           | ￦ 4.9 | 예가체프 원두의 레드와인을 연상케 하는 깊은 풍미, 화이트 초콜릿의 고급스런 단 맛에 풍부한 바디감을 더해 밸런스 잡힌 맛을 느낄 수 있는 아메리카노\n" +
        "2. 디카페인아메리카노     ㅤ  ㅤ | ￦ 4.9 | 물의 삼투압을 이용한 독일 워터 프로세스 방식으로 카페인을 줄이고,브라질 원두 특유의 산미와 달콤함, 바디감은 고스란히 담아 조화로운 맛을 느낄 수 있는 아메리카노\n" +
        "3. 스테비아믹스커피   ㅤ        | ￦ 5.9 | 무지방 우유가 함유된 프리마로 커피 본연의 맛은 배가시키고대체 감미료 스테비아로 당과 칼로리를 낮춰 부담 없이 달콤한 라떼의 맛을 즐길 수 있는 믹스커피\n" +
        "4. 스테비아디카페인믹스커피      | ￦ 5.9 | 무지방 우유가 함유된 프리마로 커피 본연의 맛은 배가시키고 대체 감미료 스테비아로 당과 칼로리는 낮춘 디카페인임에도 밸런스 잡힌 스테비아 디카페인 믹스커피\n" +
        "5. 뒤로가기"
    )
    var menuNumber = readLine()!!.toInt()
    when(menuNumber) {
        1 -> {}//stickOriginalAmericano()
        2 -> {}//stickDecafAmericano()
        3 -> {}//stickSteviaMixCoffee()
        4 -> {}//stickSteviaDecafMixCoffee()
        5 -> return
    }
}
fun teaPleasure() {
    println(
        "[TeaPleasure MENU]\n" +
        "1. 블루밍캐모마일      | ￦ 6.5 | 마음의 안정과 여유를 주는 은은하고 향긋한 캐모마일의 꽃향과 싱그러운 레몬그라스, 비타민C가 풍부한 사과를 블렌딩한 디카페인 캐모마일 블렌딩 티\n" +
        "2. 프루티루이보스      | ￦ 6.5 | 무게감 있으면서도 개운하고 깔끔한 전세계 4% 클래식 등급 루이보스와 비타민C가 풍부한 제주도산 귤피, 전남 고흥산 유자를 블렌딩한 디카페인 루이보스 블렌딩 티\n" +
        "3. 스위트히비스커스   ㅤ| ￦ 6.5 | 상큼한 히비스커스에 비타민C, 비타민E가 풍부한 레몬머틀과 달콤한 패션후르츠향, 천연 감미료 스테비아를 더해 새콤달콤하게 블렌딩한 디카페인 히비스커스 블렌딩 티\n" +
        "4. 뒤로가기"
    )
    var menuNumber = readLine()!!.toInt()
    when(menuNumber) {
        1 -> {}//teaPleasureBloomingChamomile()
        2 -> {}//teaPleasureFruityRooibos()
        3 -> {}//teaPleasureSweetHibiscus()
        4 -> return
    }
}

