class Translator
{
    fun TranslateOutput(translateFunc : (String)->String, key : String)
    {
        val result = translateFunc(key)
        println("Translation result: $result")
    }}