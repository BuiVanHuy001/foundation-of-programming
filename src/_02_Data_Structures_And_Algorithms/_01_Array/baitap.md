# Bài tập về mảng (Array)

### Bài 1: Nhập vào 10 số nguyên. Thực hiện các yêu cầu sau bằng hàm:

- Hàm nhập mảng
- Hàm xuất mảng
- Đếm số lượng số nguyên tố có trong mảng
- Tìm vị trí xuất hiện số chính phương đầu tiên
    - số chính phương là số bằng bình phương của một số tự nhiên, ví dụ: 16 là số chính phương vì 16 = 4^2, 81 là số
      chính phương vì 81 = 9^2...
- Tìm vị trí xuất hiện đầu tiên của 1 số nguyên K cho tớc trong mảng. Nếu mảng không tồn tại số nguyên K thì trả về -1.

### Bài 2: Nhập vào số nguyên N. Cho người dùng nhập 1 mảng gồm có N phần tử kiểu số nguyên. Sắp xếp mảng này theo thứ tự tăng dần và giảm dần.

### Bài 3: Nhập ngày, tháng, năm. Viết các hàm sau đây:

    a) Cho biết tháng đó có bao nhiêu ngày (có xét năm nhuận).

    b) Kiểm tra ngày, tháng, năm đó có hợp lệ hay không:

    Năm hợp lệ là năm ≥ 0
    Tháng hợp lệ từ 1 đến 12
    Ngày hợp lệ từ 1 đến X (X là số ngày tối đa của tháng đó)
    c) Cho biết ngày đó là ngày thứ bao nhiêu trong năm (có xét năm nhuận).

    d) Cho biết ngày tháng vừa nhập trong năm 2023 là thứ mấy. Biết rằng ngày 01/01/2023 là Chủ Nhật.

### Bài 4: Nhập số nguyên dương N (5 ≤ N ≤ 10, nếu nhập sai thì yêu cầu nhập lại đến khi đúng).

Khai báo mảng số nguyên gồm có N + 1 phần tử và cho người dùng nhập N số nguyên dương vào mảng (phần tử cuối cùng là
phần tử trống). Viết các hàm sau đây:

    a) Nhập mảng.
    b) Xuất mảng.
    c) Tìm số chẵn nhỏ nhất trong mảng. Nếu mảng không có số chẵn thì trả về 0.
    d) Nhập số nguyên dương Q và O. Thực hiện cập nhập phần tử vào vị trí O trong mảng thành giá trị Q.
    e) Nhập số nguyên dương K và X. Thực hiện thêm số K vào vị trí X trong mảng.
    f) Nhập số nguyên M (M < N). Thực hiện xóa M phần tử ở đầu mảng

### Bài 5: Nhập vào số nguyên N. Cho người dùng nhập 1 mảng gồm có N phần tử kiểu số nguyên và số nguyên M. Hãy trả về mảng chứa vị trí của của phần tử mà tổng của hai phần tử đó bằng với số nguyên M.

**Ví dụ**

    Nhập vào: nums = [2,7,11,15], M = 9
    Xuất ra: [0,1]
    Giải thích: vì nums[0] + nums[1] == 9, nên trả về [0, 1].

### Bài 6: Cho hai mảng số nguyên `nums1` và `nums2` đã được sắp xếp từ bé đến lớn và hai số nguyên `m` và

`n` lần lượt là số lượng phần tử của 2 mảng `nums1` và
`nums2`. Hãy kết hợp 2 mảng này lại thành một mảng được sắp xếp từ bé đến lớn.

Mảng kết quả sẽ không được trả về từ hàm mà sẽ được lưu trực tiếp vào `nums1`. Để làm điều này, `nums1` có độ dài là
`m` + `n`, trong đó `m` phần tử đầu là những phần tử cần được hợp nhất, còn `n` phần tử cuối cùng ban đầu đều là số 0 và
sẽ bị bỏ qua. Mảng `nums2` có độ dài là n.

**Ví dụ 1**

    Đầu vào: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    Đầu ra: [1,2,2,3,5,6]
    Giải thích: Hai mảng được kết hợp là [1,2,3] và [2,5,6].
    Kết quả là mảng [1,2,2,3,5,6]

**Ví dụ 2**

    Đầu vào: nums1 = [1], m = 1, nums2 = [], n = 0
    Đầu ra: [1]
    Giải thích: Mảng được kết hợp là [1] và [].
    Kết quả là [1].

