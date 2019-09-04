xDrone

To run the project in docker:

1. Run "sh setup.sh" in scripts directory
1.1. In case of error:
 - try to run commands from the file manually one by one
 - check if the TOMCAT_URL is valid in "tomcat_insall_script.sh"
2. Run "docker-compose up -d"
3. Open browser and go to "localhost:8080"
3.1 To stop it, run "docker-compose stop"

To run the project locally:
1. Open the project in eclipse
2. Run "ServerLaucher.xtend" from directory "ic.ac.uk.xdrone.web.src"
