package com.meoru.kotlinstudy04

class Student(var name:String?){
    var job:String? = ""
    var strength:Int = 0
    var agility:Int = 0
    var health:Int = 0
    var intelligence:Int = 0
    var luck:Int = 0

    init {
        this.name = name
    }

    fun set(job:String, str:Int, agi:Int, heal:Int, int:Int, luck:Int) {
        this.job = job
        this.strength = str
        this.agility = agi
        this.health = heal
        this.intelligence = int
        this.luck = luck
    }
}