#include <iostream>

int main() {
    int num = 10;       // Khai báo biến số nguyên
    int *ptr = &num;   // Khai báo con trỏ và gán địa chỉ của num

    // In ra giá trị ban đầu
    std::cout << "Giá trị ban đầu của num: " << num << std::endl; // In ra 10

    // Thay đổi giá trị thông qua con trỏ
    *ptr = 20;

    // In ra giá trị sau khi thay đổi
    std::cout << "Giá trị sau khi thay đổi thông qua con trỏ: " << num << std::endl; // In ra 20

    return 0;
}
