package smart.ad.founder.demo.application.service;

import smart.ad.founder.demo.domain.model.entities.UserInterest;

import java.util.List;

public interface UserInterestsService {

    List<UserInterest> findAllUserInterests();

    UserInterest findUserInterestById(Long id);

    UserInterest editUserInterest(UserInterest newUserInterest, Long userId, Long foundAdvertId);

    UserInterest addNewUserInterest(UserInterest userInterest, Long userId, Long foundAdvertId);

    void deleteUserInterestById(Long id);
}
