### 1. Map

The `Map` interface is a general interface that defines the common methods and behaviors for a collection of key-value pairs. It doesn't specify a specific implementation, but rather provides a blueprint for how map-like data structures should behave.

### 1.1. HashMap

- **Underlying Data Structure**: `HashMap` is typically implemented using a hash table. It uses hashing to quickly store and retrieve key-value pairs.
- **Key Characteristics**:
    - Keys are not ordered.
    - Keys must be unique.
- **Use Cases**:
    - Great for scenarios where fast retrieval of values based on keys is crucial.
    - When order of insertion doesn't matter.

### 1.2. LinkedHashMap

- **Underlying Data Structure**: `LinkedHashMap` is often implemented as a combination of a hash table and a linked list. It maintains the insertion order of the elements.
- **Key Characteristics**:
    - Maintains insertion order.
    - Keys must be unique.
- **Use Cases**:
    - When you need both the benefits of a hash map and the ability to preserve the order of insertion.
    - Useful for maintaining a predictable iteration order.

### 1.3. TreeMap

- **Underlying Data Structure**: `TreeMap` is implemented as a red-black tree or a similar balanced binary search tree structure.
- **Key Characteristics**:
    - Keys are sorted in natural order or according to a specified comparator.
    - Keys must be unique.
- **Use Cases**:
    - When you need key-value pairs sorted in a particular order (e.g., lexicographical or custom order).
    - Useful for scenarios where range queries or iteration over a range of keys is important.

In summary:

- Use `HashMap` for fast retrieval based on keys and when insertion order is not critical.
- Use `LinkedHashMap` when maintaining insertion order is important.
- Use `TreeMap` when you need key-value pairs sorted according to a specific order.
