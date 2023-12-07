package com.example.mgckiosk.abs

import com.example.mgckiosk.`interface`.GoBackOrEnd

abstract class AbstractMenu: GoBackOrEnd {
    abstract var category: Int
    // Beverage ----------------------------------------------------------------------------------------
    // 커피 핫
    val hotEspresso = Triple("에스프레소(HOT)", 1.5,"메가MGC커피 원두의 향미를 온전히 즐길 수 있는 에스프레소")
    val hotAmericano = Triple("아메리카노(HOT)", 2.0,"메가MGC커피 블렌드 원두로 추출한 에스프레소에 물을 더해, 풍부한 바디감을 느낄 수 있는 스탠다드 커피")
    val hotmegaMixCoffee = Triple("왕할메가커피(HOT)", 3.5,"우리 할머니께서 즐겨드시던 달달한 믹스 커피 스타일로 만든 메가MGC커피만의 메가사이즈 커피 음료")
    val hotCaramelMacchiato = Triple("카라멜마끼아또(HOT)", 3.7,"폼 밀크 속에 진한 에스프레소와 달콤한 카라멜을 가미해 부드럽게 즐기는 커피")
    val hotVanillaLatte = Triple("바닐라라떼(HOT)", 3.4,"바닐라의 짙은 향과 풍부한 폼 밀크의 조화가 인상적인 달콤한 라떼")

    val hotCoffee = listOf(hotEspresso, hotAmericano, hotmegaMixCoffee, hotCaramelMacchiato, hotVanillaLatte)

    // 커피 아이스
    val icedEspresso = Triple("에스프레소(ICE)", 1.5,"메가MGC커피 원두의 향미를 온전히 즐길 수 있는 에스프레소")
    val icedAmericano = Triple("아메리카노(ICE)", 2.0,"메가MGC커피 블렌드 원두로 추출한 에스프레소에 물을 더해, 풍부한 바디감을 느낄 수 있는 스탠다드 커피")
    val icedmegaMixCoffee = Triple("왕할메가커피(ICE)", 3.5,"우리 할머니께서 즐겨드시던 달달한 믹스 커피 스타일로 만든 메가MGC커피만의 메가사이즈 커피 음료")
    val icedCaramelMacchiato = Triple("카라멜마끼아또(ICE)", 3.7,"폼 밀크 속에 진한 에스프레소와 달콤한 카라멜을 가미해 부드럽게 즐기는 커피")
    val icedVanillaLatte = Triple("바닐라라떼(ICE)", 3.4,"바닐라의 짙은 향과 풍부한 폼 밀크의 조화가 인상적인 달콤한 라떼")

    val icedCoffee = listOf(icedEspresso, icedAmericano, icedmegaMixCoffee, icedCaramelMacchiato, icedVanillaLatte)

    val coffee = hotCoffee + icedCoffee

    // 티 핫
    val hotGreenTea = Triple("녹차(HOT)" , 2.5, "고소한 감칠맛과 부드러운 목넘김으로 산뜻하게 마음을 위로하는 국내산 녹차")
    val hotEarlGrey = Triple("얼그레이(HOT)" , 2.5, "홍차 특유의 풍부한 플레이버를 만끽할 수 있는 허브티")
    val hotChamomile = Triple("캐모마일(HOT)" , 2.5, "마음을 진정 시켜주는 산뜻한 풀내음을 느낄 수 있는 허브티")
    val hotAppleYuzuTea = Triple("사과유자차(HOT)" , 3.5, "애플티의 향긋함과 유자청의 상큼달콤함을 한컵에 담아낸 과일티")
    val hotHoneyGrapefruitBlackTea = Triple("허니자몽블랙티(HOT)" , 3.7, "달콤한 꿀청에 재운 자몽에 홍차의 부드러움을 어우른 상큼한 과일티")

    val hotTea = listOf(hotGreenTea, hotEarlGrey, hotChamomile, hotAppleYuzuTea, hotHoneyGrapefruitBlackTea)

