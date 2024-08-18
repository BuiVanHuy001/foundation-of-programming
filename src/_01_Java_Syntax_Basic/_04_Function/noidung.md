# Hàm (Function)

### Hàm Là Gì?

Hàm (function) là một khối mã lệnh được nhóm lại với nhau để thực hiện một nhiệm vụ cụ thể. Hàm giúp cho mã lệnh dễ đọc, dễ bảo trì, và tái sử dụng. Trong Java, hàm thường được gọi là phương thức (method).

### Khi Nào Nên Dùng Hàm?

- **Tái Sử Dụng Mã**: Hàm có thể được gọi nhiều lần ở nhiều nơi khác nhau trong chương trình.
- **Dễ Bảo Trì**: Khi cần sửa đổi hoặc nâng cấp, chỉ cần thay đổi mã lệnh trong hàm.
- **Phân Tách Chức Năng**: Giúp chia chương trình lớn thành các phần nhỏ hơn, dễ quản lý.
- **Dễ Đọc**: Tăng tính rõ ràng và dễ hiểu của mã lệnh.

## Cú Pháp Cơ Bản

### Khai Báo Hàm

```java
public static void tenHam() {
    // Khối lệnh của hàm
}
```

**Giải Thích**
- **public**: Định nghĩa phạm vi truy cập của hàm.
- **static**: Hàm này thuộc lớp chứ không thuộc đối tượng.
- **void**: Kiểu trả về của hàm, ở đây là không trả về giá trị nào.
- **tenHam**: Tên của hàm.

### Hàm Có Tham Số (Parameters)

#### Khai Báo Hàm Trả Về Giá Trị

```java
public static void functionName(<datatype> param1, <datatype> param2) {
    // Khối lệnh của hàm
}
```

**Giải Thích**
* param1 và param2 là hai tham số của hàm
* <datatype> định nghĩa kiểu dữ liệu của hàm

**Ví dụ**
```java
public static void greet(String name) {
    System.out.println("Hello, " + name + "!");
}

public static void main(String[] args) {
    greet("Alice"); // Gọi hàm greet với đối số (argument) "Alice"
}
```

### Function overloading

Function overloading là khi cùng một `Class` có thể có nhiều hàm có tên giống nhau nhưng khác nhau về số lượng hoặc kiểu dữ liệu của tham số

**Ví dụ**
```java
public static int multiply(int a, int b) {
    return a * b;
}

public static double multiply(double a, double b) {
    return a * b;
}

public static void main(String[] args) {
    int result1 = multiply(2, 3); // Gọi hàm multiply(int, int)
    double result2 = multiply(2.5, 3.5); // Gọi hàm multiply(double, double)
    System.out.println("Kết quả 1: " + result1);
    System.out.println("Kết quả 2: " + result2);
}
```

### Tổng kết
- **Hàm (Function)**: Là một khối mã lệnh thực hiện một nhiệm vụ cụ thể.
- **Lợi Ích**: Tái sử dụng mã, dễ bảo trì, phân tách chức năng, dễ đọc.
- **Cú Pháp**: public static void tenHam() { /* Khối lệnh */ }
- **Hàm Với Tham Số**: Cho phép truyền dữ liệu vào hàm.
- **Function overloading**: Cho phép nhiều hàm cùng tên nhưng khác nhau về tham số.