package com.example.mgckiosk.action


open class Basket() {
    val balance = 10
    var dataList = mutableListOf<MutableMap<String, MutableList<Double>>>() //
    fun saveData(
        list: List<Triple<String, Double, String>>,
        menu: Int,
        unit: Int
    ) { // list, index, unit
        var menuName = list[menu].first
        var singlePrice = list[menu].second
        var menuUnit = unit
        // var data = listOf(menuName: String, menuUnit: Int, menuPrice: Double)
        if (dataList != emptyList<MutableMap<String, MutableList<Double>>>()) {

            for (i in dataList.indices) {
                var subDataList = dataList[i][menuName]
                subDataList?.set(0, subDataList.get(0) + menuUnit)
                subDataList?.set(1, subDataList.get(0) * singlePrice)
            }
        } else {
            var subData = mutableListOf(menuUnit.toDouble(), singlePrice * menuUnit)
            var data = mutableMapOf(menuName to subData)
            dataList.add(data)
        }
    }

    fun checkBalance() {
        var totalPrice:Double = 0.0
        for (i in dataList.indices) {
            var subDataList = dataList[i].values
            var unitPriceList = subDataList.take(0)[0][1]
            totalPrice += unitPriceList
        }
        if (totalPrice > balance) {
            println("현재 잔액은 ${(balance*1000).toInt()}원 으로 ${(totalPrice-balance)*1000.toInt()}원이 부족해서 주문할 수 없습니다.")
        } else {

        }
    }

}
