*** Settings ***
Documentation   Test Suite to show how to test a REST API with Groovy.
...             The Groovy class has to be imported as library as "package.name.ClassName".
...             When executing, the class has to be complied and in path to be available to Robot, which is handled by mavens goals in this case.
Library  com.example.testing.GroovyRestTests

*** Test Cases ***
Test Robot Groovy Combination
  Testing Rest Api With Groovy