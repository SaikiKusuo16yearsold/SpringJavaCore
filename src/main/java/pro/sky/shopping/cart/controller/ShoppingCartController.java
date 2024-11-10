package pro.sky.shopping.cart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.shopping.cart.service.ShoppigCartService;


import java.util.List;
import java.util.Set;

@RestController
public class ShoppingCartController {
    private final ShoppigCartService shoppingCartServiceImpl;

    public ShoppingCartController(ShoppigCartService shoppingCartServiceImpl) {
        this.shoppingCartServiceImpl = shoppingCartServiceImpl;
    }

    @GetMapping(path = "/add")
    public List<Integer> addProducts(@RequestParam List<Integer> products) {
        shoppingCartServiceImpl.addProduct(products);
        return products;
    }

    @GetMapping(path = "/get")
    public Set<Integer> getProducts(){
        return shoppingCartServiceImpl.getShoppingCatrs();
    }

}
