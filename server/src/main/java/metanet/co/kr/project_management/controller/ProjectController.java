package metanet.co.kr.project_management.controller;

import lombok.AllArgsConstructor;
import metanet.co.kr.project_management.repository.ProjectRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ProjectController {
    private ProjectRepository projRepo;

//    @PostMapping("/createproject")

}
