


fun main(args : Array<String>) {

    print("Enter size of an array")
    val size = sc.nextInt()
    val arr = arrayOfNulls<Int>(size)
    val hashMap = HashMap<Int?,Int>()
    var minimumkey = 0

    for (i in 0  until size) {
        arr[i] = sc.nextInt()
    }

    for(i in 0 until size) {

        if (!hashMap.containsKey(arr[i]))
            hashMap[arr[i]] = 1
        else
            hashMap[arr[i]] = hashMap[arr[i]]!!+1
    }

    for (i in 0 until hashMap.size) {

        minimumkey = hashMap[arr[i]]!!

        if (hashMap[arr[i]]!! < minimumkey )
            minimumkey = hashMap[arr[i]]!!
    }

    println(minimumkey)

}