**Ví dụ 3**

    Đầu vào: nums1 = [0], m = 0, nums2 = [1], n = 1
    Đầu ra: [1]
    Giải thích: Mảng cần hợp nhất là [] và [1].
    Kết quả là: [1].
    Vì `m = 0`, không có phần tử nào thực sự trong mảng `nums1`, số 0 chỉ có ở đó để đảm bảo kết quả hợp nhất có thể vừa vào `nums1`.

### Bài 7: Cho mảng số nguyên `nums`. Hãy viết hàm

`removeDuplicates()` thực hiện xóa các phần tử trùng lặp có trong mảng sao cho mỗi phần tử chỉ xuất hiện một lần duy
nhất.

**Ví dụ 1**

    Đầu vào: nums = [1, 1, 2, 3, 3, 4, 1, 5, 1, 1]
    Đầu ra: k = 5, nums = nums = [1,2,3,4,5,_,_,_,_]
    Giải thích: hàm của bạn phải trả về 5, với 5 phần tử đầu tiên của nums là 0, 1, 2, 3, 4

**Ví dụ 2**

    Đầu vào: nums = [1, 1, 2, 1]
    Đầu ra: k = 2, nums = [1, 2]
    Giải thích: Hàm của bạn phải trả về 2, với 2 phần tử đầu tiên của mảng là 1, 2

**Gợi ý**

    - Thay đổi mảng nums: Thay đổi nội dung của mảng nums sao cho k phần tử đầu tiên của mảng chứa các phần tử duy nhất theo thứ tự mà chúng xuất hiện ban đầu trong mảng nums.
    - Trả về k: Trả về số lượng phần tử duy nhất k.

### Bài 8: Cho mảng số nguyên `nums` và một số nguyên `val`. Hãy xóa tất cả các phần tử có giá trị bằng

`val` có trong mảng `nums`. Trả về số lượng phần tử trong mảng `nums` sau khi xóa các giá trị `val`.

**Ví dụ 1**

    Đầu vào: nums = [3,2,2,3], val = 3
    Đầu ra: 2, nums = [2,2,_,_]
    Giải thích: Function của bạn phải trả về k = 2, với 2 phần tử đầu tiên của nums là 2.

**Ví dụ 2**

    Đầu vào: nums = [0,1,2,2,3,0,4,2], val = 2
    Đầu ra: 5, nums = [0,1,4,0,3,_,_,_]
    Giải thích: Function của bạn phải trả về k = 5, với 5 phần tử đầu tiên trong mảng là 0, 0, 1, 3, và 4 (các phần tử phía sau không quan trọng).

### Bài 9: Cho mảng số nguyên `nums` gồm

`n` phần tử. Giá trị các phần từ trong mảng nằm trong khoảng [1, n]. Hãy viết hàm trả về một mảng các số nguyên trong
khoảng [1, n] mà không xuất hiện trong mảng
`nums`

**Ví dụ 1**

    Đầu vào: nums = [4,3,2,7,8,2,3,1]
    Đầu ra: [5,6]

**Ví dụ 2**
Đầu vào: nums = [1, 1]
Đầu ra: [2]

### Bài 10: Cho mảng số nguyên

`nums`. Thay thế tất cả các phần bằng phần tử lớn nhất ở phía bên phải nó, và thay phần tử cuối cùng là `1`

**Ví dụ 1**

```console
Đầu vào: nums = [17,18,5,4,6,1]
Đầu ra: [18,6,6,6,1,-1]
Giải thích: 
- index 0 --> phần tử lớn nhất ở phía bên phải ví trí 0 là ví trí 1 (18).
- index 1 --> phần tử lớn nhất ở phía bên phải ví trí 1 là ví trí 4 (6).
- index 2 --> phần tử lớn nhất ở phía bên phải ví trí 2 là ví trí 4 (6).
- index 3 --> phần tử lớn nhất ở phía bên phải ví trí 3 là ví trí 4 (6).
- index 4 --> phần tử lớn nhất ở phía bên phải ví trí 4 là ví trí 5 (1).
- index 5 --> không có phần tử nào ở phía bên trái vị trí 5, nên đặt -1.
```

**Ví dụ 2**

```console
Đầu vào: nums = [400]
Đâu ra: [-1]
Giải thích: không có phần tử nào ở phía bên trái vị trí 0.
```