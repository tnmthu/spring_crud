package metanet.co.kr.project_management.controller;

import metanet.co.kr.project_management.dto.ProjectDto;
import metanet.co.kr.project_management.service.BaseService;
import metanet.co.kr.project_management.service.ProjectService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class ProjectController extends BaseController<ProjectDto, ProjectService> {

    public ProjectController(ProjectService service) {
        super(service);
    }

    @Override
    public ProjectDto add(@RequestBody ProjectDto projectDto) {
        System.out.println(projectDto);
        return super.add(projectDto);
    }

    @Override
    public ProjectDto update(@PathVariable("id") Long id, @RequestBody ProjectDto dto) {
        return super.update(id, dto);
    }
}
