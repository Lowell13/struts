package tpstruts.modele;

import tpstruts.javabeans.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductModel {

    private static List<Product> listProducts;
    private static int idProduct = 1;

    static {
        listProducts = new ArrayList<>();
        listProducts.add(new Product(idProduct++, "Pain", 0.99));
        listProducts.add(new Product(idProduct++, "Piles", 9.99));
        listProducts.add(new Product(idProduct++, "Enceintes", 99.99));
        listProducts.add(new Product(idProduct++, "Television", 999.99));
    }

    public ProductModel() {
    }

    /*---------------------*/
    /* GETTERS AND SETTERS */
    /*---------------------*/

    public static List<Product> getListProducts() {
        return listProducts;
    }

    public static void setListProducts(List<Product> listProducts) {
        ProductModel.listProducts = listProducts;
    }

    /*-----------*/
    /* FUNCTIONS */
    /*-----------*/

    /**
     * Add a product to the list
     *
     * @param product Produit to add
     */
    public static void add(Product product) {
        product.setIdProduct(idProduct++);
        listProducts.add(product);
    }

    /**
     * Delete a product in the list
     *
     * @param idProduct Product's ID to delete
     */
    public static void delete(int idProduct) {
        for (Product p : listProducts) {
            if (p.getIdProduct() == idProduct) {
                listProducts.remove(p);
                break;
            }
        }
    }

    /**
     * Edit a product in the list
     *
     * @param product Product to edit
     */
    public static void edit(Product product) {
        Product p = getProduct(product.getIdProduct());
        if (p != null) {
            p.setName(product.getName());
            p.setPrice(product.getPrice());
        }
    }

    /**
     * Find a product in the list
     *
     * @param idProduct Product's ID to find
     * @return Product, or null if not find
     */
    public static Product getProduct(int idProduct) {
        for (Product p : listProducts) {
            if (p.getIdProduct() == idProduct)
                return p;
        }
        return null;
    }
}
