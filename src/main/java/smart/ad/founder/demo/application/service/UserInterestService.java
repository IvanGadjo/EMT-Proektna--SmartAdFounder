package smart.ad.founder.demo.application.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import smart.ad.founder.demo.application.repo.UserInterestRepo;
import smart.ad.founder.demo.domain.model.entities.UserInterest;

@Service
@Transactional

public class UserInterestService {
    UserInterestRepo userInterestRepo;

    public UserInterest makeNewUserInterest()
}
