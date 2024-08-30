# Stack and Queue

<img src="../../assets/images/stack-vs-queue.jpeg" alt="">

## Stack

<img src="../../assets/images/stack_desc.png" alt="">

Stack hoạt động theo nguyên tắc `LIFO` (Last in, First out), tức phần tử nào đưa vào cuối cùng sẽ là phần tử đầu tiên được lấy ra

**Các thao tác với STACK**

-   Push: Thêm một phần tử vào đầu Stack.
-   Pop: Xóa và trả về một phần tử ở đầu của Stack.
-   Peek/Top: Lấy phần tử ở đỉnh của Stack mà không xóa nó.
-   isEmpty: Kiểm tra xem Stack đó có rỗng hay không.

**Các ứng dụng của Stack**

-   Undo trong các trình soạn thảo văn bản.
-   Phân tích cú pháp (Parser) trong ngôn ngữ lập trình.
-   Quản lý hàm đệ quy trong ngăn xếp gọi hàm (Call Stack).

## Queue

<img src="../../assets/images/queue_desc.png" alt="">

Queue được hoạt động theo nguyên tắc `FIFO` (Fist in, Fist out) tức phần tử nào vào đưa vào đầu tiên sẽ được lấy ra đầu tiên.

**Các thao tác với QUEUE**

-   Enqueue: Thêm một phần tử vào cuối của Queue.
-   Dequeue: Xóa và trả về phần tử đầu tiên của Queue.
-   Front/Peek: Trả về phần tử ở đầu Queue mà không loại bỏ nó.
-   isEmpty: Kiểm tra queue có rỗng hay không.

**Ứng dụng của Queue**

-   Hàng đợi làm việc (Job Queue) trong hệ điều hành.
-   Hệ thống in ấn (Print Queue) để xử lý các lệnh in.

## Cài đặt Stack và Queue thủ công

Java hỗ trợ sẵn các cấu trúc dữ liệu Stack và Queue thông qua các CLass và Interface trong thư viện chuẩn. Tuy nhiên bạn cần phải tự cài đặt chúng thủ công trước để hiểu rõ hơn về chúng.

Bạn có thể implement `stack` và `queue` một cách thủ công bằng [Array](../_01_Array/noidung.md) hoặc [LinkedList](../_02_LinkedList/noidung.md)

### Stack

#### Implement bằng Array

##### Khởi tạo

Mục đích: Khởi tạo một Stack với kích thước size được chỉ định.

```java
public class StackWithArray {
    private int topIndex; //Chỉ số top của Stack
    private int[] array; // Mảng để lưu trữ phần tử của Stack
    private int SIZE;// Kích thước tối đa của Stack

    StackWithArray(int size) {
        SIZE = size;// Gán SIZE bằng giá trị size
        array = new int[SIZE];//Khởi tạo mảng array với kích thước SIZ
        topIndex = -1;// Khởi tạo ban đầu là -1, biểu thị rằng Stack đang rỗng.
    }
}
```

##### Mehtod `push()`

Mục đích: Thêm phần tử vào đầu Stack

```java
public boolean push(int val) {
    if (!isFull()) {
        topIndex++;
        array[topIndex] = val;
        return true;
    }
    return false;
}
```

