package com.example.mgckiosk.action

import com.example.mgckiosk.obj.OrderList
import com.example.mgckiosk.obj.OrderList.dataList

// OrderList.orderList.add(menuItem)
open class Basket() {
    fun saveData(
        list: List<Triple<String, Double, String>>,
        menu: Int,
        unit: Int
    ) { // list, index, unit
        var menuName = list[menu].first
        var singlePrice = list[menu].second
        var menuUnit = unit
        // var data = listOf(menuName: String, menuUnit: Int, menuPrice: Double)

        if (dataList == emptyList<MutableMap<String, MutableList<Double>>>()) {
            dataList.add(mutableMapOf("Menu" to mutableListOf(0.0, 0.0)))
        }

        if (dataList[0].keys.contains(menuName)) {
            var subList = dataList[0][menuName]?.toMutableList()
            subList!!.set(0, subList!!.get(0) + menuUnit)
            subList!!.set(1, subList!!.get(0) * singlePrice)
            dataList[0].put(menuName, subList)
        } else {
            dataList[0].put(menuName, mutableListOf(unit.toDouble(), singlePrice*unit))
        }

        println("[ 저장된 데이터 목록 ]")
        var keyList = OrderList.dataList[0].keys.toMutableList()
        for (i in 1 until keyList.size) {
            var subList = OrderList.dataList[0][keyList[i]]
            println("${i}. 메뉴: ${keyList[i]}, 수량: ${subList?.get(0)}, 이 제품 총 가격: ${subList?.get(1)}")
        }
        for (i in 1 until OrderList.dataList.size) {
            var keyList = OrderList.dataList[0].keys.toMutableList()
            for (j in 1 until keyList.size) {
                var valueList = OrderList.dataList[0][keyList[j]]
                println("${i}. 제품 이룸: ${keyList[j]}, 수량: ${valueList?.get(0)?.toInt()}, 이 제품 총 가격: ${valueList?.get(1)}")
            }
        }
    }



}
