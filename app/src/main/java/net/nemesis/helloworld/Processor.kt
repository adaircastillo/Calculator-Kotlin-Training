package net.nemesis.helloworld




class Processor(var firstOperand: Int, var secondOperand: Int) {

    fun performOperation(operation: String): Int {
        return when(operation){
            "+" -> firstOperand + secondOperand
            "-" -> firstOperand - secondOperand
            "x" -> firstOperand * secondOperand
            "/" -> firstOperand / secondOperand
            else -> 0
        }
    }

}