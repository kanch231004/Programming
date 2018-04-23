import java.util.*
import kotlin.collections.HashMap

val sc = Scanner(System.`in`)

fun main(args : Array<String>) {

    println("Enter size of array")
    val size = sc.nextInt()
    val arr = arrayOfNulls<Int>(size)
    val hashMap = HashMap<Int?,Int>()

    for (i in 0  until size) {
    arr[i] = sc.nextInt()
    }

    for(i in 0 until size) {

        if (!hashMap.containsKey(arr[i]))
            hashMap[arr[i]] = 1
        else
            hashMap[arr[i]] = hashMap[arr[i]]!!+1
    }

    for (i in 0 until size) {

        if (hashMap[arr[i]] == 2)
            println(arr[i])
        break
    }

}

