# Biến và Kiểu Dữ Liệu, Nhập xuất dữ liệu trong Java (Variables and Datatype, Input data, Output data)

## Biến là gì?
**Biến** là một khái niệm cơ bản trong mọi ngôn ngữ lập trình. Biến là một vị trí lưu trữ có tên trong bộ nhớ mà giữ một giá trị. Biến cho phép chúng ta lưu trữ dữ liệu có thể được sử dụng và thao tác trong suốt chương trình. Hãy nghĩ về biến như một cái hộp chứa thông tin mà có thể được thay đổi và sử dụng khi cần thiết.

### Các Đặc Điểm Chính của Biến:

- **Tên**: Một định danh duy nhất cho biến.
- **Kiểu**: Xác định loại dữ liệu mà biến có thể chứa.
- **Giá trị**: Dữ liệu thực sự được lưu trữ trong biến.

## Đặt Tên Biến

Khi đặt tên biến, có một số quy tắc và quy ước cần tuân theo:

### Quy tắc:

- Tên phải bắt đầu bằng một chữ cái, dấu gạch dưới (_).
- Các ký tự tiếp theo có thể là chữ cái, chữ số, dấu gạch dưới.
- Tên có phân biệt chữ hoa và chữ thường (`myVariable` khác với `myvariable`).
- Các từ khóa đã được định nghĩa không thể sử dụng làm tên biến.

### Quy ước:

- Sử dụng tên có ý nghĩa mô tả mục đích của biến và thường là một danh từ (ví dụ: `age`, `totalPrice`).
- Sử dụng camelCase, snake_case để đặt tên biến (ví dụ: `myVariableName, my_variable_name`).

## Kiểu Dữ Liệu

**Kiểu dữ liệu** xác định loại dữ liệu mà biến có thể chứa. Các ngôn ngữ lập trình khác nhau hỗ trợ các kiểu dữ liệu khác nhau, nhưng một số kiểu phổ biến bao gồm:

- ##### **Số nguyên (Integer)**:

    Số nguyên là các số không có phần thập phân, bao gồm cả số dương, số âm và số 0. Ví dụ: -10, 0, 5, 123. Trong lập trình, số nguyên thường được sử dụng để đếm, lập chỉ mục, và thực hiện các phép toán đơn giản.

  Trong các ngôn ngữ lập trình hỗ trợ nhiều kiểu dữ liệu số nguyên với các kích thước bộ nhớ và phạm vi giá trị khác nhau. Dưới đây là các kiểu số nguyên trong Java:

  - **byte**: 8-bit, giá trị từ -128 đến 127.
  - **short**: 16-bit, giá trị từ -32,768 đến 32,767.
  - **int**: 32-bit, giá trị từ -2^31 đến 2^31-1 (khoảng -2.14 tỷ đến 2.14 tỷ).
  - **long**: 64-bit, giá trị từ -2^63 đến 2^63-1 (khoảng -9.22 tỷ tỷ đến 9.22 tỷ tỷ).

- #####  **Số thực (Float)**:
    Số thực là các số có phần thập phân, ví dụ: 3.14, -0.001, 2.718. Trong lập trình, số thực thường được sử dụng để biểu diễn các giá trị có độ chính xác cao hoặc các phép toán có phần thập phân.

  Java hỗ trợ hai kiểu dữ liệu số thực chính:

    - **float**:  float có độ chính xác khoảng 7 chữ số thập phân, chiếm 32-bit bộ nhớ và thường được sử dụng khi cần tiết kiệm bộ nhớ.
    - **double**: double có độ chính xác khoảng 15 chữ số thập phân, chiếm 64-bit bộ nhớ và thường được sử dụng khi cần độ chính xác cao hơn

- ##### **Ký tự (Character)**:
    Ký tự là một đơn vị dữ liệu đại diện cho một ký tự đơn lẻ, ví dụ như chữ cái, chữ số hoặc ký tự đặc biệt. Trong Java, ký tự được biểu diễn bằng kiểu dữ liệu char.
    - **char**: 16-bit, lưu trữ một ký tự trong bảng mã Unicode.


