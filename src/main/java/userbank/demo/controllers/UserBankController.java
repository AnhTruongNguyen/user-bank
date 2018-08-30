package userbank.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import userbank.demo.dto.BankDTO;
import userbank.demo.dto.UserDTO;
import userbank.demo.model.Bank;
import userbank.demo.model.User;
import userbank.demo.service.UserBankService;

import java.util.List;

@Controller
public class UserBankController {

    @Autowired
    private UserBankService userBankService;

    @GetMapping(value = "/user")
    public @ResponseBody List<UserDTO> getUsers() {
        return userBankService.getUsers();
    }

    @PostMapping(value = "/user")
    public @ResponseBody String createUser(@RequestBody UserDTO userDTO) {
        userBankService.createUser(userDTO);
        return "OK";
    }

    @PutMapping(value = "/user")
    public @ResponseBody String updateUser(@RequestBody UserDTO userDTO) {
        userBankService.updateUser(userDTO);
        return "OK";
    }

    @DeleteMapping(value = "/user/{id}")
    public @ResponseBody String removeUser(@PathVariable(value = "id") Long id) {
        userBankService.removeUser(id);
        return "OK";
    }

    @GetMapping(value = "/bank")
    public @ResponseBody List<BankDTO> getBanks() {
        return userBankService.getBanks();
    }

    @PostMapping(value = "/bank")
    public @ResponseBody String addBank(@RequestBody BankDTO bankDTO) {
        userBankService.addBank(bankDTO);
        return "OK";
    }

    @PutMapping(value = "/bank")
    public @ResponseBody String updateBank(@RequestBody BankDTO bankDTO) {
        userBankService.updateBank(bankDTO);
        return "OK";
    }

    @DeleteMapping(value = "/bank/{id}")
    public @ResponseBody String removeBank(@PathVariable(value = "id") Long id) {
        userBankService.removeBank(id);
        return "OK";
    }
}
