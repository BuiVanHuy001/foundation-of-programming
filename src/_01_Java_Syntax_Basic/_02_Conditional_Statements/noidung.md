# Câu điều kiện (Conditional Statements)

## Giới Thiệu

Trong lập trình, câu điều kiện cho phép chương trình thực hiện các lệnh khác nhau dựa trên các điều kiện khác nhau. Hai câu điều kiện phổ biến trong Java là `if-else if-else` và `switch-case`.

## Cấu Trúc `if-else if-else`

### Cú Pháp

```java
if (condition1) {
    // Thực hiện khi condition1 đúng
} else if (condition2) {
    // Thực hiện khi condition2 đúng
} else {
    // Thực hiện khi tất cả các điều kiện trên đều sai
}
```

**Giải Thích**
* if: Kiểm tra điều kiện đầu tiên.
* else if: Kiểm tra các điều kiện tiếp theo nếu các điều kiện trước đó sai.
* else: Thực hiện khi tất cả các điều kiện đều sai.

### Ví Dụ

```java
public class IfElseExample {
    public static void main(String[] args) {
        int score = 85;

        if (score >= 90) {
            System.out.println("Grade A");
        } else if (score >= 80) {
            System.out.println("Grade B");
        } else if (score >= 70) {
            System.out.println("Grade C");
        } else if (score >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }
    }
}
```

## Cấu Trúc switch-case

### Cú Pháp
```java
switch (expression) {
    case value1:
        // Thực hiện khi expression == value1
        break;
    case value2:
        // Thực hiện khi expression == value2
        break;
    // Các trường hợp khác
    default:
        // Thực hiện khi không có trường hợp nào khớp
}
```

**Giải Thích**
* switch: Kiểm tra giá trị của biểu thức.
* case: Thực hiện các lệnh khi giá trị của biểu thức khớp với giá trị của case.
* default: Thực hiện khi không có case nào khớp. Không bắt buộc phải có.
* break: Ngắt case để không thực hiện tiếp các case sau.

**Ví Dụ**
```java
    public class SwitchCaseExample {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
```

## Sự Khác Nhau Giữa if-else if-else và switch-case

* **Độ Phức Tạp**
    * if-else if-else: Thích hợp cho các điều kiện phức tạp và không chỉ giới hạn trong việc kiểm tra giá trị của một biến.
  * switch-case: Tốt nhất cho các tình huống cần kiểm tra giá trị của một biến duy nhất và giá trị đó thuộc một tập hợp hằng số cố định.
* **Hiệu Suất**
    * if-else if-else: Hiệu suất có thể kém hơn nếu có nhiều điều kiện vì mỗi điều kiện phải được kiểm tra lần lượt.
    * switch-case: Thường hiệu quả hơn khi có nhiều trường hợp vì sử dụng bảng tra cứu.
* **Tính Dễ Đọc**
  * if-else if-else: Dễ đọc hơn khi các điều kiện là phức tạp hoặc không phải là giá trị đơn giản.
  * switch-case: Dễ đọc và gọn gàng hơn khi kiểm tra một biến với nhiều giá trị hằng số. 

## Khi Nào Nên Sử Dụng

* Sử Dụng if-else if-else Khi:
    * Điều kiện kiểm tra phức tạp (ví dụ: sử dụng các toán tử logic như `&&`, `||`).
    * Cần kiểm tra các khoảng giá trị hoặc nhiều biến khác nhau.
* Sử Dụng switch-case Khi:
    * Biểu thức kiểm tra là một biến duy nhất có thể có một trong nhiều giá trị hằng số.
    * Cần kiểm tra một giá trị cụ thể của một biến duy nhất.
