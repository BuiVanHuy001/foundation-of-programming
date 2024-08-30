# Bài tập về Stack và Queue

### Bài 1: Cho một string `s` chỉ chứa các ký tự bao gồm '(', ')', '{', '}, '[' và ']'. Hãy xác định xem chuỗi `s` có hợp lệ hay không.
    Một chuỗi hợp lệ nếu:
        1. Dấu ngoặc mở phải được đóng bằng cùng loại dấu ngoặc
        2. Dấu ngoặc mở phải được đóng theo đúng thứ tự

**Ví dụ 1**

    Đầu vào: s = "()"
    Đầu ra: true

**Ví dụ 2**

    Đầu vào: s = "()[]{}"
    Đầu ra: true

**Ví dụ 3**
    
    Input: s = "(]"
    Output: false

### Bài 2: Tạo một class `RecentCounter` để đếm số lượng yêu cầu (requests) xảy ra trong khoảng thời gian 3000 milliseconds gần nhất.

Class `RecentCounter` cần có những method sau:
* Constructor (`RecentCounter`): Khởi tạo một đối tượng RecentCounter với số lượng yêu cầu ban đầu là 0.
* `int ping(int t)`: Thêm một yêu cầu mới tại thời điểm `t` (đơn vị là milliseconds). Trả về số lượng yêu cầu đã xảy ra trong khoảng thời gian từ `t - 3000` đến `t` (bao gồm cả thời điểm `t`).

**Yêu cầu**
* Mỗi lần gọi ping sẽ có một giá trị thời gian t tăng dần so với lần gọi trước.
* Bạn cần đảm bảo rằng chương trình chạy hiệu quả với số lượng yêu cầu lớn.

**Ví dụ**
```java
RecentCounter recentCounter = new RecentCounter();
System.out.println(recentCounter.ping(1));     // Output: 1
System.out.println(recentCounter.ping(100));   // Output: 2
System.out.println(recentCounter.ping(3001));  // Output: 3
System.out.println(recentCounter.ping(3002));  // Output: 3
```
**Giải thích**

    Lần gọi đầu tiên ping(1): Hệ thống nhận một yêu cầu tại thời điểm 1. Vì đây là yêu cầu đầu tiên, nên trả về 1.

    Lần gọi tiếp theo ping(100): Hệ thống nhận yêu cầu tại thời điểm 100. Có 2 yêu cầu trong khoảng thời gian từ -2900 đến 100, nên trả về 2.

    Lần gọi tiếp theo ping(3001): Có 3 yêu cầu trong khoảng thời gian từ 1 đến 3001, nên trả về 3.

    Lần gọi cuối cùng ping(3002): Có 3 yêu cầu trong khoảng thời gian từ 2 đến 3002, nên trả về 3.

**Gợi ý**
    
    Sử dụng một cấu trúc dữ liệu Queue để lưu trữ các yêu cầu và loại bỏ những yêu cầu đã quá thời hạn 3000 milliseconds.

### Bài 3: Thiết kế một class `MinStack` với các method:

* `MinStack()` khởi tạo đối tượng stack
* `void push(int val)` thêm một phần tử vào Stack
* `void pop()` xóa một phần tử đầu trong Stack
* `int top()` lấy phần tử đầu tiên trong Stack ra
* `int getMin` lấy ra giá trị nhỏ nhất có trong Stack

**Ví dụ**

```java
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2
```

### Bài 4: Hãy cài đặt một class Queue mà chỉ sử dụng 2 stacks. Queue được cài đặt phải có đủ các function của một Queue bình thường.

Các phương thức cần cài đặt như sau:

* `void push(int x)` thêm một phần tử vào cuối queue.
* `int pop()` xóa một phần tử ở đầu queue và trả về phần tử đó.
* `int peek()` trả về phần tử đầu của queue.
* `boolean empty()` trả về `true` nếu queue rỗng, ngược lại là `false`.

**Ghi chú:** Bạn có thể sử dụng thư viên stack trong Java

**Test Case 1**

```java
MyQueue myQueue = new MyQueue();
myQueue.push(1); // queue là: [1]
myQueue.push(2); // queue là: [1, 2]
myQueue.peek(); // return 1
myQueue.pop(); // return 1, queue là [2]
myQueue.empty(); // return false
```

**Test Case 2**
```console
    MyQueue myQueue = new MyQueue();
    myQueue.push(1); // queue là: [1]
    myQueue.pop(); // queue is: []
    myQueue.isEmpty; // true;
```

### Bài 5: Hãy cài đặt một class Stack nhưng chỉ sử dụng 2 queues. Stack được cài đặt phải có đủ các fucntions của một stack bình thường.

Các phương thức cần cài đặt như sau:
* `void push(int x)` thêm phần tử x vào đầu stack.
* `int pop()` xóa phần tử đầu stack và trả về nó.
* `int top()` trả về phần tử đầu stack.
* `boolean empty()` trả về true nếu stack rỗng, ngược lại sẽ là false.

**Test case 1**

```java
MyStack myStack = new MyStack();
myStack.push(1);
myStack.push(2);
myStack.top(); // return 2
myStack.pop(); // return 2
myStack.isEmpty; // return false
```

### Bài 6: Cho một chuỗi đã được mã hóa, hãy trả về chuỗi sau khi đã giải mã..

Quy tắc mã hóa là: `k[encoded_string]`, trong đó `encoded_string` bên trong dấu ngoặc vuông được lặp lại chính xác `k` lần. Lưu ý rằng `k` luôn đảm bảo là một số nguyên dương.

**Ghi chú**:
Chuỗi đầu vào luôn hợp lệ; không có khoảng trắng thừa, chỉ bao gồm số và các ký tự của bảng chữ cái tiếng Anh và các dấu [], các dấu ngoặc vuông được hình thành chính xác, v.v. Hơn nữa, `encode_string` không chứa bất kỳ chữ số nào và các chữ số chỉ xuất hiện cho các số lặp lại, k. Ví dụ, sẽ không có đầu vào như `3a` hoặc `2[4]`.

**Test case 1**

```console
Input: s = "3[a]2[bc]"
Output: "aaabcbc"
```

**Test case 2**

```console
Input: s = "3[a2[c]]"
Output: "accaccacc"
```

**Test case 3**

```console
Input: s = "2[abc]3[cd]ef"
Output: "abcabccdcdcdef"
```