-   Kiểm tra Stack có đầy hay không bằng phương thức [`isFull()`](#phương-thức-isfull)
-   Nếu không đầy, tăng `topIndex` lên 1 và gán giá trị `val` vào vị trí `array[topIndex]` sau đó trả về `true`, biểu thị đã thêm thành công.
-   Nếu stack đã đầy thì trả về `flase`, biểu thị đã thêm thất bại.

##### Mehtod `pop()`

Mục đích: Trả về và loại bỏ phần tử ở đầu Stack

```java
public boolean pop() {
    if (!isEmpty()) {
        topIndex--;
        return true;
    }
    return false;
}
```

##### Mehtod `peek()`

Mục đích: Trả về phần tử ở đỉnh của Stack mà không loại bỏ nó.

```java
public int peek() {
    if (!isFull()) {
        return array[topIndex];//Trả về array[topIndex], tức phần tử hiện đang ở đỉnh Stack
    }
    return -1;
}
```

##### Mehtod `isEmpty()`.

Mục đích: Kiểm tra Stack có rỗng hay không.

```java
public boolean isEmpty() {
    return topIndex == -1;
}
```

-   Trả về `true` nếu `topIndex` bằng `-1` ([Giá trị mặc định của `topIndex`](#khởi-tạo)), nghĩa là Stack không chứa phần tử nào. Ngược lại sẽ là `false`

##### Mehtod `isFull()`

Mục đích: Kiểm tra Stack có đầy không.

```java
public boolean isFull() {
    return topIndex == SIZE - 1;
}
```

-   Trả về true nếu `topIndex` bằng `SIZE - 1`, nghĩa là Stack đã chứa đầy đủ phần tử và không thể thêm phần tử mới.
-   Trả về `false` nếu còn chỗ trống trong Stack.

##### Mehtod `show()`

Mục đích: Hiển thị tất cả các phần tử trong Stack từ dưới lên trên

```java
public void show() {
    System.out.print("The value of Array is: ");
    for (int i = 0; i <= topIndex; i++) {
        System.out.printf("%d ", array[i]);
    }
}
```

[Source code implement Stack với Array](./StackWithArray.java)

#### Implement bằng LinkedList

##### Khởi tạo

Mục đích: Tạo một Class `Node` đại diện cho một phần tử trong LinkedList. Mỗi `Node` chứa một giá trị `value` và một con trỏ trỏ đến `Node` tiếp theo là `next`.

```java
public class StackWithLinkedList {
    private class Node {
        int value;
        Node next;

        //Khởi tạo node với giá trị val và con trỏ next ban đầu được đặt là null.
        Node(int val) {
            this.value = val;
        }
    }

    // Tạo biến lưu trữ node đầu Stack
    Node topNode;

    //Khởi tạo một Stack rỗng với topNode là null, biểu thị rằng Stack ban đầu không chứa phần tử nào.
    StackWithLinkedList() {
        topNode = null;
    }
}
```

##### Mehtod `isEmpty()`

```java
public boolean isEmpty() {
    return topNode == null;
}
```

-   Trả về `true` nếu `topNode` bằng `null` (tức giá trị mặc định) nghĩa là Stack không chứa phần tử nào.
-   Trả về `false` nếu Stack có ít nhất một phần tử.

##### Mehtod `isFull()`

```java
public boolean isFull() {
    return false;//Trả về false vì Stack triển khai bằng danh sách liên kết không có giới hạn về kích thước, nên Stack không bao giờ đầy. Trừ khi dầy RAM :)
}
```

##### Method `push()`

```java
public boolean push(int val) {
    if (!isFull()) {
        Node newNode = new Node(val);// Tạo một Node mới với giá trị là val
        newNode.next = topNode;// Gán con trỏ next của node mới này trỏ đến node đầu của Stack (tức topNode)
        topNode = newNode;//Cập nhật topNode bằng giá trị của Node mới, để Node mới trở thành Node đầu mới của Stack
        return true;//Trả về true, biểu thị rằng hành động push thành công
    }
    return false;
}
```

##### Method `pop()`

```java
public int pop() {
    if (!isEmpty()) {
        //Lấy giá trị của Node đầu Stack(topNode.value)
        int val = topNode.value;

        //Cập nhật topNode để trỏ đến node tiếp theo trong Stack (topNode.next).
        topNode = topNode.next;

        //Trả về giá trị của node vừa bị loại bỏ.
        return val;
    }

    //Nếu Stack rỗng, trả về -1 để báo hiệu không có phần tử nào để loại bỏ
    return -1;
}
```

[Source code implement Stack với LinkedList](./StackWithLinkedList.java)

### Queue

#### Implement bằng Array

##### Khởi tạo

```java
public class QueueWithArray {
    private int[] array;// Mảng để lưu trữ các phần tử của Queue
    private int SIZE;// Kích thước tối đa của Queue
    private int headIndex;// Chỉ số của phần tử ở đầu Queue
    private int tailIndex;// Chỉ số của phần tử ở cuối Queue

    // Khởi tạo một Queue với kích thước size được chỉ định.
    QueueWithArray(int size) {
        // Gán SIZE bằng giá trị size được truyền vào
        SIZE = size;

        // Khởi tạo mảng array với kích thước SIZE
        array = new int[SIZE];
        //Đặt cả headIndex và tailIndex bằng -1, biểu thị rằng Queue ban đầu không chứa phần tử nào.
        tailIndex = headIndex = -1;
    }
}
```

##### Method `isFull()`

```java
public boolean isFull() {
    return tailIndex > SIZE - 1;
}
```

-   Trả về `true` nếu `tailIndex` lớn hơn `SIZE - 1`, nghĩa là Queue đã chứa đủ phần tử.
-   Trả về `false` nếu Queue vẫn còn chỗ trống.

##### Method `isEmpty()`

```java
public boolean isEmpty() {
    return tailIndex == -1;
}
```

-   Trả về `true` nếu `tailIndex` là `-1`, nghĩa là Queue không chứa phần tử nào.
-   Trả về `false` nếu Queue có ít nhất một phần tử.

##### Method `enQueue()`

```java
public boolean enQueue(int value) {
    if (!isFull()) {
        //Nếu Queue không rỗng (isEmpty()), tăng headIndex lên 1 để chỉ vào phần tử đầu tiên
        if (isEmpty()) {
            headIndex++;
        }

        //Tăng tailIndex lên một và gán giá trị value vào vị trí array[tailIndex].
        tailIndex++;
        array[tailIndex] = value;
        return true;// Trả về true biểu thị rằng đã thêm thành công
    }
    //Trả về false biểu thị rằng Queue đầy và không thể thêm phần tử.
    return false;
}
```

##### Method `deQueue()`

```java
public int deQueue() {
    int val = -1;
    if (!isEmpty()) {
        //Lưu giá trị của phần tử ở đầu Queue (array[headIndex]) vào biến val.
        val = array[headIndex];

        //Dịch chuyển tất cả các phần tử còn lại trong mảng lên một vị trí (từ headIndex+1 đến tailIndex).
        for (int i = 0; i < tailIndex; i++) {
            array[i] = array[i + 1];
        }
        //Giảm tailIndex xuống một đơn vị. Nếu sau khi giảm mà tailIndex nhỏ hơn 0, đặt cả tailIndex và headIndex về -1 để biểu thị Queue trống.
        tailIndex--;
        if (tailIndex < 0) {
            tailIndex = headIndex = -1;
        }
    }

    // Trả về giá trị của phần tử vừa bị loại bỏ. Nếu Queue rỗng, trả về -1.
    return val;
}
```

[Source code implement Queue bằng Array](./QueueWithArray.java)

#### Implement bằng LinkedList

##### Khởi tạo

```java
public class QueueWithLinkedList {
    //Tạo class Node đại diện cho một phần tử trong Queue
    private class Node {
        int value;
        Node next;
        Node(int val) {
            this.value = val;
        }
    }

    Node topNode; //Trỏ đến phần tử đầu tiên
    Node tailNode; //Trỏ đến phần tử cuối cùng

    //Constructor giúp khởi tạo một Queue rỗng với topNode và tailNode đều là null, biểu thị rằng Queue ban đầu không chưa phần tử nào.
    QueueWithLinkedList() {
        topNode = null;
        tailNode = null;
    }
}
```

##### Method `enQueue()`

```java
public boolean enQueue(int val) {
    if (!isFull()) {
        //Tạo một node mới với giá trị val.
        Node newNode = new Node(val);

        //Nếu Queue rỗng, nghĩa là đây là phần tử đầu tiên. Thì gán cả tailNode và topNode trỏ đến newNode
        if (isEmpty()) {
            tailNode = newNode;
            topNode = newNode;
        } else {
            //Nếu Queue không rỗng thì gán next của tailNode (Node cuối cùng hiện tại) trỏ đến newNode
            tailNode.next = newNode;
            //Cập nhật tailNode để trỏ đến newNode, Nghĩa là node mới này trở thành node cuối cùng của Queue
            tailNode = newNode;
        }
        //Trả về true để báo hiệu thao tác thành công
        return true;
    }

    //Trả về false để báo hiệu thao tác không thành công do danh sách đã đầy
    return false;
}
```

##### Method `deQueue()`

```java
public int deQueue() {
    //Kiểm tra nếu Queue không rỗng
    if(!isEmpty()) {
        //Lấy giá trị của phần tử đầu tiên (topNode.value).
        int val = topNode.value;

        //Cập nhật topNode để trỏ đến node tiếp theo (topNode.next), nghĩa là node hiện tại ở đầu sẽ bị loại bỏ.
        topNode = topNode.next;

        //Nếu sau khi loại bỏ, Queue trở nên rỗng (tức là topNode trở thành null), đặt tailNode cũng là null.
        if (topNode == null) {
            tailNode = null;
        }

        //Trả về giá trị của phần tử vừa bị loại bỏ.
        return val;
    }

    //Nếu Queue rỗng, trả về -1.
    return -1;
}
```

[Source code implement Queue bằng LinkedList](./QueueWithLinkedList.java)

## Sử dụng thư viện Stack trong Java

Thư viên **Stack** là một phần của package `java.util`.

#### Khởi tạo một Stack

```java
//import thư viên Stack
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        //Tạo một stack để lưu trữ các số nguyên Integer
        Stack<Integer> stack = new Stack<>();
    }
}
```

#### Thêm phần tử vào Stack

```java
stack.push(10);
stack.push(20);
stack.push(30);
```

-   `push(E element)`: Thêm phần tử `element` và đầu Stack.

#### Lấy phần tử từ Stack

```java
int poppedElement = stack.pop();
System.out.println("Popped element: " + poppedElement);
```

-   pop(): Loại bỏ và trả về phần tử ở đỉnh của stack. Nếu stack rỗng, phương thức này sẽ throw ra ngoại lệ EmptyStackException.

#### Xem phần tử đầu mà không xóa

```java
int topElement = stack.peek();
System.out.println("Top element: " + topElement);
```

-   peek(): Trả về phần tử đầu của stack mà không loại bỏ nó. Nếu stack rỗng, phương thức này sẽ throw ra ngoại lệ `EmptyStackException`.

#### Kiểm tra Stack có rỗng không

```java
boolean isEmpty = stack.isEmpty();
System.out.println("Is stack empty? " + isEmpty);
```

-   isEmpty(): Trả về `true` nếu stack rỗng, ngược lại trả về `false`.

#### Tìm kiếm phần tử trong Stack

```java
int position = stack.search(20);
System.out.println("Position of 20: " + position);
```

-   search(Object element): Tìm kiếm element trong stack. Trả về vị trí của nó, tính từ đỉnh của stack. Nếu phần tử không tồn tại, trả về -1.

#### Hiển thị các phần tử trong Stack

```java
System.out.println("Stack elements: " + stack);
```

**Ví dụ**

```java
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack elements: " + stack);

        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        System.out.println("Stack after pop: " + stack);

        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);

        int position = stack.search(20);
        System.out.println("Position of 20: " + position);
    }
}
```

Kết quả:

```console
Stack elements: [10, 20, 30]
Top element: 30
Popped element: 30
Stack after pop: [10, 20]
Is stack empty? false
Position of 20: 1
```