##### - **Boolean**: Giá trị đúng hoặc sai (`true`, `false`).

### Kiểu dữ liệu không nguyên thủy (thường gọi là kiểu tham chiếu):

- **Chuỗi (String)**:
  Chuỗi là một dãy các ký tự, ví dụ như một từ, một câu hoặc bất kỳ dãy ký tự nào. Trong Java, chuỗi được biểu diễn bằng kiểu dữ liệu String.
    
- **Mảng (Array)**: Tập hợp các phần tử cùng loại.
- **Đối tượng (Object)**: Các thể hiện của lớp có thể chứa nhiều giá trị và phương thức.

## Ví dụ trong Java

Hãy xem cách chúng ta khai báo và sử dụng các biến với các kiểu dữ liệu khác nhau trong Java:

```java
public class DataTypesExample {
    public static void main(String[] args) {
        // Biến số nguyên
        int age = 25;
        
        // Biến số thực
        double salary = 50000.50;
        
        // Biến ký tự
        char grade = 'A';
        
        // Biến boolean
        boolean isJavaFun = true;
        
        // Biến chuỗi
        String greeting = "Hello, World!";
        
        // In giá trị các biến
        System.out.println("Tuổi: " + age);
        System.out.println("Lương: " + salary);
        System.out.println("Hạng: " + grade);
        System.out.println("Java có vui không? " + isJavaFun);
        System.out.println("Lời chào: " + greeting);
    }
}
```

## Nhập xuất dữ liệu trong Java
Trong lập trình, nhập xuất dữ liệu là một phần quan trọng giúp chúng ta tương tác với người dùng. Trong Java, chúng ta có nhiều cách để nhập và xuất dữ liệu. Nhưng đơn giản nhất là sử dụng `Scanner` để nhập dữ liệu từ bàn phím và cách sử dụng `System.out` để xuất dữ liệu ra màn hình.

### Sử dụng Scanner
Lớp `Scanner` trong gói `java.util` được sử dụng phổ biến để đọc dữ liệu đầu vào từ nhiều nguồn khác nhau, bao gồm cả bàn phím. Dưới đây là các bước cơ bản để sử dụng `Scanner`:

```java
//Import Lớp Scanner
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Đọc một chuỗi
        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();

        // Đọc một số nguyên
        System.out.print("Nhập tuổi của bạn: ");
        int age = scanner.nextInt();

        // Đọc một số thực
        System.out.print("Nhập điểm trung bình của bạn: ");
        double averageScore = scanner.nextDouble();

        // Đọc một ký tự
        System.out.print("Nhập giới tính của bạn (M/F): ");
        char gender = scanner.next().charAt(0);

        // Đóng đối tượng Scanner
        scanner.close();

        // In ra màn hình các thông tin đã nhập
        System.out.println("Tên của bạn: " + name);
        System.out.println("Tuổi của bạn: " + age);
        System.out.println("Điểm trung bình của bạn: " + averageScore);
        System.out.println("Giới tính của bạn: " + gender);
    }
}

```

## Xuất Dữ Liệu

Để xuất dữ liệu ra màn hình, chúng ta thường sử dụng System.out với các phương thức như `print` và `println`.
* print: In ra dữ liệu mà không xuống dòng.
* println: In ra dữ liệu và xuống dòng.
* printf: cho phép bạn định dạng chuỗi đầu ra theo cách bạn mong muốn. Nó cung cấp nhiều tùy chọn để định dạng số, chuỗi và các kiểu dữ liệu khác.
```java
public class OutputExample {
    public static void main(String[] args) {
        // In ra một chuỗi
        System.out.print("Hello, World!"); // Không xuống dòng
        System.out.println("Welcome to Java Programming!"); // Xuống dòng

        // In ra một số nguyên
        int number = 42;
        System.out.println("Number: " + number);

        // In ra một số thực
        double pi = 3.14159;
        System.out.println("Pi: " + pi);

        // In ra một ký tự
        char letter = 'A';
        System.out.println("Letter: " + letter);
    }
}
```