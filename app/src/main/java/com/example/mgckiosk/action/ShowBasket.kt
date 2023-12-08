package com.example.mgckiosk.action

import com.example.mgckiosk.abs.AbstractMenu
import com.example.mgckiosk.exception.IllegalArgumentException
import com.example.mgckiosk.menu1.Main
import com.example.mgckiosk.obj.OrderList

class ShowBasket(override var category: Int) : AbstractMenu() {
    override fun displayInfo() {
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
                println("${i}. 제품 이룸: ${keyList[j]}, 수량: ${valueList?.get(0)?.toInt()}, 이 제품 총 가격: ${valueList?.get(1)
                    ?.times(1000)}원")
            }
        }

    }
}