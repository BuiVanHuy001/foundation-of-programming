# Vòng Lặp (Loop)

### Vòng Lặp Là Gì?

Vòng lặp là một cấu trúc điều khiển trong lập trình cho phép thực thi một đoạn mã nhiều lần dựa trên một điều kiện nào đó. Vòng lặp rất hữu ích khi cần thực hiện một công việc lặp đi lặp lại, giảm bớt việc phải viết lại mã nhiều lần.

### Khi Nào Thì Nên Dùng Vòng Lặp?

- Khi cần lặp lại một công việc nhiều lần.
- Khi cần xử lý từng phần tử trong một mảng hoặc danh sách.
- Khi cần thực hiện các phép tính lặp lại hoặc quá trình tính toán dần dần.
- Khi cần đếm số lần một điều kiện được thỏa mãn.

## Các Vòng Lặp Cơ Bản trong Java

### Vòng Lặp `for`

#### Cú Pháp

```java
for (initialization; condition; update) {
    // Khối lệnh được thực thi khi điều kiện đúng
}
```

**Giải Thích**
    
- initialization: Khởi tạo biến điều khiển vòng lặp.
- condition: Điều kiện để vòng lặp tiếp tục chạy. Vòng lặp sẽ dừng lại khi điều kiện này sai.
- update: Cập nhật biến điều khiển sau mỗi lần lặp.



**Ví dụ**

```java
int sum = 0;
for (int i = 1; i <= 100; i++) {
    sum += i;
}
System.out.println("Tổng các số từ 1 đến 100 là: " + sum);
```

#### Khi nào nên sử dụng vòng lặp `for`

- Biết trước số lần lặp.
- Cần khởi tạo và cập nhật biến điều khiển vòng lặp trong cùng một dòng lệnh.
- Ví dụ: Duyệt qua các phần tử trong một mảng hoặc danh sách.

---

### Vòng Lặp `foreach` (Enhanced for loop)

#### Cú pháp

```java
for (type element : array) {
    // Khối lệnh được thực thi cho mỗi phần tử trong mảng
}
```

**Giải Thích**

- element: Biến đại diện cho từng phần tử trong mảng hoặc collection.
- array: Mảng hoặc collection để lặp qua.

**Ví dụ**
```java
int[] numbers = {1, 2, 3, 4, 5};
for (int number : numbers) {
    System.out.println("number = " + number);
}
```

#### Khi nào nên sử dụng vòng lặp `foreach`

- Cần duyệt qua tất cả các phần tử của một mảng hoặc collection một cách đơn giản và ngắn gọn.
- Ví dụ: Xử lý từng phần tử trong một mảng hoặc danh sách mà không cần biết chỉ số của chúng.
---

### Vòng Lặp `while`

#### Cú pháp
```java
while (condition) {
    // Khối lệnh được thực thi khi điều kiện đúng
}
```
**Giải Thích**
- condition: Điều kiện để vòng lặp tiếp tục chạy. Vòng lặp sẽ dừng lại khi điều kiện này sai.

**Ví dụ**
```java
Scanner scanner = new Scanner(System.in);
int number;
while (true) {
    System.out.print("Nhập một số nguyên dương: ");
    number = scanner.nextInt();
    if (number > 0) {
        break;
    }
    System.out.println("Giá trị không hợp lệ. Vui lòng nhập lại.");
}
System.out.println("Số đã nhập là: " + number);
```
#### Khi nào nên sử dụng vòng lặp `while`

- Không biết trước số lần lặp.
- Điều kiện dừng phụ thuộc vào một biến hoặc trạng thái bên ngoài.
- Ví dụ: Chờ người dùng nhập một giá trị hợp lệ.
---

### Vòng Lặp `do-while`

#### Cú pháp

```java
do {
    // Khối lệnh được thực thi ít nhất một lần
} while (condition);
```
**Giải Thích**
- condition: Điều kiện để vòng lặp tiếp tục chạy. Vòng lặp sẽ dừng lại khi điều kiện này sai. Khối lệnh trong do sẽ luôn được thực thi ít nhất một lần.

#### Ví dụ
```java
Scanner scanner = new Scanner(System.in);
int choice;
do {
    System.out.println("Menu:");
    System.out.println("1. Tùy chọn 1");
    System.out.println("2. Tùy chọn 2");
    System.out.println("3. Thoát");
    System.out.print("Chọn một tùy chọn: ");
    choice = scanner.nextInt();
    
    switch (choice) {
        case 1:
            System.out.println("Bạn đã chọn tùy chọn 1");
            break;
        case 2:
            System.out.println("Bạn đã chọn tùy chọn 2");
            break;
        case 3:
            System.out.println("Thoát chương trình");
            break;
        default:
            System.out.println("Tùy chọn không hợp lệ. Vui lòng chọn lại.");
            break;
    }
} while (choice != 3);
```

#### Khi nào nên sử dụng vòng lặp `do-while`

- Cần đảm bảo rằng khối lệnh được thực hiện ít nhất một lần.
- Ví dụ: Hiển thị menu và yêu cầu người dùng chọn ít nhất một lần.
---

### Tổng kết

- Vòng lặp là một công cụ trong lập trình để thực hiện công việc lặp lại.
- Lựa chọn loại vòng lặp phù hợp dựa trên yêu cầu cụ thể của bài toán để viết mã hiệu quả và dễ hiểu hơn.
