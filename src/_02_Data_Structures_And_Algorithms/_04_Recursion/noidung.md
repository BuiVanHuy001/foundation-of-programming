# Recursion (Đệ quy)

## Đệ quy là gì?
Đệ quy là một kỹ thuật trong lập trình, trong đó một hàm gọi lại chính nó. Mỗi lần gọi lại như vậy được gọi là một “lần đệ quy”. Đệ quy thường được sử dụng để giải quyết các bài toán có thể được chia nhỏ thành các bài toán con tương tự nhau.

## Đặc điểm của đệ quy
**Cơ sở dừng (base case)**: Điều kiện giúp dừng đệ quy, nếu không có điều kiện này, đệ quy sẽ lặp vô hạn và gây ra lỗi tràn bộ nhớ (stack overflow).

**Gọi đệ quy (recursive call)**: Trong mỗi lần gọi hàm đệ quy, hàm sẽ tiếp tục gọi chính nó với dữ liệu được giảm dần cho đến khi đạt đến cơ sở dừng.

**Mỗi lần đệ quy là độc lập**: Mỗi lần hàm đệ quy gọi chính nó, nó tạo ra một bản sao mới của hàm và giữ các giá trị cục bộ của riêng nó.

**Ví dụ**
```java
//Tính giai thừa của một số nguyên dương n
public class Factorial {
    public static int factorial(int n) {
        if (n == 1) {  // Cơ sở dừng
            return 1;
        }
        return n * factorial(n - 1);  // Gọi đệ quy
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));  // Output: 120
    }
}
```

## Ưu điểm và nhược điểm của đệ quy

### Ưu điểm

* Dễ đọc và dễ hiểu: Đệ quy giúp viết các thuật toán phức tạp một cách dễ hiểu và ngắn gọn hơn, đặc biệt là với các bài toán như duyệt cây, phân tích phân số, hay tìm kiếm nhị phân.
* Giải quyết các bài toán phân chia: Đệ quy là giải pháp lý tưởng cho các bài toán có thể chia nhỏ thành các bài toán con tương tự, như các thuật toán “divide and conquer” (chia để trị) ví dụ như Quicksort, Mergesort.
* Thích hợp cho cấu trúc dữ liệu đệ quy: Các cấu trúc dữ liệu như cây (tree), đồ thị (graph) hay danh sách liên kết đôi có thể được xử lý một cách tự nhiên bằng đệ quy.

### Nhược điểm

* **Hiệu suất không cao**: Đệ quy thường tiêu tốn nhiều tài nguyên bộ nhớ do phải tạo ra các bản sao hàm và lưu trữ ngữ cảnh của mỗi lần gọi hàm.
* **Dễ dẫn đến lỗi tràn bộ nhớ (stack overflow)**: Nếu không có cơ sở dừng hoặc bài toán không thể thu nhỏ về cơ sở dừng đủ nhanh, chương trình sẽ gây ra lỗi.
* **Hiệu năng kém so với vòng lặp**: Trong một số trường hợp, việc dùng đệ quy có thể tốn nhiều tài nguyên hơn so với cách tiếp cận lặp (iterative approach).

## Khi nào nên sử dụng đệ quy?

Nên sử dụng đệ quy khi:

* Bài toán có cấu trúc phân cấp tự nhiên: Như các bài toán về cây, đồ thị hoặc khi cần duyệt qua các cấu trúc dữ liệu có tính chất phân nhánh.
* Bài toán có thể được chia nhỏ thành các bài toán con tương tự: Ví dụ bài toán Fibonacci, bài toán tháp Hà Nội (Tower of Hanoi).
* Khi sự đơn giản và tính dễ đọc của mã quan trọng hơn so với hiệu suất: Đôi khi, viết mã dễ đọc và dễ bảo trì có thể quan trọng hơn việc tối ưu hiệu suất.

Không nên sử dụng đệ quy khi:

* Hiệu năng là yếu tố quan trọng: Nếu bài toán đòi hỏi tối ưu tài nguyên, dùng đệ quy có thể không hiệu quả do chi phí tạo hàm mới và lưu trữ ngữ cảnh.
* Kích thước đầu vào quá lớn: Đệ quy có thể dẫn đến lỗi tràn bộ nhớ nếu số lượng lời gọi hàm quá lớn, như với các chuỗi đệ quy sâu (deep recursion).

**Ví dụ**

Thay vì dùng đệ quy để tính dãy Fibonacci (dễ bị lặp nhiều lần), ta có thể dùng cách tiếp cận lặp (iterative approach) để tối ưu hiệu suất:
```java
public class Fibonacci {
    public static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(fibonacciIterative(10));  // Output: 55
    }
}
```