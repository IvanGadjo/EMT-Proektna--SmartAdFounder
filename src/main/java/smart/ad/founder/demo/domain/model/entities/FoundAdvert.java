package smart.ad.founder.demo.domain.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "foundAdverts")
@Getter

//@JsonIgnoreProperties(ignoreUnknown = true)           // indicates that any properties not bound in this type should be ignored
public class FoundAdvert {

    @Version
    private Long version;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ad_urls")
    private String url;

//    @ManyToOne(fetch = FetchType.EAGER)
//    private UserInterest userInterest;
    @OneToMany(mappedBy = "foundAdvert", fetch = FetchType.EAGER)
    private List<UserInterest> userInterests;

    @SuppressWarnings("unused")
    public FoundAdvert() {

    }

    public FoundAdvert(String url) {
        this.url = url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUserInterest(List<UserInterest> userInterests) {
        this.userInterests = userInterests;
    }
}
