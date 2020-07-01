package metanet.co.kr.project_management.entity;

import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Setter
@Entity
@Table(name = "users")
public class User extends BaseEntity {
    @Column
    private String password;

    @Column
    private String username;

    @Column
    private String fullname;
}
