#include <iostream>

int main() {
    int value = 100;      // Khai báo biến
    int *ptr = &value;   // Khai báo con trỏ trỏ đến biến
    int **ptr2 = &ptr;   // Khai báo con trỏ con trỏ đến con trỏ

    // In ra giá trị ban đầu
    std::cout << "Giá trị ban đầu: " << value << std::endl; // In ra 100

    // Thay đổi giá trị thông qua con trỏ con
    **ptr2 = 200;

    // In ra giá trị sau khi thay đổi
    std::cout << "Giá trị sau khi thay đổi: " << value << std::endl; // In ra 200

    return 0;
}
