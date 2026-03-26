fun main() {
    // for loop 
    // example 1 
    for (count in 1..10){
        println("the counter is $count")
    }
    // example 2 
    // loop from 200 to 400 
    for(count in 200..400){
        println("the counter is $count")
    }
    // example 3 
    // create a for loop to print years from 200 to 2025 
    for (count in 2000..2025){
        println("the years are $count")
    }
    // print from 100 to 1 
    for(count in 100 downTo 0){
        println(count)
    }
    // lop all election years 
    for(count in 1967..2023 step 5){
        println(count)
    }
}