fun <T> MutableList<T>.Swap(index1: Int, index2: Int)
{
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}