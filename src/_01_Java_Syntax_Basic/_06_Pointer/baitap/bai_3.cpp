#include <iostream>

int main() {
    int arr[] = {1, 2, 3, 4, 5}; // Khai báo mảng
    int *ptr = arr;              // Gán con trỏ trỏ đến mảng

    // In ra các phần tử của mảng
    std::cout << "Các phần tử của mảng là: ";
    for (int i = 0; i < 5; i++) {
        std::cout << *(ptr + i) << " "; // Sử dụng con trỏ để truy cập
    }
    std::cout << std::endl;

    return 0;
}
