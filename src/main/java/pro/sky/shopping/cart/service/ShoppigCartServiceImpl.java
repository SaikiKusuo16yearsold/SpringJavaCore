package pro.sky.shopping.cart.service;

import org.springframework.stereotype.Service;
import pro.sky.shopping.cart.model.ShoppingCart;

import java.util.List;
import java.util.Set;

@Service
public class ShoppigCartServiceImpl implements ShoppigCartService {
    private final ShoppingCart shoppingCart;

    public ShoppigCartServiceImpl(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public void addProduct(List<Integer> shoppingCarts) {
        shoppingCart.addProduct(shoppingCarts);
    }

    @Override
    public Set<Integer> getShoppingCatrs() {
        return shoppingCart.getShopingCatrs();
    }
}
