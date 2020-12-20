package smart.ad.founder.demo.application.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import smart.ad.founder.demo.application.repo.UsersRepo;
import smart.ad.founder.demo.application.service.UsersService;
import smart.ad.founder.demo.domain.model.entities.User;

import java.util.List;

@Service
@Transactional
public class UsersServiceImpl implements UsersService {

    UsersRepo usersRepo;

    public UsersServiceImpl(UsersRepo usersRepo) {
        this.usersRepo = usersRepo;
    }

    @Override
    public List<User> findAllUsers() {
        return usersRepo.findAll();
    }

    @Override
    public User findUserById(Long id) {
        return usersRepo.findById(id);
    }

    @Override
    public User editUser(User newUser) {
        return usersRepo.editUser(newUser);
    }

    @Override
    public User createNewUser(User user) {
        return usersRepo.createNewUser(user);
    }

    @Override
    public void deleteUserById(Long id) {
        usersRepo.deleteById(id);
    }
}
