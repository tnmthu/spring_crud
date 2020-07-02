package metanet.co.kr.project_management.service;

import metanet.co.kr.project_management.dto.ProjectDto;

import java.util.List;
import java.util.Optional;
import metanet.co.kr.project_management.entity.Project;
import metanet.co.kr.project_management.repository.ProjectRepo;

public interface ProjectService extends BaseService<ProjectDto, Project, ProjectRepo> {
//
//public interface ProjectService extends BaseService {
//    int createProject(int id, ProjectDto project);
//    int updateProjectById(int id, ProjectDto project);
//    List<ProjectDto> getProjectList();
//    ProjectDto getProjectById();
//    Optional<ProjectDto> selectProjectById(int id);
//    int deleteProjectById(int id);
}