package com.dave.mycompany.data;

import com.dave.mycompany.model.Product;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Node {
    Product data;
    List<Node> children = new ArrayList<>();

    public Node(Product data){
        this.data = data;
    }

    public void addChildren(Node node){
        this.children.add(node);
    }
}
