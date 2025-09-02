package in.adityachaple.foodiesapi.service;

import in.adityachaple.foodiesapi.io.UserRequest;
import in.adityachaple.foodiesapi.io.UserResponse;

public interface UserService {

    UserResponse registerUser(UserRequest request);

    String findByUserId();
}
