package Lesson1;

import java.util.List;

public class LearnString {
    public static void main(String[] args) {
        String str = "You only live once, but if you do it right, once is enough";

         //!for each vs for -> index   
        
        int count = 1;
        // CÁCH 1 FOR 
        for(int i=0; i<str.length();i++){
            if(str.charAt(i) == ' '){

                count++;
            }
        }
        System.out.println("Số từ trong chuỗi là: " + count);

// Đếm và in ra index của các ký tự o
        int countO =0;
        System.out.print("Vi tri cua ca ky tu o la: ");
        for(int i=0; i<str.length();i++){
            if(str.charAt(i) == 'o'){
                countO++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\n So cac ky tu o co trong chuoi: " + countO);

        //CÁCH 2  FOR EACH
        int i =1;
        for(char chuoi: str.toCharArray()){
            if(chuoi == ' '){
                i++;
            }
        }
        System.out.println("So tu trong chuoi: " + i);

        //Cách 3
        //! arr.split -> String[] -> đưa 1 chuỗi về 1 mảng

        // String[] sotu = str.split(" ");
        System.out.println(str.split(" ").length);
    }
}

// Cho chuỗi sau : You only live once, but if you do it right, once is enough

// Thực hiện:

// Đếm số từ trong chuỗi

/*
For each và for -> index
equal giống nhau , contains : chứa java chứa ja(giá trị truyền vào)
String thì string.length() String là 1 mảng các ký tự 
List thì dùng .size()
List.add(e) thêm e vào list
list.get(i) lấy giá trị vị trí thứ i
list.indexOf(e) lấy index của e
Array thì dùng .length
splist tách chuỗi thành 1 mảng theo ký tự chuyền vào
List một danh sách 

 */