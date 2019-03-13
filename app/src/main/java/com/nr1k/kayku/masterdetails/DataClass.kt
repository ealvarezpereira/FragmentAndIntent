package com.nr1k.kayku.masterdetails

data class DataClass(val id: String, val titulo: String, val contenido: String) {
    override fun toString(): String = "ID: "+id+" "+titulo
}