package smart.ad.founder.demo.application.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import smart.ad.founder.demo.application.repo.UserInterestRepo;
import smart.ad.founder.demo.application.service.UserInterestService;
import smart.ad.founder.demo.domain.model.entities.UserInterest;

import java.util.List;

@Service
@Transactional

public class UserInterestServiceImpl implements UserInterestService {

    UserInterestRepo userInterestRepo;

    public UserInterestServiceImpl(UserInterestRepo userInterestRepo) {
        this.userInterestRepo = userInterestRepo;
    }

    @Override
    public List<UserInterest> findAllUserInterests() {
        return userInterestRepo.findAll();
    }

    @Override
    public UserInterest findUserInterestById(Long id) {
        return userInterestRepo.findById(id);
    }

    @Override
    public UserInterest editUserInterest(UserInterest newUserInterest) {
        return userInterestRepo.editUserInterest(newUserInterest);
    }

    @Override
    public UserInterest addNewUserInterest(UserInterest userInterest) {
        return userInterestRepo.saveNewUserInterest(userInterest);
    }

    @Override
    public void deleteUserInterestById(Long id) {
        userInterestRepo.deleteById(id);
    }

}
