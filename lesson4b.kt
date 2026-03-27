fun main (){
    // addition 
    fun addition(){
        val num1=20
        val num2=60
        val answer=num1+num2
        println("the sum is $answer")
    }
    // call the function 
    addition()
    // subtraction 
    fun subtraction (){
        val num1=100
        val num2=20
        val answer=num1-num2
        println("the difference is $answer")
    }
    // call the function 
    subtraction()
    // multiplication
    fun multiply(){
        val num1=25
        val num2=25
        val answer=num1*num2
        println("the product is $answer")
    }
    // call the function 
    multiply()
    // division
    fun division(){
        val num1=900
        val num2=60
        val answer=num1/num2
        println("the quotient is $answer")
    }
    // call the function 
    division()
    // modulus 
    fun modulus(){
        val num1=100
        val num2=20
        val answer=num1%num2
        println("the modular is $answer")
    }
    // call the function 
    modulus()
    fun bmi(){
        val weight=84
        val height=7.4
        val answer=(weight)/(height*height)
        println("the bmi is $answer")
    }
    //call the function
    bmi()
    fun simpleinterest(){
        val principle=5874652
        val rate=10
        val time=24
        val answer=(principle*rate*time)/100
        println("the simpleinterest is $answer")
    }
    // call the function 
    simpleinterest()
}