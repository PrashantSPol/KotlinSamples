package _3_control

import java.io.InputStream
import java.util.stream.BaseStream

/**
 * Created by prashantspol on 11/9/2017.
 */
fun check() {
    try {
        5/0;
    } catch (e : Exception) {

    } finally {

    }
}

// provide @Throws annotation if kotlin class will be called from Java class
fun checkedException(stream: InputStream) {
    stream.close()
}