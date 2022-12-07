package Lesson1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LearnArray {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++){
            String str = sc.nextLine();
            list.add(str);
        }

        //equal-> giống hệt  
        // Contain -> Chứa     
        System.out.println(list.toString());
        int count =0;
        String search = "java";
        for(String str: list){
            if(str.contains(search)) count++;
        }
        System.out.println(count);

        String str1 = sc.nextLine();
        for(String str2: list){
            if(str2.equals(str1)){
                System.out.println("Vị trí tìm thấy: " + list.indexOf(str2));
            }
        }

        String str = "abc";
        System.out.println(str.split(""));

    }

}

// Tạo mảng chuỗi gồm n phần tử (n nhập vào từ bàn phím)

// ● Nhập thông tin cho các phần tử

// ● In thông tin ra màn hình

// ● Đếm số lần “Java” xuất hiện trong mảng

// ● Nhập vào từ bàn phím chuỗi bất kỳ, kiểm tra chuỗi đó ở vị trí nào của mảng


/*
list khai một danh sách
list.add() thêm phần tử vào danh sách
CharAt()  lấy giá trị từ vị trí truyền vào -> sai
IndexOf()  giá trị ở index -> sai -> tìm index cảu giá trị
split()  hàm tách string thành mảng theo giá trị truyền vào -> sai 
toString()  đưa về dạng string 
equal - giống nhau về giá trị và contain - chứa
for each và for  khác nhau ở index 
for each ko truy cập được vào index của giá trị
filter lọc các phần tử trong mảng theo giá trị truyền vào
map ???

toCharArray là tách string thanh một mảng các char 
 */


 /*
kiểu dữ liệu nguyên thủy với kiểu tham chiếu
String kiểu tham chiếu 

  */