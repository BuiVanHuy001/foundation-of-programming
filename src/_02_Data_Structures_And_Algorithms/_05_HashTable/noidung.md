# HashTable (Bảng băm)

### HashTable là gì?

HashTable là một cấu trúc dữ liệu đặc biệt dùng để lưu trữ các cặp key-value. Mỗi **key** sẽ được ánh xạ qua *
*HashFunction** thành một **index** trong bảng băm (hay còn gọi là “buckets”). Sau đó, **value** tương ứng sẽ được lưu
trữ tại chỉ mục này.


<img src="../../../src/assets/images/1*3jxEppESh9LLK14YMQ-ocA.png" alt="">

### Collision (Xung đột) trong HashTable

Collision (xung đột) xảy ra khi hai hoặc nhiều **key** khác nhau được ánh xạ tới cùng một **index** trong **buckets**
sau khi tính toán qua **Hash function**. Vấn đề xung đột là điều không thể tránh khỏi trong một HashTable, đặc biệt khi
kích thước **buckets** là hữu hạn và số lượng phần tử tăng lên.

Để giải quyết vấn đề này chúng ta dùng linked list để lưu trữ thêm một tầng nữa các phần tử cho index đó

<img src="../../../src/assets/images/7eac99e4-5b7a-4b7e-aa22-fa2683345af1.png"  alt=""/>

### Ứng dụng của HashTable

1. **Tìm kiếm và Tra cứu Nhanh**: Hashtable rất hiệu quả cho việc tra cứu dữ liệu nhanh chóng

**Ví dụ**

```java
public static void main(String[] args) {
    Hashtable<Integer, User> userTable = new Hashtable<>();
    userTable.put(1, new User(1, "Alice"));
    userTable.put(2, new User(2, "Bob"));

    // Tìm kiếm người dùng theo ID
    User user = userTable.get(1); // Trả về Alice 
}
```

2. **Đếm và Thống Kê**: Hashtable có thể được sử dụng để đếm số lần xuất hiện của các phần tử trong một tập dữ liệu. Ví
   dụ, bạn có thể sử dụng hashtable để đếm số lần mỗi từ xuất hiện trong văn bản.

```java
public static void main(String[] args) {
    Hashtable<String, Integer> wordCount = new Hashtable<>();
    String[] words = {"apple", "banana", "apple", "orange"};

    for (String word : words) {
        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
    }

    // Số lần xuất hiện của từ "apple"
    int count = wordCount.get("apple"); // Trả về 
}
```

### HashSet trong Java

`HashSet` là một tập hợp không có thứ tự và không cho phép các phần tử trùng lặp. Nó implement interface `Set`, nghĩa là
nó chỉ lưu trữ các phần tử duy nhất

**Ví dụ**

```java
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Thêm phần tử trùng lặp
        set.add("Apple"); // Không thêm vì đã tồn tại

        // Duyệt qua các phần tử
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}

```

#### Các method trong HashSet

1. `add(E e)`
    * Thêm phần tử e vào tập hợp nếu phần tử đó chưa tồn tại.
    * Trả về `true` nếu phần tử được thêm thành công, `false` nếu phần tử đã tồn tại.
    ```java
   HashSet<String> set = new HashSet<>();
   set.add("Apple"); // Returns true
   set.add("Apple"); // Returns false
    ```
2. `remove(Object o)`
    * Xóa phần tử o khỏi tập hợp.
    * Trả về `true` nếu phần tử được xóa thành công, `false` nếu phần tử không tồn tại.
   ```java
    set.remove("Apple"); // Returns true
   ```
3. `contains(Object o)`
    * Kiểm tra xem phần tử o có tồn tại trong tập hợp không.
    * Trả về true nếu phần tử tồn tại, false nếu không.
    ```java
   boolean exists = set.contains("Apple"); // Returns false if removed
   ```

### HashMap trong Java

`HashMap` là một cấu trúc dữ liệu lưu trữ cặp khóa-giá trị (key-value). Mỗi khóa phải là duy nhất, và mỗi khóa ánh xạ
đến một giá trị.

**Ví dụ**

```java
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(3, "Charlie");

        // Truy xuất giá trị bằng khóa
        String name = map.get(2); // Trả về "Bob"
        System.out.println("Name with ID 2: " + name);

        // Xóa một mục
        map.remove(3);

        // Duyệt qua các cặp khóa-giá trị
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
```

#### Các method trong Java

1. `put(K key, V value)`
    * Thêm cặp khóa-giá trị vào bản đồ hoặc cập nhật giá trị của khóa nếu nó đã tồn tại.
    * Trả về giá trị cũ gắn với khóa nếu có, hoặc null nếu không có giá trị nào trước đó.
   ```java
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "Alice"); // Returns null
   ```
2. `get(Object key)`
    * Trả về giá trị gắn với khóa key.
    * Trả về null nếu khóa không tồn tại.
    ```java
   String value = map.get(1); // Returns "Alice"
   ```

3. `remove(Object key)`
    * Xóa cặp khóa-giá trị gắn với khóa key.
    * Trả về giá trị đã bị xóa nếu khóa tồn tại, null nếu không.
    ```java
        String removedValue = map.remove(1); // Returns "Alice"
   ```
4. `containsKey(Object key)`
    * Kiểm tra xem bản đồ có chứa khóa key không.
    * Trả về true nếu có, false nếu không.
   ```java
   boolean contains = map.containsKey(1); // Returns true 
   ```
5. `containsValue(Object value)`
    * Kiểm tra xem bản đồ có chứa giá trị value không.
    * Trả về true nếu có, false nếu không.
   ```java
   boolean contains = map.containsValue("Alice"); // Returns true 
   ```
