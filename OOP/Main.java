import ex_1.model.Adress;
import ex_1.model.Teacher;

public class Main {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.input();
//        System.out.println(student.toString());

        // Tạo mảng Student
//        int n = 3;
//        Student[] arrStudents = new Student[n];
//        for (int i= 0; i < arrStudents.length; i++){
//            System.out.println("Nhập thông tin học viên thứ " + (i + 1));
//            arrStudents[i] = new Student();
//            arrStudents[i].input();
//        }
//
//        System.out.println("Thông tin học viên");
//        for (Student arrStudent : arrStudents) {
//            System.out.println(arrStudent.toString());
//        }

        // ArrayList
//        ArrayList<String> listName = new ArrayList<>();
//        listName.add("Nguyen");
//        listName.add("Huyen");
//        listName.add("Hoan");
//
//        for (String s: listName) {
//            System.out.println(s);
//        }
//        listName.add("Ngoc");
//        boolean isCheck = listName.contains("Ngoc");
//        System.out.println("Có tìm thấy Ngoc ko: " + isCheck);
//        System.out.println("Ngọc nằm ở index: " + listName.indexOf("Ngoc"));
//
//        System.out.println("Phần tử ở index 3: " + listName.get(3));
//
//        listName.remove("Huyen");
//        listName.remove(1);
//        System.out.print("Danh sách sau khi xóa: ");
//        for (String s: listName){
//            System.out.print(s + " ");
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập số lượng học sinh: ");
//        int size = Integer.parseInt(sc.nextLine());
//
//        ArrayList<Student> listStudents = new ArrayList<>();
//
//        //listStudents.add(new Student(1, "Huyen", 8, 9, "TMU"));
//
//        for(int i = 0; i < size; i++){
//            Student student = new Student();
//            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1));
//            student.input();
//            listStudents.add(student);
//        }
//
//        System.out.println("Danh sách các sinh viên");
//        for (Student student: listStudents){
//            System.out.println(student);
//        }
//
//        System.out.print("Nhập tên muốn tìm kiếm: ");
//        String name = sc.nextLine();
//
//        for (int i = 0; i < size; i++){
//            if(listStudents.get(i).getTen().equalsIgnoreCase(name)){
//                System.out.println(listStudents.get(i));
//                listStudents.remove(i);
//            }
//        }
//        System.out.println("Danh sách sau khi xóa ");
//        for (Student s: listStudents){
//            System.out.println(s.toString());
//        }


//        // Teacher extend Person
//        ArrayList<Teacher> list = new ArrayList<>();
//        list.add(new Teacher("Nguyen Hy", 20, "Ha Noi", 12000));
//
//        for(Teacher t: list){
//            System.out.println(t);
//        }
//
//        Teacher teacher = new Teacher("Toan", 25, "HCM", 13000);
//
//        teacher.study();
//        teacher.sleep();


        // Student extend Person
//        ArrayList<Student> listStudent = new ArrayList<>();
//        listStudent.add(new Student("Nguyen", 21, "Ha Noi", 10, 8));

        // add class Address
        Adress adress = new Adress("Trung Van", "Ha Noi", "Viet Nam");
        Teacher teacher = new Teacher("Nguyen", 25, adress, 10000);
        System.out.println(teacher.toString());

    }

}
