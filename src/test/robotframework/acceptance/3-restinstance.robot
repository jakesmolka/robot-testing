*** Settings ***
Documentation   Test Suite to show how to import and call the RESTinstance library.
...             To add external libraries to this maven setup, download the tarball from pypi.org, extract it to $project.basedir/src/test/resources/robotframework/libraries (see https://robotframework.org/MavenPlugin/examples/seleniumlibrary.html).
...             Continue like the library was installed with pip.
Library  REST  http://echo.jsontest.com

*** Test Cases ***
simpleRequest
    GET  /framework/robot-framework/api/rest
    Object  response body
    String  response body api  rest
    String  response body framework  robot-framework