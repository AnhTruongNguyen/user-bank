package userbank.demo.service;

import org.springframework.stereotype.Service;
import userbank.demo.model.Bank;
import userbank.demo.model.User;

import java.util.List;

@Service
public interface UserBankService {
    List<User> listUser();
    List<Bank> listBank();
    String updateUser(User user);
    String createUser(User user);
    String createBank(Bank bank);
    String updateBank(Bank bank);
    String deleteUser(Long id);
    String deleteBank(Long id);
}
