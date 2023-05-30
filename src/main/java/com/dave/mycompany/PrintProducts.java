package com.dave.mycompany;

import com.dave.mycompany.data.Node;
import com.dave.mycompany.model.Product;
import com.dave.mycompany.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class PrintProducts {
    private final ProductService productService;
    public void createTree() {


        Node root = new Node(Product.builder().productName("root").build());

        Node milk = new Node(Product.builder().productName("milk").build());
        Node eggs = new Node(Product.builder().productName("eggs").build());

        root.addChildren(milk);
        root.addChildren(eggs);
        List<Product> products = productService.getAll();
        for (Product product : products) {
            Node myProduct = new Node(product);
            if (product.getCategory().equals("dairy")) {
                milk.addChildren(myProduct);
            }
            if (product.getCategory().equals("eggs")) {
                eggs.addChildren(myProduct);
            }

        }
        printData(root);
    }

    public void printData(Node root){
        if(root.getChildren().size() == 0){
            return;
        }
        for (Node child : root.getChildren()) {
            System.out.println(child.getData());
            printData(child);
        }
    }
}
