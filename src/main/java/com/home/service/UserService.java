package com.home.service;

import com.home.model.User;
import com.home.repository.UserRepository;
import com.home.service.exception.BalanceException;
import com.home.service.exception.UserNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getBalance(int getBalance) {
        return userRepository.findById(getBalance)
                .orElseThrow(UserNotFoundException::new);
    }

    public User takeMoney(int id, int balance) {
        User oldUser = getBalance(id);
        if (oldUser.getBalance() != id) {
            if (oldUser.getBalance() >= balance) {
                balance = oldUser.getBalance() - balance;
                oldUser.setBalance(balance);
            } else {
                throw new BalanceException();
            }
        } else {
            throw new UserNotFoundException();
        }
        return userRepository.save(oldUser);
    }

    public User putMoney(int id, int balance) {
        User oldUser = getBalance(id);
        if (oldUser.getBalance() != id) {
            balance = oldUser.getBalance() + balance;
            oldUser.setBalance(balance);
        } else {
            throw new UserNotFoundException();
        }
        return userRepository.save(oldUser);
    }
}
