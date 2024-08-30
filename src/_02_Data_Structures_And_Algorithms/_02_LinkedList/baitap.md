# Bài tập LinkedList

### Bài 1: Cho `head` của một linked list. Hãy thực hiện xóa node thứ `n` tính từ cuối danh sách trở về và trả về `head` của list đó

**Ví dụ 1**

    Đầu vào: head = [1, 2, 3, 4, 5], n = 2
    Đầu ra: [1, 2, 3, 5]

**Ví dụ 2**

    Đầu vào: head = [1], n = 1
    Đầu ra: []

**Ví dụ 3**

    Đầu vào: head = [1, 2], n = 1
    Đầu ra: [1]

### Bài 2: Cho `head` của một linked list. Hãy xác định xem danh sách liên kết này có chu kỳ hay không.

Một danh sách liên kết có chu kỳ nếu tồn tại một node nào đó trong danh sách mà khi đi theo con trỏ `next`, bạn có thể quay trở lại nút đó.

Trả về `true` nếu danh sách liên kết có chu kỳ. Ngược lại, trả về `false`.

**Ví dụ 1**

<img src="../../assets/images/LinkedListBai1Exp1.png" alt="">

    Đầu vào: head = [3, 2, 0, -4]
    Đầu ra: true
    Giải thích: Có một chu trình trong danh sách này. Trong đó phần tail nối với node thứ 1 (theo index base 0)

**Ví dụ 2**

<img src="../../assets/images/LinkedListBai1Exp2.png" alt="">

    Đầu vào: head = [1, 2]
    Đầu ra: true
    Giải thích: Có một chu trình trong danh sách này. Trong đó phần tail nối với node thứ 0 (theo index base 0)

**Ví dụ 3**

<img src="../../assets/images/LinkedListBai1Exp3.png" alt="">
    
    Đầu vào: head = [1]
    Đầu ra: false
    Giải thích: Không có chu trình nào trong danh sách này

### Bài 3: Cho 2 `head` của hai LikedList `headA` và `headB`. Hãy trả về node mà hai danh sách đó giao với nhau, nếu hai danh sách đó không giao nhau ở điểm nào cả thì trả về `null`

**Ví dụ**

Hai danh sách liên kết dưới đây giao nhau ở node `c1`
<img src="../../assets/images/LinkedListBai2Exp.png">

Lưu ý rằng danh sách liên kết phải giữ nguyên cấu trúc ban đầu sau khi hàm trả về.