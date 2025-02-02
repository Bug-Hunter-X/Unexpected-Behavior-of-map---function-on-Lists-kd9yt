fun main() {
    val mutableList = mutableListOf(1, 2, 3, 4, 5)

    // Method 1: Using mapIndexedTo()
    mutableList.mapIndexedTo(mutableList) { index, value -> value * 2 }
    println(mutableList) // Output: [2, 4, 6, 8, 10]

    // Method 2: Using forEachIndexed
    val anotherMutableList = mutableListOf(1,2,3,4,5)
    anotherMutableList.forEachIndexed { index, value -> anotherMutableList[index] = value * 2 }
    println(anotherMutableList) // Output: [2, 4, 6, 8, 10]

    //Method 3: Creating a new list
    val list = listOf(1, 2, 3, 4, 5)
    val newList = list.map { it * 2 }
    println(list) //Output: [1, 2, 3, 4, 5]
    println(newList) //Output: [2, 4, 6, 8, 10]
}