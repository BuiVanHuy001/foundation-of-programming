# Object-Oriented Programming

### Lập trình hướng đối tượng là gì?

**OOP (Object-Oriented Programming)** là một mô hình lập trình dựa trên khái niệm về objects (đối tượng), trong đó đối
tượng có thể chứa các attributes (attribute) và methods (method). OOP tổ chức source code thành các object và các
class, mỗi object đại diện cho một thực thể trong thế giới thực.

### Tại sao phải cần dùng OOP?

OOP mang lại nhiều lợi ích trong việc phát triển phần mềm, đặc biệt khi làm việc với các dự án lớn, phức tạp. Một số lý
do chính để sử dụng OOP:

* **Dễ bảo trì và mở rộng**: Nhờ tính kế thừa và tính đóng gói, code OOP dễ dàng được bảo trì, nâng cấp mà không làm ảnh
  hưởng đến các phần khác của hệ thống.
* **Tái sử dụng code**: Class và object có thể được tái sử dụng trong nhiều phần của chương trình hoặc dự án khác nhau.
* **Dễ hiểu và gần gũi với thế giới thực**: OOP giúp tổ chức chương trình theo cách gần với tư duy thực tế, khi các đối
  tượng tương tự như các thực thể trong đời sống.
* **Quản lý phức tạp**: OOP giúp quản lý các hệ thống phức tạp nhờ việc tổ chức chương trình thành các đối tượng có chức
  năng cụ thể.

### Class and Objects

#### Object (Đối tượng)

Object là một instance (phiên bản) được tạo ra từ class. Mỗi object có các attribute và method riêng biệt, tương ứng với
các attribute và method được định nghĩa trong class.

* **Attribute** chính là những thông tin, đặc điểm của objects. Ví dụ: xe hơi có các đặc tính như màu sắc, cửa, hãng sản
  xuất, bánh xe, …
* **Method** là những thao tác, hành động mà object đó có thể thực hiện. Ví dụ: một chiếc xe hơi sẽ có thể thực hiện
  hành
  động khởi động, chạy, vồ ga, mở cửa, ...

#### Class (Lớp)

Một class là một kiểu dữ liệu bao gồm các attribute và các methob được pre-define. Hiểu một cách đơn giản class là khuôn
mẫu hoặc bản thiết kế cho các object.

Ví dụ: Class "xe hơi" là một bản thiết kế chung cho tất cả các xe. Mỗi chiếc xe cụ thể (object) sẽ được tạo ra từ class
này.


<img src="../../../src/assets/images/class-object.png" alt="">

```java
// Định nghĩa class Xe
class XeHoi {
    // Các attribute của class
    String mauSac;
    String hangSanXuat;

    // Constructor để khởi tạo đối tượng
    public XeHoi(String mauSac, String hangSanXuat) {
        this.mauSac = mauSac;
        this.hangSanXuat = hangSanXuat;
    }

    // Method (hành vi)
    public void chay() {
        System.out.println("Xe " + hangSanXuat + " đang chạy.");
    }

    public void dungLai() {
        System.out.println("Xe " + hangSanXuat + " đã dừng lại.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Tạo các instance xe từ class XeHoi
        XeHoi xe1 = new XeHoi("Đỏ", "Audi");
        XeHoi xe2 = new XeHoi("Xanh", "Nissan");

        // Gọi method của object xe1
        xe1.chay();     // Output: Xe Audi đang chạy.
        xe1.dungLai();  // Output: Xe Audi đã dừng lại.

        // Gọi method của object xe2
        xe2.chay();     // Output: Xe Nissan đang chạy.
    }
}
```

### Từ khoá `this`

* Sử dụng `this` để tham chiếu đến attribute của đối tượng

  Trong trường hợp tên của parameter trong method trùng với tên của attribute trong class, từ khóa `this` được sử dụng
  để
  phân biệt chúng.

```java
class Xe {
    String mauSac;
    String hangSanXuat;

    // Constructor sử dụng từ khóa this để phân biệt giữa attribute và tham số
    public Xe(String mauSac, String hangSanXuat) {
        this.mauSac = mauSac;             // this.mauSac là attribute của đối tượng
        this.hangSanXuat = hangSanXuat;   // this.hangSanXuat là attribute của đối tượng
    }

    public void hienThiThongTin() {
        System.out.println("Màu sắc: " + this.mauSac);
        System.out.println("Hãng sản xuất: " + this.hangSanXuat);
    }
}

```

* Sử dụng this để gọi method của đối tượng

  Bạn có thể sử dụng this để gọi phương thức từ một phương thức khác trong cùng một class.

```java
class Xe {
    public void chay() {
        System.out.println("Xe đang chạy.");
    }

    public void dungLai() {
        System.out.println("Xe đã dừng lại.");
        this.chay();  // Gọi phương thức chay() từ phương thức dungLai()
    }
}
```

#### Access modifiers

