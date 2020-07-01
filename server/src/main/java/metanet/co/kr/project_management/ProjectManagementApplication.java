package metanet.co.kr.project_management;

import metanet.co.kr.project_management.entity.Project;
import metanet.co.kr.project_management.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Map;

@SpringBootApplication
public class ProjectManagementApplication {



    public static void main(String[] args) {
//        SpringApplication.run(ProjectManagementApplication.class, args);
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("metanet");

        EntityManager entityManager = managerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
//        Project prj = new Project();
        User user = new User();
        user.setId(1);
        user.setFullname("Thu Tran");
        user.setPassword("123");
        user.setUsername("mthu");
//        prj.setName("Test Project");
//        prj.setOwner(user);

        entityManager.persist(user);
//        entityManager.persist(prj);

        transaction.commit();

    }

}
