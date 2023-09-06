package hellojpa;
import javax.persistence.*;
import java.util.Date;


@Entity
@SequenceGenerator(
        name = "member_seq_generator",
        sequenceName = "member_seq"
        initialValue = 1, allocationSize = 50) //계속 호출하기보단 미리 50개의 사이즈를 db에 올려놓고 메모리상에서 1씩쓴다. -> 동시성 이슈 없이 해결 가능
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "member_seq_generator")
    private Long id;
    @Column(name = "name", nullable = false)
    private String username;
    public Member() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

