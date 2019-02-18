fun main(args: Array<String>)
{
    //val multiply = ::Multiply
    //println(multiply(4,5))

    var p1 = Vector3(10.0f, 20.0f, 30.0f)
    var p2 = Vector3(5.0f, 8.0f, 10.0f)
    println("p1 = $p1")
    println("p2 = $p2")
    println("p1 + p2 = " + (p1 + p2))  //will be (15,28)
    println("p1 - p2 = " + (p1 - p2))   //will be (5,12)
    println("p1++ = " + (++p1))
    println("p1-- = " + (--p1))
    println(p1[0])
    println(p1[1])
    println(p1[2])
    p1[0] = 7.5f
    p1[1] = 6.0f
    p1[2] = 1.0f
    println("p1 = $p1")
}

fun Multiply(x: Int, y: Int) : Int
{
    return  x * y
}