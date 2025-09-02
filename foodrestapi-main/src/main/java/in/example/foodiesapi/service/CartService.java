package in.adityachaple.foodiesapi.service;

import in.adityachaple.foodiesapi.io.CartRequest;
import in.adityachaple.foodiesapi.io.CartResponse;

public interface CartService {

    CartResponse addToCart(CartRequest request);

    CartResponse getCart();

    void clearCart();

    CartResponse removeFromCart(CartRequest cartRequest);
}
