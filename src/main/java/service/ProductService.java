package service;

import entity.Product;

import java.util.List;

/** Author - Damir_Valeev Created on 9/13/2019 */
public interface ProductService {
  List<Product> getAllProduct();

  void addProduct(Product address);

  void updateProduct(Product address);

  void removeProduct(int id);

  Product getProduct(int id);
}
