package com.example.store.service;

import com.example.store.domain.Perfume;
import com.example.store.domain.Review;
import com.example.store.domain.User;
import graphql.schema.DataFetcher;

import java.util.List;

public interface UserService {

    User findUserById(Long userId);

    User findUserByEmail(String email);

    DataFetcher<List<User>> getAllUsersByQuery();

    DataFetcher<User> getUserByQuery();

    List<User> findAllUsers();

    List<Perfume> getCart(List<Long> perfumeIds);

    User updateProfile(String email, User user);

    Perfume addReviewToPerfume(Review review, Long perfumeId);
}
