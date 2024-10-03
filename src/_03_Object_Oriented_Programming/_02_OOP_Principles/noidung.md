# Các tính chất của OOP

Lập trình hướng đối tượng có tổng cộng 4 nguyên lý cơ bản nhất, bao gồm: Encapsulation, Polymorphism, Inheritance và
Abstraction.

<img src="../../assets/images/principles_of_oop.webp" alt="">

## Encapsulation (Tính đóng gói)

Encapsulation là việc che giấu attributes và methods bên trong object, chỉ tiết lộ những gì cần thiết và quy định cách
access thông qua các method getter, setter.

**Ví dụ**: Ta thấy một viên thuốc chữa cảm. Chúng ta chỉ biết nó chữa cảm sổ mũi nhức đầu và một số thành phần chính,
còn cụ
thể bên trong nó có những hoạt chất gì thì hoàn toàn không biết.

<img src="../../assets/images/encapsulation.png" alt="">

#### Mục đích của Encapsulation

* **Bảo mật dữ liệu**: Giúp bảo vệ dữ liệu khỏi việc bị access trực tiếp từ bên ngoài, giúp ngăn ngừa các thay đổi không
  mong muốn từ bên ngoài.
* **Kiểm soát quyền truy cập**: Đảm bảo rằng chỉ có các method nhất định có thể thay đổi value của attribute, giúp dễ
  dàng validate và verify data.
* **Cung cấp các phương thức công khai**: để người dùng tương tác mà không cần phải hiểu chi tiết về logic bên trong.

#### Implement Encapsulation

* **Sử dụng access modifiers**: Đặt các attribute là `private` or `protected` để ngăn chặn việc access trực tiếp từ bên
  ngoài.
* **Cung cấp phương thức getter và setter**: Sử dụng các method này để access và update các attribute.

```java
class Person {
    // Attribute được đóng gói (private)
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        setAge(age); // Sử dụng setter để gán tuổi
    }

    // Getter cho attribute name
    public String getName() {
        return name;
    }

    // Getter cho attribute age
    public int getAge() {
        return age;
    }

    // Setter cho attribute age với validate
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Tuổi phải là số dương.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 30);

        // Truy cập thông qua getter
        System.out.println("Tên: " + person.getName());
        System.out.println("Tuổi: " + person.getAge());

        // Thay đổi tuổi thông qua setter
        person.setAge(25);
        System.out.println("Tuổi mới: " + person.getAge());

        // Thử gán tuổi không hợp lệ
        person.setAge(-5);  // In ra thông báo lỗi
    }
}
```

## Inheritance (Tính kế thừa)

Inheritance là việc một class mới, gọi là subclass, kế thừa các attribute và method của một class khác, được gọi là
superclass. Điều này giúp tái sử dụng code.

```java
//file: Animal.java | SupperClass
class Animal {
    // Thuộc tính
    private String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Phương thức
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    // Getter
    public String getName() {
        return name;
    }
}

//file: Dog.java | SubClass
class Dog extends Animal {
    // Constructor
    public Dog(String name) {
        super(name); // Gọi constructor của lớp cha
    }

    // Ghi đè phương thức
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

//file: Main.java | Nơi chương trình bắt đầu
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        animal.makeSound(); // Xuất ra: Animal makes a sound

        Dog dog = new Dog("Buddy");
        dog.makeSound(); // Xuất ra: Dog barks

        System.out.println("Tên chó: " + dog.getName()); // Xuất ra: Tên chó: Buddy
    }
}
```

### Các loài kế thừa

<img src="../../assets/images/type_of_inheritance.jpg" alt="">

1. Single Inheritance (Đơn Kế Thừa)

   Single Inheritance xảy ra khi một subclass kế thừa từ một superclass duy nhất. Giúp tạo ra một cấu trúc đơn giản và
   rõ ràng.

```java
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks");
    }
}
```

2. Multilevel Inheritance (Kế Thừa Nhiều Tầng)

Multilevel Inheritance xảy ra khi một subclass kế thừa từ một superclass, và class đó lại là lớp cha của một superclass
khác. Tạo ra một chuỗi các lớp.

```java
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks");
    }
}

class Pug extends Dog {
    public void weep() {
        System.out.println("Pug whines");
    }
}
```

3. Hierarchical Inheritance (Kế Thừa Thứ Bậc)

Hierarchical Inheritance xảy ra khi nhiều subclass kế thừa từ một superclass. Điều này cho phép các subclass có thể
chia sẻ các attribute và method từ lớp cha.

```java
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("Cat meows");
    }
}
```

#### Tóm lại:

* **Single Inheritance**: Một lớp con kế thừa từ một lớp cha duy nhất.
* **Multilevel Inheritance**: Một chuỗi các lớp, nơi lớp con kế thừa từ lớp cha, và lớp cha lại là lớp cha của lớp khác.
* **Hierarchical Inheritance**: Nhiều lớp con kế thừa từ một lớp cha chung.

