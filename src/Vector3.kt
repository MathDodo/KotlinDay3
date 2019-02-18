import java.lang.IndexOutOfBoundsException

data class Vector3(var X: Float, var Y: Float, var Z: Float)
{
    operator fun plus(v: Vector3) : Vector3
    {
        return Vector3(X + v.X, Y + v.Y, Z + v.Z)
    }

    operator fun minus (v: Vector3) : Vector3
    {
        return Vector3(X - v.X, Y - v.Y, Z - v.Z)
    }

    operator fun get(index: Int) : Float
    {
        when(index)
        {
            0 -> return X
            1 -> return  Y
            2 -> return Z
            else ->
            {
                throw IndexOutOfBoundsException()
            }
        }
    }

    operator fun set(index: Int, value: Float)
    {
        when(index)
        {
            0 ->  X = value
            1 ->  Y = value
            2 -> Z = value
            else ->
            {
                throw IndexOutOfBoundsException()
            }
        }
    }

    operator fun inc() : Vector3
    {
        X++
        Y++
        Z++

        return this
    }

    operator fun dec() : Vector3
    {
        X--
        Y--
        Z--

        return this
    }
}