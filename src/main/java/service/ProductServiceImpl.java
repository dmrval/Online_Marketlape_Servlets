package service;

import dao.ProductDao;
import entity.Product;

import java.util.List;

/** Author - Damir_Valeev Created on 9/13/2019 */
public class ProductServiceImpl implements ProductService {

  ProductDao productDao;

  @Override
  public List<Product> getAllProduct() {
    return productDao.getAllProduct();
  }

  @Override
  public void addProduct(Product product) {
    productDao.addProduct(product);
  }

  @Override
  public void updateProduct(Product product) {
    productDao.updateProduct(product);
  }

  @Override
  public void removeProduct(int id) {
    productDao.removeProduct(id);
  }

  @Override
  public Product getProduct(int id) {
    return productDao.getProduct(id);
  }
}
