package ss16.bai_tap.bai_1_save_file_binary.product_mvc.service;

import ss16.bai_tap.bai_1_save_file_binary.product_mvc.model.Product;
import ss16.bai_tap.bai_1_save_file_binary.product_mvc.repository.IRepository;
import ss16.bai_tap.bai_1_save_file_binary.product_mvc.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements  IProductService{
    private static Scanner scanner = new Scanner(System.in);
    private static IRepository productRepository= new ProductRepository();
    @Override
    public void displayAll() {
        List<Product> productList= productRepository.getAll();
        for (Product p: productList) {
            System.out.println(p);
        }
    }

    @Override
    public void addProduct() {
        String id;
        int price;
        while (true){
            System.out.println("Nhập mã sản phẩm bạn muốn thêm");
             id = scanner.nextLine();
            Product checkId= productRepository.getById(id);
            if(checkId!=null){
                System.out.println("Mã sản phẩm đã tồn tại");
            }else {
                break;
            }
        }
        System.out.println("Nhập tên sản phẩm");
        String name= scanner.nextLine();
        while (true){
            try {
                System.out.println("Nhập giá");
                 price=Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException numberFormatException){
                System.out.println("Vui lòng nhập đúng giá trị");
            }
        }
        System.out.println("Nhập hãng sản xuất");
        String origin= scanner.nextLine();
        System.out.println("Nhập mô tả cho sản phẩm");
        String describe = scanner.nextLine();
        Product product= new Product(id,name,price,origin,describe);
        productRepository.addProduct(product);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void removeProduct() {
        System.out.println("Nhập mã sản phẩm bạn muốn xóa");
        String id= scanner.nextLine();
        Product product=productRepository.getById(id);
        if(product==null){
            System.out.println("Mã sản phẩm không tồn tại");
        }else {
            System.out.println("Bạn có chắc muốn xóa sản phẩm này không");
            System.out.println("1. Yes");
            System.out.println("2. No");
        }
        while (true){
            try {
                int choice= Integer.parseInt(scanner.nextLine());
                if(choice==1){
                    productRepository.removeProduct(product);
                    System.out.println("Xóa thành công");
                    break;
                }
                break;
            }catch (NumberFormatException numberFormatException){
                System.out.println("Vui lòng nhập số");
            }
        }

    }

    @Override
    public void searchInfo() {
        System.out.println("Nhập tên sản phẩm cần tìm kiếm");
        String name=scanner.nextLine().toLowerCase();
        List<Product>products=productRepository.search(name);
        for (Product p :products) {
            System.out.println(p);
        }
    }
}
