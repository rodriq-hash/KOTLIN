fun main() {
    // student marks scenario
// 0-30 you failed 
// 31-50 below average 
// 51-70 above average  
// 71-100 excellent 
val marks = 560
if(marks>=0 && marks<=30){
    println("you failed")
}
else if(marks>=31 && marks<=50){
    println("below average")
}
else if (marks >=51 && marks<=70){
    println("above average")
}
else if (marks >=71 && marks<=100){
    println("excellent")
}
else {
    println("invalid marks")
}
}