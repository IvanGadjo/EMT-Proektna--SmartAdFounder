package smart.ad.founder.demo.application.service;

import smart.ad.founder.demo.domain.model.entities.UserInterest;

import java.io.IOException;
import java.util.List;

public interface UserInterestsService {

    List<UserInterest> findAllUserInterests();

    UserInterest findUserInterestById(Long id);

    UserInterest editUserInterest(UserInterest newUserInterest, Long userId) throws IOException;

    UserInterest addNewUserInterest(UserInterest userInterest, Long userId) throws IOException;

    void deleteUserInterestById(Long id);
}
