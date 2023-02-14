fun main (){
    name("Ada")
    var u =("hello cynthia")
    println(u)

    var r =remainder(55,2)
    println(r)
    var s =sum(2,2,2,2)
    println(s)
    var f =("i am happy")
    println(f)


}
fun name(name:String){
    println("hello " + name)

}
fun greetings(name:String):String{
    return("greetings")

}
fun remainder(num1:Int,num2:Int):Int {
    var remainder = num1 % num2
    return remainder
 }
fun sum(num3:Int,num4:Int,num5:Int,num6:Int):Int {
    var sum = num3 + num4 + num5 + num6
    return sum
}
fun funfact(fact:String):String{
    return fact

}