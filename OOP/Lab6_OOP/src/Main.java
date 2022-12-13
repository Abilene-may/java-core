import bai6.controller.Bai6Controller;

public class Main {
    public static void main(String[] args) {
//        //        === BAI 1 ===
//        HinhChuNhat hinhChuNhat = new HinhChuNhat();
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Chieu dai: ");
//        double length = Double.parseDouble(scanner.nextLine());
//        hinhChuNhat.setLength(length);
//        System.out.print("Chieu rong: ");
//        double width = Double.parseDouble(scanner.nextLine());
//        hinhChuNhat.setWidth(width);
//        System.out.println("Chu vi = " + hinhChuNhat.ChuVi());
//        System.out.println("Dien tich = " + hinhChuNhat.DienTich());


          //       === BAI 2 ===
//        Scanner sc = new Scanner(System.in);
//        int soLuong = 2;
//        SinhVien[] sv = new SinhVien[soLuong];
//        for(int i = 0 ; i < soLuong; i++ ){
//            sv[i] = new SinhVien();
//            sv[i].nhap();
//        }
//
//        for(int i = 0; i < soLuong; i++){
//            System.out.println(sv[i].toString());
//            System.out.println("Tổng kết : " + sv[i].tongKet(sv[i].getThongTinTinChi()));
//            System.out.println("Xếp loại : " + sv[i].xepLoai(sv[i].tongKet(sv[i].getThongTinTinChi())));
//        }

            //  strem().sorted()
//        List<SinhVien> sinhVienList = List.of(sv);
//        var list = sinhVienList.stream()
//                .sorted((o1, o2) -> o1.xepLoai(o1.tongKet(o1.getThongTinTinChi()))
//                .compareTo(o2.xepLoai(o2.tongKet(o2.getThongTinTinChi()))))
//                .collect(Collectors.toList());
//
//        System.out.println(list);

//        List<HinhChuNhat> hinhChuNhats = new ArrayList<>();
//        hinhChuNhats.add(new HinhChuNhat(1,2));
//        hinhChuNhats.add(new HinhChuNhat(3,2));
//        hinhChuNhats.add(new HinhChuNhat(2,4));
//
//        List<HinhChuNhat> hinhChuNhats1 = hinhChuNhats.stream()
//                .sorted((hcn1, hcn2) -> (int) (hcn1.getLength() - hcn2.getLength()))
//                .collect(Collectors.toList());
//
//        System.out.println(hinhChuNhats1);

//        SinhVienService service = new SinhVienService();
//        SinhVien newSinhVien = service.createSinhVien();
//        System.out.println(newSinhVien);

//        HinhChuNhat hinhChuNhat = new HinhChuNhat(4,5);
//        System.out.println(service.tinhDienTich(hinhChuNhat));


            //      === BAI 3 ===
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Number of student: ");
//        int n = sc.nextInt();
//        sc.nextLine();
//        StudentService studentService = new StudentService();
//        List<Student> student = new ArrayList<>();
//
//        for (int i = 0; i < n; i++){
//            System.out.println("Student " + (i + 1));
//            student.add(studentService.addStudent());
//            System.out.println(" ");
//        }
//
//        System.out.println("=== List students ===");
//        for (Student s: student){
//            System.out.println(s);
//        }
//
//        List<Student> studentList = student.stream().sorted().collect(Collectors.toList());

//
        //  === BAI 4 ===
//        HomeController controller = new HomeController();
//        controller.homeController();

        // === BAI 5 ===
//        HomeControllerBai5 controllerBai5 = new HomeControllerBai5();
//        controllerBai5.homeControllerBai5();

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số phần tử mảng ");
//
//        try {
//            int size = sc.nextInt();
//            int[] arrNumber = new int[size];
//        }catch (NegativeArraySizeException e1){
//            System.out.println("Kích thức mảng là một số dương");
//        }catch (InputMismatchException e2){
//            System.out.println("Kích thước mảng phải là số ");
//        }

        Bai6Controller bai6Controller = new Bai6Controller();
        bai6Controller.homeControllerBai6();
    }


}