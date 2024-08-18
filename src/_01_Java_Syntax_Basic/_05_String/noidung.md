# Chuỗi Ký Tự (String)

## Giới thiệu về String

Trong Java, `String` là một lớp đặc biệt, được sử dụng để đại diện cho các chuỗi ký tự. Ví dụ như "Hello world", "Nguyễn Văn A", ...

## Các phương thức cơ bản của String

#### Khởi tại String
```java
//Khởi tại String bằng dấu ngoặc kép
String str1 = "Hello, World!";

// Khởi tạo String bằng từ khóa 'new'
String str2 = new String("Hello, World!");
```

### Phương thức `length()`
Phương thức `length()` trả về độ dài của string.
```java
int length = str.length();
```

### Phương thức `charAt(int index)`
Phương thức `charAt(int index)` trả về ký tự tại vị trí index trong chuỗi.

```java
String str = "Hello, World!";
char ch = str.charAt(0); // Kết quả: 'H'
```

### Phương thức `substring(int beginIndex, int endIndex)`
Phương thức `substring(int beginIndex, int endIndex)` trả về một chuỗi con từ `beginIndex` tới `endIndex`.

```java
String str = "Hello, World!";
String subStr = str.substring(0, 5); // Kết quả: "Hello"
```

### Phương thức `toUpperCase()` và `toLowerCase()`
Phương thức `toUpperCase()` chuyển đổi tất cả các ký tự trong chuỗi thành chữ in hoa, và `toLowerCase()` chuyển đổi thành chữ thường.

```java
String str = "Hello, World!";
String upperStr = str.toUpperCase(); // Kết quả: "HELLO, WORLD!"
String lowerStr = str.toLowerCase(); // Kết quả: "hello, world!"
```

### Phương thức `trim()`

Phương thức `trim()` loại bỏ các khoảng trắng ở đầu và cuối chuỗi.

### Phương thức `contains()`
Phương thức `contains(CharSequence s)` kiểm tra xem chuỗi có chứa chuỗi con s hay không.

```java
boolean containsHello = str.contains("Hello"); // Kết quả: true
```

### Phương thức `equals()` và `equalsIgnoreCase()`
Phương thức `equals(Object obj)` kiểm tra xem hai chuỗi có bằng nhau hay không. `equalsIgnoreCase()` bỏ qua sự khác biệt về chữ hoa/chữ thường.

```java
String str3 = "HELLO, WORLD!";
boolean isEqual = str.equals(str3); // Kết quả: false
boolean isEqualIgnoreCase = str.equalsIgnoreCase(str3); // Kết quả: true
```

### StringBuilder
`StringBuilder` là một lớp trong Java được sử dụng để tạo và thao tác với chuỗi có thể thay đổi (mutable). Khác với `String`, `StringBuilder` cho phép bạn thay đổi nội dung mà không tạo ra các đối tượng mới, giúp cải thiện hiệu suất khi thực hiện nhiều thao tác nối chuỗi.


```java
StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.append(", World!");
String result = sb.toString();// Kết quả: Hello World!

sb.insert(6, "Java ");// Kết quả: Hello Java World!

sb.delete(6, 11);//Kết quả: Hello World!
```

Ưu điểm của `StringBuilder`
    
 * **Mutable** Bạn có thể thay đổi nội dung của StringBuilder mà không cần tạo ra đối tượng mới.
 * **Hiệu suất cao** khi thao tác trên chuỗi như (thêm, xóa, sửa). `StringBuilder` sẽ nhanh hơn `String` do không tạo ra các đối tượng mới


### String Pool

String Pool (hay còn gọi là String Intern Pool) là một khu vực đặc biệt trong bộ nhớ heap của Java nơi các đối tượng String được lưu trữ. Khi bạn tạo một chuỗi bằng cách sử dụng dấu nháy kép (""), Java sẽ kiểm tra xem chuỗi đó đã tồn tại trong String Pool chưa. Nếu đã tồn tại, Java sẽ sử dụng đối tượng String đã có, thay vì tạo ra một đối tượng mới. Điều này giúp tiết kiệm bộ nhớ và cải thiện hiệu suất.

#### `==`, `equal()` và `compareTo()`
So sánh bằng == kiểm tra xem hai đối tượng có cùng tham chiếu hay không.

Phương thức equals() kiểm tra xem hai chuỗi có cùng nội dung hay không.

```java
String str = "Hello, World!";
String str1 = "Hello, World!";
String str2 = new String("Hello, World!");
str == str1;// Kết quả: true
str == str2;// Kết quả: false
str1 == str2;// Kết quả: false
str.equals(str1);// Kết quả: true
str.equals(str2);// Kết quả: true
str1.equals(str2);// Kết quả: true
```