package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        // TODO: A modifier

        List<User> usersApi = apiService.getUsers();
        return usersApi;

        // return null;
    }

    public void generateRandomUser() {
        // TODO: A modifier

        apiService.generateRandomUser();

    }

    public void deleteUser(User user) {
        // TODO: A modifier

        apiService.deleteUser(user);

    }
}
