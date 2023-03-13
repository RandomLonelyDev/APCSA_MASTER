package APCSA.TwoDArrays

import personal_tests.libs.MathExtended.*
import kotlin.math.*

fun main() {
    val a = Methods.getArray(2,3)
    for(arr in a) {
        for (v in arr) print("$v ")
        println()
    }

    println(Methods.diff(a))
    println(Methods.oddTrues(a))
    println(Methods.valsInCol(a, 1, true))
    println(Methods.diffTFInCols(a))
}

object Methods {
    fun getArray(rows: Int, cols: Int): Array<Array<Boolean>> { return Array(rows) { return@Array Array(cols) { randomBoolean() } } }
    fun diff(arr: Array<Array<Boolean>>): Int {
        var fCount = 0; var tCount = 0
        for(r in arr) for(v in r) if(v) tCount++ else fCount++
        return abs(tCount - fCount)
    }

    fun oddTrues(tdarr: Array<Array<Boolean>>): Boolean {
        var trues = 0
        for(arr in tdarr) for(v in arr) if(v) trues++
        return (trues % 2) ==1
    }

    fun <T> valsInCol(tdarr: Array<Array<T>>, col: Int = 0, key: T): Int {
        var out = 0
        for (arr in tdarr) if (arr[col] == key) out++
        return out
    }

    fun diffTFInCols(tdarr: Array<Array<Boolean>>): Int {
        val colCts = ArrayList<Int>(); var ct = 0
        for(i in tdarr[0].indices) {
            for(arr in tdarr) ct += if(arr[i]) 1 else -1
            colCts.add(abs(ct))
        };
        colCts.sortDescending()
        return colCts[0]
    }

    fun randArray(rows: Int, cols: Int, maxValInc: Number): Array<Array<Number>> { return Array(rows) { return@Array Array(cols) { randomDouble(1.0, maxValInc.toDouble()) } } }
}