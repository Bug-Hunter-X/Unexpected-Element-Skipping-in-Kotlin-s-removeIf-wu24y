# Kotlin removeIf Bug
This repository demonstrates a subtle bug that can occur when using the `removeIf` function in Kotlin with mutable lists.  The issue stems from modifying the list while iterating through it, leading to unexpected element skipping.

The `bug.kt` file contains code that showcases this problem. The `bugSolution.kt` file demonstrates a corrected approach.

This example highlights the importance of careful consideration when modifying collections while iterating.