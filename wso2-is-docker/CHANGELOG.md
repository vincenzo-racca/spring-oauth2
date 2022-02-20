# Changelog

All notable changes to Docker and Docker Compose resources for WSO2 Identity and Management version `5.11.x`
in each resource release, will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/).

## [v5.11.0.9] - 2022-01-20

### Changed
- Remove redundant jdk11 docker image directory.

## [v5.11.0.8] - 2021-12-13

### Changed
- Add alpine, ubuntu and centos dockerfiles to dockerfiles directory for backward comfortability.  

## [v5.11.0.6] - 2021-11-17

### Changed
- Change folder structure of dockerfile locations and introduced separate images for jdk8 and jdk11 (refer to [issue](https://github.com/wso2/docker-is/issues/306)


## [v5.11.0.5] - 2021-08-16

### Changed
- Upgrade base docker image to fix the detected high security vulnerability. (refer to [issue](https://github.com/wso2/docker-is/issues/299)

## [v5.11.0.3] - 2021.07.16

### Changed

- Update kubernetes common version.

## [v5.11.0.2] - 2021.06.03

### Changed

- Update Docker OS base image.

## [v5.11.0.1] - 2020.12.03

### Added

- Docker resources of WSO2 Identity Server version `5.11.0` for Alpine, CentOS and Ubuntu (refer to [issue](https://github.com/wso2/docker-is/issues/238))

### Removed

- Avoid packaging MySQL JDBC Driver in Identity Server Docker images (refer to [issue](https://github.com/wso2/docker-is/issues/242))

For detailed information on the tasks carried out during this release, please see the GitHub milestone
[v5.11.0.1](https://github.com/wso2/docker-is/milestone/22).

[v5.11.0.1]: https://github.com/wso2/docker-is/compare/v5.10.0.3...v5.11.0.1
[v5.11.0.2]: https://github.com/wso2/docker-is/compare/v5.11.0.1...v5.11.0.2
[v5.11.0.3]: https://github.com/wso2/docker-is/compare/v5.11.0.2...v5.11.0.3
