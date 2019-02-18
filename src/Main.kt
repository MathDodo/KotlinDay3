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

    var c = ValutaConverter()
    var euro = c::KronerToEuro
    var dollar = c::KronerToDollar
    var pound = c::KronerToPound

    c.OutputConversion(euro, 746.12)
    c.OutputConversion(dollar, 662.63)
    c.OutputConversion(pound, 848.46)

    var list = mutableListOf(1,3,2, 5,6,7,1,2,4,50,67,8,9,0,5,1,3, 55,552, 12)

    println("Middle: " + list.Middle().toString())

    var translator = Translator()

    val danishToEnglishDictionary: HashMap<String, String> = hashMapOf("hej" to "hello", "farvel" to "good bye", "Hej verden!" to "Hello world")
    val englishToDanishDictionary = danishToEnglishDictionary.entries.associateBy ({it.value}) {it.key}

    val dted : (String) -> String = {danishToEnglishDictionary[it].toString()}
    val etdd : (String) -> String = {englishToDanishDictionary[it].toString()}

    translator.TranslateOutput(dted, "Hej verden!")
}


