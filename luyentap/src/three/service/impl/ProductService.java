package three.service.impl;

import three.model.Product;
import three.reposiory.IProductRepository;
import three.reposiory.impl.ProductRepository;
import three.service.IProductService;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static final Scanner scanner = new Scanner(System.in);
    private static IProductRepository productRepository = new ProductRepository();

    @Override
    public void displayAll() {
        List<Product> productList = productRepository.getAll();
        for (Product str : productList) {
            System.out.println(str);
        }
    }

    @Override
    public void removeProduct() {
        System.out.println("Nhập id bjan muosn xóa");
        String id = scanner.nextLine();
        Product product = productRepository.getById(id);
        if(product==null){
            System.out.println("Mã id không tồn tại");
        }else {
            System.out.println("Bạn có muốn xáo sp này không\n" +
                    "1. Xóa\n" +
                    "2. Không");
            int choice=Integer.parseInt(scanner.nextLine());
            if(choice==1){
                productRepository.removeProduct(product);
                System.out.println("Xóa thành công");
            }
        }
    }

    @Override
    public void addProduct() {
        System.out.println("Nhập id");
        String id = scanner.nextLine();
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập giá");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mô tả");
        String describe = scanner.nextLine();
        Product product = new Product(id, name, price, describe);
        productRepository.addProduct(product);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void searchProduct() {
        System.out.println("Nhập tên bạn muốn tìm");
        String name=scanner.nextLine();
        productRepository.searchProduct(name);
    }
}
