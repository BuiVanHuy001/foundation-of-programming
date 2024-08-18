#include <iostream>

int main() {
    int num = 30;        // Khai báo biến số nguyên
    int *ptr = &num;    // Khai báo con trỏ và gán địa chỉ của num

    // In ra giá trị của num qua con trỏ
    std::cout << "Giá trị của num thông qua con trỏ: " << *ptr << std::endl; // In ra 30

    return 0;
}
