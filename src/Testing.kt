import kotlin.test.*
import org.junit.*

class Testing
{
    @Test
    fun OutOfRangeTest()
    {
        val p1 = Vector3(10.0f, 20.0f, 30.0f)
        assertFails { p1[3] }
    }
}