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
/**
 * 요구사항:
 *
 * [ 필요한 기능 ]
 *
 * [ 요구사항 1 ] : 홈 화면
 * : 메뉴 선택 시 카테고리 화면으로 이동
 * : 잘못된 번호 선택 시 예외처리
 *
 * [ 요구사항 2 ] : 메인 카테고리 화면
 * : 음료/베이커리/MD상품 카테고리 선택시 상세 카테고리 화면으로 이동
 * : 뒤로가기를 위한 번호 정의
 * : 프로그램 종료를 위한 번호 정의
 *
 * [ 요구사항 3 ] : 상세 카테고리 화면 (SubCategory)
 * : 커피 & 티 카테고리 선택 시 핫 & 아이스 선택 후 상세 메뉴 화면으로 이동
 * : 에이드/주스 & 디저트 카테고리 선택 후 상세 메뉴 화면으로 이동
 * : 뒤로가기를 위한 번호 정의
 * : 프로그램 종료를 위한 번호 정의
 *
 * [ 요구 사항 4 ] : 상세메뉴 화면
 * : 메뉴 리스트 출력
 * : 뒤로가기를 위한 번호 정의
 * : 프로그램 종료를 위한 번호 정의
 */

