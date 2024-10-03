package _02_Data_Structures_And_Algorithms._05_HashTable;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyHashSet {
    //Định nghĩa kích thước của bảng hash là 1000.
    private final int SIZE = 1000;
    //Khai báo một mảng các ArrayList<Integer>, mỗi ArrayList là một bucket để lưu trữ các phần tử.
    public ArrayList<Integer> myBuckets[];

    MyHashSet() {
        myBuckets = new ArrayList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            //Khởi tạo mỗi bucket là một ArrayList trống
            myBuckets[i] = new ArrayList<>();
        }
    }

    //Hàm băm lấy giá trị của n và tính chỉ số bucket bằng cách lấy n modulo SIZE.
    public int hashFunction(int n) {
        return n % SIZE;
    }

    //Thêm một phần tử vào Set
    public boolean add(int key) {
        int hashValueIndex = hashFunction(key); //Tính chỉ số bucket bằng cách sử dụng hàm băm
        var bucket = myBuckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        //Kiểm tra nếu phần tử không có trong bucket (index < 0), thêm phần tử vào bucket.
        if (keyIndex < 0) {
            bucket.add(key);
        }
        return true;
    }

    //Xóa một phần tử khỏi Set.
    public boolean remove(int key) {
        int hashValueIndex = hashFunction(key); //Tính chỉ số bucket bằng cách sử dụng hàm băm
        var bucket = myBuckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        //Tính chỉ số bucket, kiểm tra nếu phần tử có trong bucket (index >= 0), nếu có thì xóa và trả về true, ngược lại trả về false.
        if (keyIndex >= 0) {
            bucket.remove(keyIndex);
            return true;
        }
        return false;
    }

    //Kiểm tra xem phần tử có tồn tại trong tập hợp không
    public boolean contains(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        return keyIndex >= 0;
    }

    public static void main(String[] args) {
        MyHashSet mySet = new MyHashSet();
        mySet.add(1);
        mySet.add(1);
        mySet.add(2);
    }
}
