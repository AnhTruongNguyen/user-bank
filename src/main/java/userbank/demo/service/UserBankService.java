package userbank.demo.service;

import org.springframework.stereotype.Service;
import userbank.demo.dto.BankDTO;
import userbank.demo.dto.UserDTO;
import userbank.demo.model.Bank;
import userbank.demo.model.User;

import java.util.List;

@Service
public interface UserBankService {
    List<UserDTO> getUsers();

    void createUser(UserDTO userDTO);

    void updateUser(UserDTO userDTO);

    void removeUser(Long id);

    List<BankDTO> getBanks();

    void addBank(BankDTO bankDTO);

    void updateBank(BankDTO bankDTO);

    void removeBank(Long id);
}
