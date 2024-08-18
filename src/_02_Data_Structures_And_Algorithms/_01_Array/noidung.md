# Bài Giảng: Mảng (Array) trong Java

## Mảng Là Gì?

Mảng (array) là một cấu trúc dữ liệu lưu trữ nhiều giá trị cùng một kiểu dữ liệu được đặt liên tiếp trong bộ nhớ máy tính. Mảng cho phép truy cập các phần tử thông qua chỉ số (index).

## Tại Sao Sử Dụng Mảng?

-   **Quản Lý Dữ Liệu Dễ Dàng**: Giúp quản lý và thao tác với nhiều dữ liệu cùng loại dễ dàng hơn.
-   **Truy Cập Nhanh Chóng**: Có thể truy cập bất kỳ phần tử nào một cách nhanh chóng thông qua chỉ số. Dữ liệu được lưu trữ liên tiếp trong bộ nhớ, giúp việc truy cập trở nên nhanh hơn.

## Mảng một chiều (One-Dimensional Array)

Là loại mảng cơ bản nhất, trong đó các phần tử được lưu trữ trong một hàng duy nhất.

### Khai Báo và Khởi Tạo Mảng một chiều

```java
int[] array; //Khai báo mảng một chiều

array = new int[5]; // Khởi tạo một mảng với 5 phần tử kiểu int
int[] array = new int[5]; //Khai Báo và Khởi Tạo Cùng Lúc

int[] array = {1, 2, 3, 4, 5}; //Khởi Tạo Mảng Với Các Giá Trị Ban Đầu
```

**Giải Thích**

-   **int**: Kiểu dữ liệu của các phần tử trong mảng.
-   **[]**: Ký hiệu biểu thị đây là một mảng.
-   **array**: Tên biến của mảng
-   **new**: Từ khóa để tạo một đối tượng mới.
-   **int[5]**: Khởi tạo một mảng với 5 phần tử kiểu int.

### Các Thao Tác Khác Với Mảng một chiều

### Truy cập các phần tử trong Mảng một chiều

```java
int[] array = {1, 2, 3, 4, 5};
int firstElement = array[0]; // Truy cập phần tử sử dụng chỉ số bắt đầu từ 0.
array[1] = 10; // Sử dụng chỉ số để gán giá trị 10 cho phần tử thứ 2.
```

### Duyệt Qua Mảng một chiều

```java
//Sử Dụng Vòng Lặp for
int[] array = {1, 2, 3, 4, 5};
for (int i = 0; i < array.length; i++) {
    System.out.println(array[i]);
}
//Sử Dụng Vòng Lặp for-each
for (int element : array) {
    System.out.println(element);
}
```

## Mảng 2 chiều (Two-Dimensional Array)

Mảng hai chiều có thể được coi là một mảng của các mảng một chiều. Các phần tử của mảng được lưu trữ trong dạng lưới (matrix) với các hàng và cột.

### Khai Báo và Khởi Tạo Mảng Hai Chiều

```java
int[][] matrix; // Khai báo mảng hai chiều

matrix = new int[3][4]; // Khởi tạo một mảng hai chiều với 3 hàng và 4 cột
int[][] matrix = new int[3][4]; // Khai báo và khởi tạo cùng lúc

int[][] matrix = {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9, 10, 11, 12}
}; // Khởi tạo mảng hai chiều với các giá trị ban đầu
```

**Giải Thích**

-   **int**: Kiểu dữ liệu của các phần tử trong mảng.
    [][]: Ký hiệu biểu thị đây là một mảng hai chiều.
-   **matrix**: Tên biến của mảng.
-   **new**: Từ khóa để tạo một đối tượng mới.
-   **int[3][4]**: Khởi tạo một mảng hai chiều với 3 hàng và 4 cột.

## Array List

**ArrayList** là một class implement **List** cho phép lưu trữ các phần tử và tự động thay đổi kích thước khi cần thêm hoặc bớt các phần tử.

Khi tạo một **ArrayList** bên trong nó là một mảng có kích thước cố định (thường là 10 phần tử). Khi thêm một phần tử vào, **ArrayList** sẽ thêm phần tử đó vào bên trong mảng. Nếu phần tử đó vượt quá kích thước của mặc định của mảng, **ArrayList** sẽ tạo một mảng mới có kích thước lớn hơn và sao chép toàn bộ các phần tử từ mảng cũ sang mảng mới.

### Các thao tác với ArrayList

1. Khởi tạo ArrayList

```java
// Khởi tạo một ArrayList với kiểu dữ liệu cụ thể
ArrayList<String> list = new ArrayList<>();
```

2. Thêm phần tử vào ArrayList

```java
list.add("Apple");           // Thêm "Apple" vào cuối danh sách
list.add("Banana");
list.add(1, "Orange");       // Thêm "Orange" vào vị trí thứ 2 (chỉ số 1)
```

3. Truy cập phần tử trong ArrayList

```java
String fruit = list.get(0);  // Lấy phần tử đầu tiên ("Apple")
```

4. Cập nhật phần tử trong ArrayList

```java
list.set(1, "Mango"); // Thay thế phần tử tại vị trí thứ 2 bằng "Mango"
```

5. Xóa phần tử trong ArrayList

```java
list.remove(0);              // Xóa phần tử đầu tiên ("Apple")
list.remove("Mango");        // Xóa phần tử "Mango" (nếu tồn tại)
```

6. Duyệt qua các phần tử trong ArrayList

```java
//Sử dụng for loop
for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}
//Sử dụng foreach
for (String fruit : list) {
    System.out.println(fruit);
}
```

7. Tìm kiếm trong ArrayList

```java
boolean containsMango = list.contains("Mango"); // Kiểm tra xem "Mango" có trong danh sách không
int indexOfBanana = list.indexOf("Banana"); // Lấy vị trí đầu tiên của "Banana"
```

8. Lấy kích thước của ArrayList

```java
int size = list.size();  // Lấy số lượng phần tử trong danh sách
```