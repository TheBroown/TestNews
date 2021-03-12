package com.dmitrystepanishchev.testnews

import android.os.Parcel
import android.os.Parcelable

class News() :Parcelable {
    var date :String=""
    var text: String=""
    var title: String=""

    constructor(parcel: Parcel) : this() {
        date=parcel.readString()?:""
        text = parcel.readString()?:""
        title = parcel.readString()?:""
    }

    constructor(_date: String, _text: String, _title: String) : this() {
        date = _date
        text = _text
        title = _title
    }

    constructor(_date: String, _text: String) : this() {
        date = _date
        text = _text
        title = getTitleFromText(_text)
    }

    fun getTitleFromText(text: String): String {
        var title: String=""

        if(text.length>20){
            val indexOfSpace = text.lastIndexOf(" ", 20)
            if(indexOfSpace==-1){
                title=text.substring(0,17)+"..."
            }
            else{
                title=text.substring(0,indexOfSpace)+"..."
            }
        }
        else{
            title=text
        }

        return title
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(date)
        parcel.writeString(text)
        parcel.writeString(title)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<News> {
        override fun createFromParcel(parcel: Parcel): News {
            return News(parcel)
        }

        override fun newArray(size: Int): Array<News?> {
            return arrayOfNulls(size)
        }
    }
}

