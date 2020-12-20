package smart.ad.founder.demo.application.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import smart.ad.founder.demo.application.repo.UserInterestsRepo;
import smart.ad.founder.demo.application.service.UserInterestsService;
import smart.ad.founder.demo.domain.model.entities.UserInterest;

import java.util.List;

@Service
@Transactional

public class UserInterestsServiceImpl implements UserInterestsService {

    UserInterestsRepo userInterestsRepo;

    public UserInterestsServiceImpl(UserInterestsRepo userInterestsRepo) {
        this.userInterestsRepo = userInterestsRepo;
    }

    @Override
    public List<UserInterest> findAllUserInterests() {
        return userInterestsRepo.findAll();
    }

    @Override
    public UserInterest findUserInterestById(Long id) {
        return userInterestsRepo.findById(id);
    }

    @Override
    public UserInterest editUserInterest(UserInterest newUserInterest) {
        return userInterestsRepo.editUserInterest(newUserInterest);
    }

    @Override
    public UserInterest addNewUserInterest(UserInterest userInterest) {
        return userInterestsRepo.saveNewUserInterest(userInterest);
    }

    @Override
    public void deleteUserInterestById(Long id) {
        userInterestsRepo.deleteById(id);
    }

}
