package com.example.mgckiosk

import com.example.mgckiosk.selection.Main
import com.example.mgckiosk.exception.IllegalArgumentException

fun main() {
    println("3조 파이팅")

    println("[ 홈페이지 ]")
    println("[ 0. 메뉴 선택 ]")

    IllegalArgumentException(0).selectNumber() // 메인 화면으로 이동

    Main(0).category()        // 카테고리 화면으로 이동


}


