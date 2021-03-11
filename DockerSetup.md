Check docker is installed or not, if not install docker	then check 

	service docker status
    ● docker.service - Docker Application Container Engine
       Loaded: loaded (/lib/systemd/system/docker.service; enabled; vendor preset: enabled)
       Active: active (running) since Tue 2021-03-09 17:38:48 IST; 1 day 17h ago
         Docs: https://docs.docker.com
     Main PID: 2415 (dockerd)
        Tasks: 29

Check what is the version of docker you are using 
	
	docker version
	    Client:
         Version:           19.03.6
         API version:       1.40
         Go version:        go1.12.17
         Git commit:        369ce74a3c
         Built:             Fri Dec 18 12:21:44 2020
         OS/Arch:           linux/amd64
         Experimental:      false
        
        Server:
         Engine:
          Version:          19.03.6
          API version:      1.40 (minimum version 1.12)
          Go version:       go1.12.17
          Git commit:       369ce74a3c
          Built:            Thu Dec 10 13:23:49 2020
          OS/Arch:          linux/amd64
          Experimental:     false
         containerd:
          Version:          1.3.3-0ubuntu1~18.04.4
          GitCommit:        
         runc:
          Version:          spec: 1.0.1-dev
          GitCommit:        
         docker-init:
          Version:          0.18.0
          GitCommit:        

	        
How to start Docker

	service docker start

How to stop Docker
    
    service docker stop
    

How to pull Docker images from docker hub
	
	docker pull ubuntu
	docker pull {any image name}

Create a container from an image

	docker run -it -d ubuntu
	-it : interactive mode 
	-d  : detached mode
docker container create <image_name> <tag>

See list of docker containers

	docker ps      : It will show only active containers
	docker ps -a  : will show all containers

How to access a container

	docker exec -it <containerid> bash
	containerid will be seen by executing docker ps -a

How to stop container 

	docker stop <containerid>
	This command will stops the container gracefully
	
	docker kill <container id>
	This command will kills the container forcefully

Login docker from local machine

	docker login
	If you face any issues while login use this (sudo apt install gnupg2 pass) to by pass 


Commit new image

	docker commit 0b37903c1497 kisshore19/ubuntusample
	docker commit <conatainer id> <username/imagename>	

Push changes to hub

	docker push <username/image name>
	docker commit kisshore19/ubuntusample

List all local docker images
 
	docker images

Delete container
 
	docker rm <container id>
	docker rm b94477a57c07

Delete image
 
	docker rmi <image-id>