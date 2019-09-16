package dao;

import entity.Product;

import java.util.List;

/** Author - Damir_Valeev Created on 9/13/2019*/
public interface ProductDao {
  List<Product> getAllProduct();

  void addProduct(Product product);

  void updateProduct(Product product);

  void removeProduct(int id);

  Product getProduct(int id);
}