    // 티 아이스
    val icedGreenTea = Triple("녹차(ICE)" , 2.5, "고소한 감칠맛과 부드러운 목넘김으로 산뜻하게 마음을 위로하는 국내산 녹차")
    val icedEarlGrey = Triple("얼그레이(ICE)" , 2.5, "홍차 특유의 풍부한 플레이버를 만끽할 수 있는 허브티")
    val icedChamomile = Triple("캐모마일(ICE)" , 2.5, "마음을 진정 시켜주는 산뜻한 풀내음을 느낄 수 있는 허브티")
    val icedAppleYuzuTea = Triple("사과유자차(ICE)" , 3.5, "애플티의 향긋함과 유자청의 상큼달콤함을 한컵에 담아낸 과일티")
    val icedHoneyGrapefruitBlackTea = Triple("허니자몽블랙티(ICE)" , 3.7, "달콤한 꿀청에 재운 자몽에 홍차의 부드러움을 어우른 상큼한 과일티")

    val icedTea = listOf(icedGreenTea, icedEarlGrey, icedChamomile, icedAppleYuzuTea, icedHoneyGrapefruitBlackTea)

    val tea = icedTea + hotTea

    // 에이드 & 주스
    val megaAde = Triple("메가에이드", 3.9,"상큼한 레몬, 상쾌한 라임, 달콤쌉싸름한 자몽의 3색 맛을 한데 어우른 메가MGC커피 시그니처 에이드")
    val blueLemonade = Triple("블루레몬에이드", 3.5,"레몬에이드의 상큼한 청량감에 블루큐라소의 진한 향미를 더한 에이드")
    val unicornMagicAde = Triple("유니콘매직에이드", 3.8,"섞으면 마법처럼 색이 변하는 재미에 라임의 청량함으로 입까지 즐거운 이색 에이드")
    val grapefruitAde = Triple("자몽에이드", 3.5,"자몽의 달콤쌉싸름한 맛과 탄산의 톡쏘는 목넘김이 어우러진 트로피컬 에이드")
    val greenGrapeAde = Triple("청포도에이드", 3.5,"산뜻한 청포도와 상쾌한 탄산의 달달한 조화가 인상적인 에이드")
    val limeMojito = Triple("라임모히또", 3.8,"상큼한 라임과 달콤한 향기의 애플민트가 어우러져 상쾌함을 한잔에 가득 채운 모히또 음료")
    val cherryCoke = Triple("체리콕", 3.3,"체리의 새콤함과 청량감을 동시에 즐길 수 있는 환상적인 에이드")

    val adeJuice = listOf(megaAde, blueLemonade, unicornMagicAde, grapefruitAde, greenGrapeAde, limeMojito, cherryCoke)

    // 스무디 & 프라페
    val cookieFrappe = Triple("쿠키프라페" , 3.9, "바삭하고 달콤한 오레오와 고소한 우유, 부드러운 바닐라향의 조화를 느낄 수 있는 프라페")
    val greenTeaFrappe = Triple("녹차프라페" , 3.9, "향긋한 녹차 위에 우유와 휘핑크림을 더해 더 부드럽게 즐길 수 있는 프라페")
    val plainYogurtSmoothie = Triple("플레인요거트스무디" , 3.9, "더 시원하게 요거트의 새콤달콤한 맛을 오롯이 만끽할 수 있는 스무디")
    val strawberryYogurtSmoothie = Triple("딸기요거트스무디" , 3.9, "요거트의 상큼함과 딸기의 상큼함을 상냥하게 어우른 상큼 스무디")
    val mangoYogurtSmoothie = Triple("망고요거트스무디" , 3.9, "열대과일 망고의 진한 단 맛과 산뜻한 요거트의 하모니가 인상적인 스무디")
    val strawberryCrush = Triple("딸기퐁크러쉬" , 3.9, "바삭하고 달달한 퐁에 상큼한 딸기와 부드러운 우유, 얼음을 함께 블렌딩해 시원하게 즐기는 프라페")
    val chocoHoneyCrush = Triple("초코허니퐁크러쉬" , 3.9, "리얼 벌꿀이 들어가 더 달콤한 퍼프허니 시리얼과 부드럽게 달달한 초코가 함께 만드는 즐거운 맛의 프라페")

    val smoothieFrappe = listOf(cookieFrappe, greenTeaFrappe, plainYogurtSmoothie, strawberryYogurtSmoothie, mangoYogurtSmoothie, strawberryCrush, chocoHoneyCrush)

