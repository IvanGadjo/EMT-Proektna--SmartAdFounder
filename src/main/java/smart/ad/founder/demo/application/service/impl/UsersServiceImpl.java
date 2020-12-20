package smart.ad.founder.demo.application.service.impl;

import org.springframework.stereotype.Service;
import smart.ad.founder.demo.application.repo.UsersRepo;
import smart.ad.founder.demo.application.service.UsersService;
import smart.ad.founder.demo.domain.model.entities.User;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    UsersRepo usersRepo;



    @Override
    public List<User> findAllUsers() {
        return null;
    }

    @Override
    public User findUserById(Long id) {
        return null;
    }

    @Override
    public User editUser(User newUser) {
        return null;
    }

    @Override
    public User createNewUser(User foundAdvert) {
        return null;
    }

    @Override
    public void deleteUserById(Long id) {

    }
}
