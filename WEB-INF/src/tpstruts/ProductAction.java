package tpstruts;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import tpstruts.javabeans.Product;
import tpstruts.modele.ProductModel;

import java.util.List;

public class ProductAction extends ActionSupport implements Preparable, ModelDriven {

    private Product product;
    private List<Product> listProducts;
    private int idCurrentProduct;

    /**
     * Override the ActionSupport's method. Do this when showing a page.
     *
     * @throws Exception Actually doesn't.
     */
    public void prepare() throws Exception {
        // When creating, create a new empty object
        if (idCurrentProduct == 0) {
            product = new Product();
        }
        // When editing, send back information about the object
        else {
            product = ProductModel.getProduct(idCurrentProduct);
        }
    }

    /*---------------------*/
    /* GETTERS AND SETTERS */
    /*---------------------*/

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Product> getListProducts() {
        return listProducts;
    }

    public void setListProducts(List<Product> listProducts) {
        this.listProducts = listProducts;
    }

    public int getIdCurrentProduct() {
        return idCurrentProduct;
    }

    public void setIdCurrentProduct(int idCurrentProduct) {
        this.idCurrentProduct = idCurrentProduct;
    }

    public Object getModel() {
        return product;
    }

    /*-----------*/
    /* FUNCTIONS */
    /*-----------*/

    // retourner la liste des produits après récupération

    /**
     * List products
     *
     * @return Success
     */
    public String list() {
        listProducts = ProductModel.getListProducts();
        return SUCCESS;
    }

    /**
     * View the product associated to the idCurrentProduct
     *
     * @return Success
     */
    public String view() {
        ProductModel.getProduct(idCurrentProduct);
        return SUCCESS;
    }

    /**
     * Add the product to the list
     *
     * @return Success
     */
    public String add() {
        ProductModel.add(product);
        return SUCCESS;
    }

    /**
     * Show the form for editing the product
     *
     * @return Success
     */
    public String edit() {
        return SUCCESS;
    }

    /**
     * Edit the product
     *
     * @return Success
     */
    public String modify() {
        ProductModel.edit(product);
        return SUCCESS;
    }

    /**
     * Delete the product associated to the idCurrentProduct in the list
     *
     * @return Success
     */
    public String delete() {
        ProductModel.delete(idCurrentProduct);
        return SUCCESS;
    }
}
