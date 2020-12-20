package smart.ad.founder.demo.domain.model.entities;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "foundAdverts")
@Getter


public class FoundAdvert {

    @Version
    private Long version;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ad_urls")
    private String url;

    @ManyToOne(fetch = FetchType.EAGER)
    private UserInterest userInterest;

    @SuppressWarnings("unused")
    public FoundAdvert() {

    }

    public FoundAdvert(String url) {
        this.url = url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUserInterest(UserInterest userInterest) {
        this.userInterest = userInterest;
    }
}