    val beverage = mapOf(1 to coffee, 2 to tea, 3 to adeJuice, 4 to smoothieFrappe)
    // Bakery ------------------------------------------------------------------------------------------
    // 빵
    val pizzaBread = Triple("와앙피자보름달빵" , 4.5, "한끼로도 든든한 중독적인 추억의 와앙 큰 소시지 피자빵")
    val cornMayoBread = Triple("와앙콘마요보름달빵" , 4.5, "톡톡 터지는 옥수수콘이 매력적인 와앙 큰 콘치즈마요 보름달빵")
    val honeyBread = Triple("허니브레드" , 4.5, "바삭하고 쫄깃하게 구워낸 빵에 달콤한 크림을 올려 즐기는 조화로운 베이커리 메뉴")
    val saltedButterRoll = Triple("버터버터소금빵" , 2.5, "고소한 프랑스산 프레지덩 버터를 듬뿍넣어 더 부드럽고 짭쪼롬하게 즐길 수 있는 베이커리 메뉴")
    val croissant = Triple("크루아상" , 2.5, "바삭하고 부드러운 식감에 고소한 버터향을 가득 담은 베이커리 메뉴")
    val potatoBread = Triple("감자빵" , 3.5, "쫄깃한 빵 속 포슬포슬한 감자를 가득 담아낸 베이커리 메뉴")
    val hotdog = Triple("핫도그" , 3.0, "부드러운 빵 속에 쫄깃한 소시지를 넣어 알찬 한입을 완성한 베이커리 메뉴")

    val bread = listOf(pizzaBread, cornMayoBread, honeyBread, saltedButterRoll, croissant, potatoBread, hotdog)

    // 케이크
    val monCher = Triple("몽쉘케이크" , 4.9, "진하고 폭신한 초콜릿 스펀지 사이에 부드러운 생크림이 듬뿍 들어간 몽쉘 케이크")
    val chocoMouse = Triple("초코무스케익" , 3.3 , "달콤한 초콜릿 본연의 맛을 더 진하게 느낄 수 있는 케이크")
    val tiramisu = Triple("티라미수케익" , 3.3 , "부드러운 치즈 맛과 코코아의 조화로운 향으로 호불호 없이 즐기는 케이크")
    val cheese = Triple("치즈케익" , 3.3, "진한 치즈의 맛을 달콤하고 부드럽게 느낄 수 있는 케이크")
    val oatmealPancake = Triple("오트밀팬케이크" , 4.5, "건강한 오트밀가루로 만든 팬케이크에 달콤한 메이플 시럽과 프레지덩 버터, 쥬에그 과일잼이 더해진 팬케이크")
    val tiramisuPancake = Triple("티라미수팬케이크" , 4.5, "에스프레소의 향이 느껴지는 달콤한 팬케이크에 크리미한 크림이 가득 올라간 부드러운 티라미수 팬케이크")

    val cake = listOf(monCher, chocoMouse, tiramisu, cheese, oatmealPancake, tiramisuPancake)

    // 쿠키 & 마카롱
    val creamCheeseYakgwaCookie = Triple("뚱크림치즈약과쿠키" , 2.9, "쿠키 안에 바닐라맛 크림치즈 가득! 달달하고 꾸덕한 약과가 통째로 올라간 쫀득한 쿠키")
    val matchaSmoresCookie = Triple("말차스모어쿠키" , 2.9, "화이트 초코칩이 가득 박힌 말차 쿠키에 달콤하게 구운 마시멜로우를 얹어 달콤쌉싸름한 매력을 간직한 쿠키")
    val macadamiaCookie = Triple("마카다미아쿠키" , 1.8, "고소한 마카다미아를 넣어 만든 메가MGC커피 시그니처 쿠키")
    val chocolateChipCookie = Triple("초콜릿칩쿠키" , 1.8, "진한 초콜릿칩을 넣어 만든 메가MGC커피 시그니처 쿠키")
    val strawberryYogurtMacaron = Triple("딸기요거트마카롱" , 1.8, "딸기요거트 스무디를 연상하게 하는 상큼한 마카롱")
    val megaChocolateMacaron = Triple("메가초코마카롱" , 1.8, "메가커피 시그니처 음료 메가초코를 모티브로 만든 초코맛 마카롱")
    val unicornFrappeMacaron = Triple("유니콘프라페마카롱" , 1.8, "메가커피 인기 음료인 유니콘 프라페를 모티브로 만든 매지컬 비주얼 마카롱")

