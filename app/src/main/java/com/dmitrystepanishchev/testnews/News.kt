package com.dmitrystepanishchev.testnews

import java.util.*

class News {
    var date: Date
    var text: String
    var title: String

    constructor(_date: Date, _text: String, _title: String) {
        date = _date
        text = _text
        title = _title
    }

    constructor(_date: Date, _text: String) {
        date = _date
        text = _text
        title = getTitleFromText(_text)
    }
    
    fun getTitleFromText(text: String): String {
        var title: String = ""
        return title
    }
}

