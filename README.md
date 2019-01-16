## Robot framework testing study

This proof-of-concept shows how to integrate custom Groovy keywords in a Robot environment and how to make external Robot libraries available in this maven environment.

### Run

Execute Robot tests: `mvn integration-test`

### Content 

See `src/test/robotframework/acceptance` for Robot test suites.

### To Do

- Integrating existing external Robot libraries such as RestInstance doesn't work, yet.
- Remove classic Spring Boot unit test, which is always executed when running `mvn integration-test`, too. Removal is only cosmetic.

### Details

This project is based on a two components:
- simple example Spring Boot project, created as maven project with Groovy (and no additional dependencies) from https://start.spring.io/
- combined with Robot's maven plugin https://github.com/robotframework/MavenPlugin

