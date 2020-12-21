package smart.ad.founder.demo.application.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import smart.ad.founder.demo.application.repo.FoundAdvertsRepo;
import smart.ad.founder.demo.application.repo.UserInterestsRepo;
import smart.ad.founder.demo.application.repo.UsersRepo;
import smart.ad.founder.demo.application.service.UserInterestsService;
import smart.ad.founder.demo.domain.model.entities.FoundAdvert;
import smart.ad.founder.demo.domain.model.entities.User;
import smart.ad.founder.demo.domain.model.entities.UserInterest;

import java.util.List;
import java.util.Objects;

@Service
@Transactional

public class UserInterestsServiceImpl implements UserInterestsService {

    UserInterestsRepo userInterestsRepo;
    UsersRepo usersRepo;
    FoundAdvertsRepo foundAdvertsRepo;

    public UserInterestsServiceImpl(UserInterestsRepo userInterestsRepo, UsersRepo usersRepo,
                                    FoundAdvertsRepo foundAdvertsRepo) {
        this.userInterestsRepo = userInterestsRepo;
        this.usersRepo = usersRepo;
        this.foundAdvertsRepo = foundAdvertsRepo;
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
    public UserInterest editUserInterest(UserInterest newUserInterest, Long userId, Long foundAdvertId) {
        User theUser = usersRepo.findById(userId);
        newUserInterest.setUser(theUser);

        FoundAdvert theFoundAd = null;
        if(foundAdvertId != null)
            theFoundAd = foundAdvertsRepo.findById(foundAdvertId);

        newUserInterest.setFoundAdvert(theFoundAd);

        return userInterestsRepo.editUserInterest(newUserInterest);
    }

    @Override
    public UserInterest addNewUserInterest(UserInterest userInterest, Long userId, Long foundAdvertId) {
        User theUser = usersRepo.findById(userId);
        userInterest.setUser(theUser);

        FoundAdvert theFoundAd = null;
        if(foundAdvertId != null)
            theFoundAd = foundAdvertsRepo.findById(foundAdvertId);

        userInterest.setFoundAdvert(theFoundAd);

        return userInterestsRepo.saveNewUserInterest(userInterest);
    }

    @Override
    public void deleteUserInterestById(Long id) {
        userInterestsRepo.deleteById(id);
    }

}
