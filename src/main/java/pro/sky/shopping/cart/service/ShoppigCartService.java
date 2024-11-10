package pro.sky.shopping.cart.service;

import java.util.List;
import java.util.Set;

public interface ShoppigCartService {
    void addProduct(List<Integer> shoppingCarts);

    Set<Integer> getShoppingCatrs();
}
