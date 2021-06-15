package com.vikrant.screeningdemo

class StringUtil {
    fun filterInputString(input: String?) = input?.firstOrNull { c -> c in 'A'..'Z' } != null
}
