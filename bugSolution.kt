fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5, 6)
    val evenNumbers = mutableListOf<Int>()
    list.forEach { 
        if (it % 2 == 0) {
            evenNumbers.add(it)
        }
    }
    list.removeAll(evenNumbers)
    println(list) // Output: [1, 3, 5]
}
This solution iterates through the list first to collect even numbers. Then it removes all even numbers at once avoiding the index shifting issue.  Alternatively you can use list.filter { it % 2 !=0}.toMutableList() to create a new list containing only odd numbers.