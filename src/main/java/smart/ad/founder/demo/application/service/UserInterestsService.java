package smart.ad.founder.demo.application.service;

import smart.ad.founder.demo.domain.model.entities.UserInterest;

import java.util.List;

public interface UserInterestsService {

    List<UserInterest> findAllUserInterests();

    UserInterest findUserInterestById(Long id);

    UserInterest editUserInterest(UserInterest newUserInterest, Long userId);

    UserInterest addNewUserInterest(UserInterest userInterest, Long userId);

    void deleteUserInterestById(Long id);
}