Access modifiers là các từ khoá dùng để xác định scope (phạm vi) access attribute và method trong một class. Chúng kiểm
soát khả năng access từ các class khác trong cùng package hoặc từ các package khác.

1. `public`

   Attributes và methods có access modifier `public` có thể được access từ bất kỳ đâu, không bị giới hạn bởi class,
   package hay bất kỳ thành phần nào khác.

```java
//file: Car.java
public class Car {
    public String brand;
    public String color;

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }
}

//file Test.java
public class Test {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Blue");
        System.out.println(c1.brand); //Output: "Toyota"
    }
}
```

2. `private`

   Attributes và methods có access modifier `private` chỉ có thể được access từ bên trong class khai báo nó, không thể
   access từ bên ngoài class đó, kể cả các class con.

```java
//file: Car.java
public class Car {
    public String brand;
    public String color;
    private String plate;

    public Car(String brand, String color, String plate) {
        this.brand = brand;
        this.color = color;
        this.plate = plate;
    }
}

//file Test.java
public class Test {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Blue", "12F4");
        System.out.println(c1.plate); //Lỗi: Lỗi: plate has private access in Test.Car
    }
}
```

3. `protected`

Attributes và methods có access modifier `protected` có thể được access trong cùng một package và bởi các subclass (
class con) của class đó (dù subclass nằm trong package khác).

```java
//file: Car.java
public class Car {
    public String brand;
    public String color;
    protected String plate;

    public Car(String brand, String color, String plate) {
        this.brand = brand;
        this.color = color;
        this.plate = plate;
    }
}

//file Test.java
public class Test {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Blue", "12F4");
        System.out.println(c1.plate); //Output: 12F4
    }
}
```

4. `default`

Trong Java nếu không khai báo access modifier, nó sẽ là `default`. Attributes và methods access modifier mặc định chỉ có
thể truy cập trong cùng một package.

```java
//file: Car.java
public class Car {
    String brand;
    String color;
    String plate;

    Car(String brand, String color, String plate) {
        this.brand = brand;
        this.color = color;
        this.plate = plate;
    }
}

//file Test.java
public class Test {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Blue", "12F4");
        System.out.println(c1.plate); //Output: 12F4
    }
}
```

#### Từ khoá `static`

1. **Static Attributes**

   Static attributes là được chia sẻ chung giữa tất cả các instance của class. Thay vì mỗi instance có bản sao riêng của
   attribute, sẽ chỉ có một bản duy nhất được dùng chung cho tất cả các instance của class đó.
    ```java
    class Student {
        private String name;
        private int age;
    
        // Biến tĩnh để theo dõi số lượng sinh viên
        public static int studentCount = 0;
    
        // Constructor
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
            studentCount++; // Mỗi khi tạo sinh viên mới, tăng số lượng sinh viên
        }
        
        // Phương thức tĩnh để lấy số lượng sinh viên
        public static int getStudentCount() {
            return studentCount;
        }
   }
        
   public class Test {
        public static void main(String[] args) {
            // Tạo đối tượng sinh viên
            Student s1 = new Student("John", 20);
            Student s2 = new Student("Alice", 22);
            Student s3 = new Student("Bob", 21);
        
            // In ra số lượng sinh viên
            System.out.println("Số lượng sinh viên hiện tại: " + Student.getStudentCount());
        }
    }
    ```
2. **Static Method**

   Static methods là method có thể được gọi mà không cần tạo instance của class. Những method này thường dùng để thực
   hiện các thao tác không liên quan đến object cụ thể nào, mà liên quan đến toàn bộ class.

   Lưu ý: Static methods chỉ có thể truy cập các attribute và static method khác, không thể truy cập trực tiếp các
   attribute hoặc method non-static của object.
    ```java
    class MathUtils {
            public static int add(int a, int b) {  // Phương thức tĩnh
                return a + b;
            }
     }

     public class Test {
         public static void main(String[] args) {
            int result = MathUtils.add(5, 3);  // Gọi method tĩnh mà không cần tạo đối tượng
            System.out.println(result);  // In ra 8
         }
    }
    ```
3. **Static Class**

   **Static class** chỉ có thể được sử dụng như một nested class (class lồng nhau), tức là nó không thể được định nghĩa
   như
   một class thông thường ở mức cao nhất (top-level class).

   Một static nested class có thể được sử dụng mà không cần đối tượng của class bên ngoài. Tuy nhiên, nó không thể truy
   cập trực tiếp vào các attribute hoặc method không tĩnh của class bên ngoài.
    ```java
   class OuterClass {
        static class NestedStaticClass {
            public void display() {
                System.out.println("This is a static nested class.");
            }
        }
    }
    
    public class Test {
        public static void main(String[] args) {
            OuterClass.NestedStaticClass nested = new OuterClass.NestedStaticClass();
            nested.display();  // In ra: This is a static nested class.
        }
    }
    ```