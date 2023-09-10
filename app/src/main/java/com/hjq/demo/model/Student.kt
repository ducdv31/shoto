package com.hjq.demo.model

class Student {
    var number = 0
    var name = ""
    var birthday = ""
    var exams = ""
    var code = ""
    var maDk = ""
    var time = ""
    var timeStart = ""
    var timeEnd = ""
    var totalPoint = 0

    constructor(
        number: Int,
        name: String,
        birthday: String,
        exams: String,
        code: String,
        maDk: String,
        time: String,
        timeStart: String,
        timeEnd: String,
        totalPoint: Int
    ) {
        this.number = number
        this.name = name
        this.birthday = birthday
        this.exams = exams
        this.code = code
        this.maDk = maDk
        this.time = time
        this.timeStart = timeStart
        this.timeEnd = timeEnd
        this.totalPoint = totalPoint
    }
}