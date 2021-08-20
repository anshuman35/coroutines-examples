package channel.example1

import channel.*
import delay.*

// https://tour.golang.org/concurrency/1
 fun cxz(z:Int){
    
   for (i in 1..3){
       println(z)
       
   }
}
suspend fun say(s: String) {
    for (i in 0..4) {
        delay(100)
        println(s)
    }
}

fun main(args: Array<String>) = 
    mainBlocking {
    go { say("world") }
    say("hello")
    go{cxz(2)}
}

