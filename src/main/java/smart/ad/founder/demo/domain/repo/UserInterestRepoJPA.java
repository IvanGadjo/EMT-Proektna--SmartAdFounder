package smart.ad.founder.demo.domain.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import smart.ad.founder.demo.application.repo.UserInterestRepo;
import smart.ad.founder.demo.domain.model.entities.UserInterest;

public interface UserInterestRepoJPA extends JpaRepository<UserInterest, Long> {
}
