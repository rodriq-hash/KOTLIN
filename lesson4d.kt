fun main (){
    // addition
    fun addition(num1:Int,num2:Int){
        val answer=num1+num2
        println("the sum is $answer")
    }
    // call the function
    addition(40,60)
    fun subtraction(num1:Int,num2:Int){
        val answer=num1-num2
        println("the difference is $answer")
    }
    // call the function
    subtraction(100,870)
    fun multiply(num1:Int,num2:Int){
        val answer=num1*num2
        println("the product is $answer")
    }
    // call the function
    multiply(100,870)
    // write a function with parameter to check if number is odd even 
    fun number(number:Int){
        if(number%2==0){
            println("even number")
        }
        else {
            println("odd number")
        }
    }
    // call the function 
    number(38)
}