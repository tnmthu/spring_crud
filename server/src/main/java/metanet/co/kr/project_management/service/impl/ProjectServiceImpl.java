package metanet.co.kr.project_management.service.impl;

import metanet.co.kr.project_management.dto.BaseDto;
import metanet.co.kr.project_management.dto.ProjectDto;
import metanet.co.kr.project_management.entity.Project;
import metanet.co.kr.project_management.service.ProjectService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProjectServiceImpl implements ProjectService {
    private static List<ProjectDto> DB = new ArrayList<>();

    @Override
    public int createProject(int id, ProjectDto project) {
        DB.add(new ProjectDto(id, project.getName()));
        return 1;
    }

    @Override
    public List<ProjectDto> getProjectList() {
        return DB;
    }

    @Override
    public ProjectDto getProjectById() {
        return null;
    }

    @Override
    public Optional<ProjectDto> selectProjectById(int id) {
        return DB.stream()
                .filter(project -> project.getId() == id)
                .findFirst();
    }

    @Override
    public int deleteProjectById(int id) {
        Optional<ProjectDto> projectTemp = selectProjectById(id);
        if (projectTemp == null) {
            return 0;
        }
        DB.remove(projectTemp.get());
        return 1;
    }

    @Override
    public int updateProjectById(int id, ProjectDto newProject) {
        return selectProjectById(id)
                .map(project -> {
                    int indexOfProjectUpdate = DB.indexOf(project);
                    if (indexOfProjectUpdate >= 0) {
                        DB.set(indexOfProjectUpdate, new ProjectDto(id, newProject.getName()));
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }

    @Override
    public BaseDto create(BaseDto dto) {
        return null;
    }

    @Override
    public BaseDto update(BaseDto dto) {
        return null;
    }
}
