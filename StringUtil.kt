package com.vikrant.screeningdemo

class StringUtil {
    fun filterInputString(input: String?) = input?.firstOrNull { c -> c in RANGE } != null

    companion object {
        private val RANGE = 'A'..'Z'
    }
}
