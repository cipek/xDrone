FROM ros:kinetic-robot 

#SUDO
RUN apt-get update && \
      apt-get -y install sudo

#RUN useradd -m docker && echo "docker:docker" | chpasswd && adduser docker sudo

#USER docker

#JAVA
RUN apt-get update && \
	apt-get install -y git && \
	apt-get install -y ros-kinetic-ardrone-autonomy && \
	apt-get install -y ant && \
	apt-get install -y wget && \
	apt-get install -y software-properties-common && \
	sudo add-apt-repository ppa:openjdk-r/ppa && \
	apt-get clean;

# Fix certificate issues
RUN apt-get update && \
	sudo apt-get install -y openjdk-8-jdk && \
	apt-get install ca-certificates-java && \
	apt-get clean && \
	update-ca-certificates -f;

# Setup JAVA_HOME -- useful for docker commandline
ENV JAVA_HOME /usr/lib/jvm/java-1.8.0-openjdk-amd64
RUN export JAVA_HOME

COPY tomcat_install_script.sh /tomcat-install-script.sh
RUN ["chmod", "+x", "tomcat-install-script.sh"]
RUN /tomcat-install-script.sh

RUN ls

WORKDIR /xdrone

COPY xdrone-deploy.sh /xdrone/xdrone-deploy.sh
RUN ls
RUN ["chmod", "+x", "xdrone-deploy.sh"]

WORKDIR /opt/tomcat/8_0/webapps
RUN ["rm", "-rf", "ROOT.war"]
RUN ["rm", "-rf", "ROOT"]
COPY ROOT.war /opt/tomcat/8_0/webapps/ROOT.war

WORKDIR /

EXPOSE 8080

#ENTRYPOINT ["/usr/bin/init"]
#CMD ["systemctl"]
