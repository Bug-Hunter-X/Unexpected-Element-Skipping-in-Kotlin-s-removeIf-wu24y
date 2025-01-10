fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list)
}
This code will remove even numbers from the list. However, if you try to modify the list while iterating through it using removeIf, it can lead to unexpected behavior and potentially miss some elements. For example, if the list was [1, 2, 3, 4, 5, 6], removing 2 would shift the other elements, and the next iteration would skip 4, leading to [1, 3, 5, 6] instead of [1, 3, 5].