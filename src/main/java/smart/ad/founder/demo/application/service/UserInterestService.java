package smart.ad.founder.demo.application.service;

import smart.ad.founder.demo.domain.model.entities.UserInterest;

import java.util.List;

public interface UserInterestService  {

    List<UserInterest> findAllUserInterests();

    UserInterest findUserInterestById(Long id);

    UserInterest editUserInterest(UserInterest newUserInterest);

    UserInterest addNewUserInterest(UserInterest userInterest);

    void deleteUserInterestById(Long id);
}
