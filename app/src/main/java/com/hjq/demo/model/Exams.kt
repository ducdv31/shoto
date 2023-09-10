package com.hjq.demo.model

class Exams {
    var number = 0
    var time = ""
    var content = ""
    var note = ""

    constructor(number: Int, time: String, content: String, note: String) {
        this.number = number
        this.time = time
        this.content = content
        this.note = note
    }
}