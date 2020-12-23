package smart.ad.founder.demo.web;

import org.springframework.web.bind.annotation.*;
import smart.ad.founder.demo.application.service.UserInterestsService;
import smart.ad.founder.demo.application.service.rest.RestService;
import smart.ad.founder.demo.domain.model.entities.FoundAdvert;
import smart.ad.founder.demo.domain.model.entities.UserInterest;
import smart.ad.founder.demo.domain.model.valueObjects.Keywords;

import javax.websocket.server.PathParam;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/userInterests")
@CrossOrigin("*")

public class UserInterestsController {

    UserInterestsService userInterestsService;
    RestService restService;

    public UserInterestsController(UserInterestsService userInterestsService, RestService restService) {
        this.userInterestsService = userInterestsService;
        this.restService = restService;
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
    public UserInterest editUserInterest(@RequestBody UserInterest newUserInterest,
                                         @RequestParam Long userId) {
        return userInterestsService.editUserInterest(newUserInterest,  userId);
    }

    @PostMapping("/createUserInterest")
    public UserInterest createUserInterest(@RequestBody UserInterest userInterest,
                                           @RequestParam Long userId) {
        return userInterestsService.addNewUserInterest(userInterest, userId);
    }




    @DeleteMapping("/{id}")
    public void deleteUserInterest(@PathVariable("id") Long id) {
        userInterestsService.deleteUserInterestById(id);
    }



    // TESTING REST SERVICE
    @GetMapping("/test/reklama5")
    public List<FoundAdvert> testReklama5() throws IOException {

        List<String> okwrds = new ArrayList<>();
        okwrds.add("Sandero");
        okwrds.add("Dajtenok");

        Keywords keywords = new Keywords("Dacia", okwrds);
        return restService.getAdsUrls_reklama5(keywords);
    }
}
