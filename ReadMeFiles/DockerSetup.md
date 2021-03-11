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
	-e  : will take an options (input)
	
	---- creates a mysql container with the port number
	docker run -eMYSQL_ROOT_PASSWORD=root -it -d -p 1000:3306 mysql
	    -p is on which port you want to run
	    1000 is in which port you want to run 
	    3306 if 1000 port is not available then it will use 3306
	
	docker run --help will give you list of options like IP, Port etc.
	
    
    We can create many container from an image
    Ex : 
    root@hydlpt144:/home/kishore/CodeBase/repos/SpringBootModules# docker run -eMYSQL_ROOT_PASSWORD=root -p 1000:3306 --ip 192.168.56.130 -it -d  mysql
    2edfd1813c6c2cbe3c036e504b32bd3c347b5b24592c1bb117e04e46c5f4dc87
    root@hydlpt144:/home/kishore/CodeBase/repos/SpringBootModules# docker run -eMYSQL_ROOT_PASSWORD=root -p 1000:3306 --ip 192.168.56.131 -it -d  mysql
    09f3d637a34482ea32db933e6e4366a6e7e01bed41b0d14d4df0493fc3938e7d
    docker: Error response from daemon: driver failed programming external connectivity on endpoint priceless_sammet (a1f68e35ef989f7b6762b7a9e2375612e5977e3bd8960562213c831695fd6eaf): Bind for 0.0.0.0:1000 failed: port is already allocated.
    root@hydlpt144:/home/kishore/CodeBase/repos/SpringBootModules# docker run -eMYSQL_ROOT_PASSWORD=root -p 1000:3306 --ip 192.168.56.132 -it -d  mysql
    eafbae71826182f7a69d97ff4a99f76fc6fe258ad3b2e5f761d9593dcbde309b
    docker: Error response from daemon: driver failed programming external connectivity on endpoint youthful_khayyam (b439359bc61c6093d9797519eba2075bc1a6bd7fec95e68b75542bf56869cca7): Bind for 0.0.0.0:1000 failed: port is already allocated.
    root@hydlpt144:/home/kishore/CodeBase/repos/SpringBootModules# docker run -eMYSQL_ROOT_PASSWORD=root -p 1001:3306 --ip 192.168.56.132 -it -d  mysql
    b8d569f208838bc5be344113b83c8a44685aef1a526574d190bb4852a64ae5f6
    root@hydlpt144:/home/kishore/CodeBase/repos/SpringBootModules# docker run -eMYSQL_ROOT_PASSWORD=root -p 1003:3306 --ip 192.168.56.133 -it -d  mysql
    8e8854ac8dcd5a507d6ad0c6be2bb18a2b6a5e2404dd357126f80fbcc0b4c68a


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