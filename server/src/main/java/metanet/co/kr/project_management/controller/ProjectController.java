package metanet.co.kr.project_management.controller;

import lombok.AllArgsConstructor;
import metanet.co.kr.project_management.dto.ProjectDto;
import metanet.co.kr.project_management.repository.ProjectRepository;
import metanet.co.kr.project_management.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class ProjectController {
    private ProjectRepository projRepo;

    @GetMapping("/test")
    public String test() {
        return "test";
    }

}
