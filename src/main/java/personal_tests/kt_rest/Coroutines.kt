package personal_tests.kt_rest

import kotlinx.coroutines.*

var doneOnIO = Pair(false, "")

@OptIn(DelicateCoroutinesApi::class)
fun main() {
    var data = ""
    var doneOnMain = Pair(false, "")

    /**
     * Dispahers:
     * Main - UI ops
     * IO - Networking/filesystem
     * Default - Large calculations
     * Unconfined - No clue?? seems to have required purpose rn
     * */


    val c = GlobalScope.launch(Dispatchers.IO) {
        data += "${networkCall()} " //sim network call
        withContext(Dispatchers.Main) {
            doneOnMain = Pair(true, Thread.currentThread().name)
        } //switch to main thread for ui call
    }

    while(c.isActive){}
    println(doneOnIO)
    println(doneOnMain)
}

/**
 * Suspend funcs are only callable from coroutines or suspend functions.  method delay(millis: Long) can delay coroutine.  Suspend functions are blocking.
 * */
suspend fun networkCall(): String {
    delay(3000L)
    doneOnIO = Pair(true, Thread.currentThread().name)
    return "db data"
}