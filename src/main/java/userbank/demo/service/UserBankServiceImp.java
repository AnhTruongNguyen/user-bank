package userbank.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import userbank.demo.model.Bank;
import userbank.demo.model.User;
import userbank.demo.repository.BankRepository;
import userbank.demo.repository.UserRepository;

import java.util.List;

@Service
public class UserBankServiceImp implements UserBankService {
    @Autowired
    private UserRepository userRepository;
    private BankRepository bankRepository;

    @Override
    public List<User> listUser() {
        return userRepository.findAll();
    }

    @Override
    public List<Bank> listBank() {
        return bankRepository.findAll();
    }

    @Override
    public String updateUser(User user) {
        userRepository.save(user);
        return "ok";
    }

    @Override
    public String createUser(User user) {
        userRepository.save(user);
        return "ok";
    }

    @Override
    public String createBank(Bank bank) {
        bankRepository.save(bank);
        return "ok";
    }

    @Override
    public String updateBank(Bank bank) {
        bankRepository.save(bank);
        return "ok";
    }

    @Override
    public String deleteUser(Long id) {
        userRepository.deleteById(id);
        return "ok";
    }

    @Override
    public String deleteBank(Long id) {
        bankRepository.deleteById(id);
        return "ok";
    }
}
