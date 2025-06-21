# Exercise 3 – E-commerce Platform Search Function

## ✅ Objective
Implement linear and binary search algorithms for finding products on an e-commerce platform and compare their performance.

## 📘 Description
This Java project defines a `Product` class with fields like `productId`, `productName`, and `category`.  
It demonstrates:
- Linear search (unsorted array)
- Binary search (sorted array)
- Searching by ID and by name

## 📂 Files
- `Product.java` – Model class for products
- `LinearSearch.java` – Performs linear search
- `BinarySearch.java` – Performs binary search
- `ProductSearchUtils.java` – Utility for displaying products
- `Main.java` – Executes the search operations and shows results
- `output.png` – Screenshot showing search results

## 🖥️ Sample Output

## 📊 Time Complexity
- **Linear Search**: O(n)
- **Binary Search**: O(log n) – requires sorted input

## 🚀 Optimization
- Use **binary search** when the product list is sorted for better performance.
- For faster lookups on large datasets, consider:
  - Using a **HashMap** (for O(1) average case)
  - Implementing **Trie structures** for prefix-based searches
- Minimize repeated sorting by storing pre-sorted lists if frequent searches are expected.