## Polymorphism (Tính đa hình)

Polymorphism là khái niệm mà hai hoặc nhiều class có những method giống nhau nhưng có thể implement (thực thi) theo
những cách thức khác nhau.

Ví dụ: Có 2 con vật: bò, mèo. Cả 2 con vật này đều là động vât. Nhưng khi ta bảo cả 2 con vật kêu thì con bò sẽ
kêu moow, con mèo sẽ kêu meow.

<img src="../../assets/images/polymorphismEx.png" alt="">

```java
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cow moow");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Cow();
        myAnimal.makeSound(); // Xuất ra: Cow moow

        myAnimal = new Cat(); // Thay đổi loại object
        myAnimal.makeSound(); // Xuất ra: Cat meows
    }
}
```

#### Override (Ghi đè)

**Override** xảy ra khi một subclass có cách implement riêng cho một method cho đã được định nghĩa trong superclass.
Điều này có nghĩa là subclass có thể thay đổi hành vi của method kế thừa từ superclass mà không cần thay đổi code của
lớp cha.

• Phương thức được ghi đè phải có cùng tên, cùng kiểu trả về và danh sách tham số như phương thức trong lớp cha.

•   `@Override` giúp đảm bảo method thực sự ghi đè một method từ superclass. Nếu không dùng, method vẫn có thể ghi đè
nhưng trình biên dịch sẽ không kiểm tra lỗi như sai tên hoặc param, dẫn đến khó phát hiện lỗi và giảm tính rõ ràng trong
mã.

## Abstraction (Tính trừu tượng)

Abstraction là một cách giúp ẩn đi các chi tiết phức tạp của hệ thống và chỉ cung cấp những thông tin quan trọng cho
người dùng

Ví dụ: Bạn sử dụng vô lăng để điều khiển hướng xe, bàn đạp để tăng tốc hoặc giảm tốc, ...

Bạn không cần biết cách động cơ hoạt động như thế nào hay hệ thống điện tử trong ô tô điều khiển như thế nào. Bạn chỉ
cần tập trung vào cách sử dụng (đó là phần "trừu tượng") mà không cần hiểu chi tiết cơ chế bên trong (phần "ẩn đi").

<img src="../../assets/images/abstraction-ex.webp" alt="">

### Cách thực hiện abstraction trong OOP

Trong OOP, abstraction có thể được thực hiện thông qua:

* Abstract Class
* Interface

#### Abstract Class

Abstract Class là một lớp không thể tạo instance, mà chỉ có thể được sử dụng như một khuôn mẫu để các lớp con kế thừa và
implement các abstract method (method không có phần thân) trong đó.

```java

// Abstract class Animal
abstract class Animal {
    // Abstract method
    abstract void makeSound();

    // phương thức thông thường
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Subclass Dog kế thừa abstract class Animal
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
```

###### Các tính chất của AbstractClass

* Không thể tạo ra instance trực tiếp
* Có thể chứa cả method bình thường và abstract method(có ít nhất một abstract method). Class kế thừa lại abstract class
  phải override lại các abstract
  method trong abstract class
* Sử dụng khi xây dựng một bản thiết kế chung cho một nhóm object, nhưng không muốn cho phép khởi tạo bản thiết kế đó.
  AbstractClass giúp tạo ra một cấu trúc khung, buộc các subclass phải implement các phương thức quan trọng đã được định
  nghĩa.

#### Interface

Interface làm một tập hợp các abstract method mà class implement nó phải `@Override` lại. Interface chỉ định rõ những gì
một lớp phải làm mà không xác định cách thức thực hiện.

##### Các tính chất của Interface

* Chỉ có abstract methods và Class implement interface phải `@Override` tất cả các method đó
* Một class có thể implement nhiều interface
* Biến được khai báo trong một interface thực chất là hằng số và có những thuộc tính mặc định sau: `public`, `final`
  và `static`

##### So sánh giữa AbstractClass và Interface

| Tiêu chí      | AbstractClass                                      | Interface                                                                                     |
|---------------|----------------------------------------------------|-----------------------------------------------------------------------------------------------|
| Method        | Có thể chứa abstract method và method thông thường | Chỉ chứa abstract methods                                                                     |
| Cấu trúc biến | Có thể có biến thông thường và hằng số             | Mặc định là `public static final`                                                             |
| Kế thừa       | Một class chỉ có thể extend 1 abstract class       | Một class có thể implement nhiều Interface                                                    |
| Mục đích      | Khi có chung logic hoặc cấu trúc cho các lớp con   | Khi bạn cần một chuẩn (contract) chung giữa các class mà không quan tâm cách thức triển khai. |
