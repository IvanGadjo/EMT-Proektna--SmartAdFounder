package smart.ad.founder.demo.web;

import org.springframework.web.bind.annotation.*;
import smart.ad.founder.demo.application.service.UserInterestsService;
import smart.ad.founder.demo.domain.model.entities.UserInterest;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/api/userInterests")
@CrossOrigin("*")

public class UserInterestsController {

    UserInterestsService userInterestsService;

    public UserInterestsController(UserInterestsService userInterestsService) {
        this.userInterestsService = userInterestsService;
    }

    @GetMapping("/all")
    public List<UserInterest> getAllUserInterests() {
        return userInterestsService.findAllUserInterests();
    }

    @GetMapping("/{id}")
    public UserInterest getUserInterestById(@PathVariable("id") Long id) {
        return userInterestsService.findUserInterestById(id);
    }

    @PatchMapping("/editUserInterest")
    public UserInterest editUserInterest(@RequestBody UserInterest newUserInterest) {
        return userInterestsService.editUserInterest(newUserInterest);
    }

    @PostMapping("/createUserInterest")
    public UserInterest createUserInterest(@RequestBody UserInterest userInterest) {
        return userInterestsService.addNewUserInterest(userInterest);
    }

    @DeleteMapping("/{id}")
    public void deleteUserInterest(@PathVariable("id") Long id) {
        userInterestsService.deleteUserInterestById(id);
    }
}
