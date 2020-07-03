package metanet.co.kr.project_management.service;

import metanet.co.kr.project_management.dto.ProjectDto;

import metanet.co.kr.project_management.entity.Project;
import metanet.co.kr.project_management.repository.ProjectRepo;

public interface ProjectService extends BaseService<ProjectDto, Project, ProjectRepo> {
}