package com.example.mgckiosk.action

import com.example.mgckiosk.abs.AbstractMenu
import com.example.mgckiosk.exception.IllegalArgumentException
import com.example.mgckiosk.menu1.Main
import com.example.mgckiosk.obj.OrderList.dataList

class ProceedToCheckOut {
    fun checkBalance(className: AbstractMenu) {

        println("고객님의 잔고를 입력해 주세요.")
        var balance = IllegalArgumentException(1000000).selectNumber()

        var totalPrice: Double = 0.0
        var subDataList = dataList[0].values.toMutableList()
        for (i in 1 until subDataList.size) {
            totalPrice += subDataList.get(i).get(1)
        }

        if (totalPrice*1000 > balance) {
            println("현재 잔액은 ${(balance).toInt()}원 으로 ${(totalPrice*1000 - balance).toInt()}원이 부족해서 주문할 수 없습니다.")
            println("1. 뒤로가기 0. 종료")
            var num = IllegalArgumentException(0).selectNumber()
            when (num) {
                0 -> println("프로그램을 종료합니다.")
            }

        } else {
            println("결제 하시겠습니까?")
            println("1. 네 2. 뒤로가기 3. 주문 취소 0. 종료")
            var yesOrNo = IllegalArgumentException(3).selectNumber()
            when (yesOrNo) {
                1 -> {
                    println("결제가 완료되었습니다.")
                    Main(0).displayInfo()
                }
                2 -> {
                    className.displayInfo()
                }
                3 -> Main(0).displayInfo()
                0 -> println("프로그램을 종료합니다.")
            }

        }
    }
}