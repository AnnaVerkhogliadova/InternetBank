package com.home.service;

import com.home.model.Operation;
import com.home.model.User;

import com.home.repository.OperationsRepository;
import com.home.repository.UserRepository;
import com.home.service.exception.BalanceException;
import com.home.service.exception.UserNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Service
@Transactional
public class UserService {
    private final UserRepository userRepository;
    OperationsRepository operationsRepository;

    public UserService(UserRepository userRepository, OperationsRepository operationsRepository) {
        this.userRepository = userRepository;
        this.operationsRepository = operationsRepository;
    }

    public User getBalance(int getBalance) {
        return userRepository.findById(getBalance)
                .orElseThrow(UserNotFoundException::new);
    }

    public User takeMoney(int id, int balance) {
        LocalDate date = LocalDate.now();
        User user = getBalance(id);
        if (user.getId() == id) {
            if (user.getBalance() >= balance) {
                operationsRepository.save(new Operation(id, date, balance,"снятие со счета"));
                balance = user.getBalance() - balance;
                user.setBalance(balance);
            } else {
                throw new BalanceException();
            }
        } else {
            throw new UserNotFoundException();
        }
        return userRepository.save(user);
    }

    public User putMoney(int id, int balance) {
        User user = getBalance(id);
        LocalDate date = LocalDate.now();
        if (user.getId() == id) {
            operationsRepository.save(new Operation(user.getId(), date, balance,"положить на счет"));
            balance = user.getBalance() + balance;
            user.setBalance(balance);
        } else {
            throw new UserNotFoundException();
        }
        return userRepository.save(user);
    }
}
