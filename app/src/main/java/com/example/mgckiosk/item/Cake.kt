package com.example.mgckiosk.item
import com.example.mgckiosk.abs.Item

class Cake : Item() {
    override fun item() {
        println("케이크 리스트")
    }
}