package com.hjq.demo.model

class ExamsData {
    var number = 0
    var time = ""
    var session = ""
    var exams = ""
    var name = ""
    var birthday = ""
    var code = ""
    var timeStart = ""
    var timeEnd = ""
    var totalPoint = 0

    constructor(
        number: Int,
        time: String,
        session: String,
        exams: String,
        name: String,
        birthday: String,
        code: String,
        timeStart: String,
        timeEnd: String,
        totalPoint: Int
    ) {
        this.number = number
        this.time = time
        this.session = session
        this.exams = exams
        this.name = name
        this.birthday = birthday
        this.code = code
        this.timeStart = timeStart
        this.timeEnd = timeEnd
        this.totalPoint = totalPoint
    }
}