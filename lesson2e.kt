fun main() {
    // when statements 
    val marks=155
    when (marks){
        in 0..30->println("you failed")
        in 31..50->println("below average")
        in 51..70->println("above average")
        in 71..100->println("excellent")
        else->println ("invalid marks")
    }
}