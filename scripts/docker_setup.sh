#! /bin/sh

sudo apt-get update
sudo apt-get -y update

sudo apt-get remove --purge docker docker-engine docker.io
sudo add-apt-repository \
    "deb [arch=amd64] https://download.docker.com/linux/ubuntu \
    $(lsb_release -cs) \
    stable"
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -
sudo apt-get update
sudo apt-get install -y docker-ce

sudo groupadd docker
sudo gpasswd -a $USER docker
newgrp docker

sudo curl -L "https://github.com/docker/compose/releases/download/1.24.0/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose
sudo chmod +x /usr/local/bin/docker-compose
sudo apt install -y docker-compose

docker pull ros:kinetic-robot
docker build -t xdrone .
#docker run --name xdrone-cont -dit xdrone
docker-compose up -d
