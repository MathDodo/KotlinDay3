fun <T> MutableList<T>.Middle() : T?
{
    if(this.count() == 0) return null

    if(this.count() % 2 == 0)
    {
        return this[this.count() / 2 - 1]
    }
    else
    {
        return this[Math.ceil(this.count() / 2.0).toInt() - 1]
    }
}