    val cookieMacaron = listOf(creamCheeseYakgwaCookie, matchaSmoresCookie, macadamiaCookie, chocolateChipCookie, strawberryYogurtMacaron, megaChocolateMacaron, unicornFrappeMacaron)

    val bakery = mapOf(1 to bread, 2 to cake, 3 to cookieMacaron)
    // product -----------------------------------------------------------------------------------------
    // 머그컵
    val mcgMug = Triple("MGC머그" , 6.5, "귀여운 디테일로 소장가치를 더한 대용량 머그")
    val basicMug = Triple("머그" , 5.0, "일상 어디서든 활용하기 좋은 메가MGC커피 대용량 머그컵")

    val mugCup = listOf(mcgMug, basicMug)

    //텀블러
    val mcgTumbler = Triple("MCG텀블러" , 7.0, "뛰어난 보온보냉력으로 하루종일 그대로, MGC 데일리 텀블러")
    val basicTumbler = Triple("텀블러" , 6.5, "기능성과 비주얼을 다잡은 메가MGC커피 텀블러")

    val tumbler = listOf(mcgTumbler, basicTumbler)

    // 스틱커피
    val originalAmericano = Triple("오리지날아메리카노" , 4.9, "예가체프 원두의 레드와인을 연상케 하는 깊은 풍미, 화이트 초콜릿의 고급스런 단 맛에 풍부한 바디감을 더해 밸런스 잡힌 맛을 느낄 수 있는 아메리카노")
    val decafAmericano = Triple("디카페인아메리카노" , 4.9, "물의 삼투압을 이용한 독일 워터 프로세스 방식으로 카페인을 줄이고,브라질 원두 특유의 산미와 달콤함, 바디감은 고스란히 담아 조화로운 맛을 느낄 수 있는 아메리카노")
    val steviaMixCoffee = Triple("스테비아믹스커피" , 5.9, "무지방 우유가 함유된 프리마로 커피 본연의 맛은 배가시키고대체 감미료 스테비아로 당과 칼로리를 낮춰 부담 없이 달콤한 라떼의 맛을 즐길 수 있는 믹스커피")
    val steviaDecafMixCoffee = Triple("스테비아디카페인믹스커피" , 5.9, "무지방 우유가 함유된 프리마로 커피 본연의 맛은 배가시키고 대체 감미료 스테비아로 당과 칼로리는 낮춘 디카페인임에도 밸런스 잡힌 스테비아 디카페인 믹스커피")

    val stickCoffee = listOf(originalAmericano, decafAmericano, steviaMixCoffee, steviaDecafMixCoffee)

    // 티 상품
    val bloomingChamomile = Triple("블루밍캐모마일" , 6.5, "마음의 안정과 여유를 주는 은은하고 향긋한 캐모마일의 꽃향과 싱그러운 레몬그라스, 비타민C가 풍부한 사과를 블렌딩한 디카페인 캐모마일 블렌딩 티")
    val fruityRooibos = Triple("프루티루이보스" , 6.5, "무게감 있으면서도 개운하고 깔끔한 전세계 4% 클래식 등급 루이보스와 비타민C가 풍부한 제주도산 귤피, 전남 고흥산 유자를 블렌딩한 디카페인 루이보스 블렌딩 티")
    val sweetHibiscus = Triple("스위트히비스커스" , 6.5, "상큼한 히비스커스에 비타민C, 비타민E가 풍부한 레몬머틀과 달콤한 패션후르츠향, 천연 감미료 스테비아를 더해 새콤달콤하게 블렌딩한 디카페인 히비스커스 블렌딩 티")

    val teaProduct = listOf(bloomingChamomile, fruityRooibos, sweetHibiscus)

    val product = mapOf(1 to mugCup, 2 to tumbler, 3 to stickCoffee, 4 to teaProduct)

    val menu = mapOf(1 to beverage, 2 to bakery, 3 to product)

    abstract fun displayInfo()
}