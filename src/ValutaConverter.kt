class ValutaConverter()
{
    fun OutputConversion(convertFunc : (Double) -> Double, value: Double)
    {
        val result = convertFunc(value)
        println("Result of conversion is $result")
    }

    fun KronerToDollar(kroner: Double) : Double
    {
        return kroner / 6.6263
    }

    fun KronerToPound(kroner: Double) : Double
    {
        return kroner / 8.4846
    }

    fun KronerToEuro(kroner: Double) : Double
    {
        return kroner / 7.4612
    }
}