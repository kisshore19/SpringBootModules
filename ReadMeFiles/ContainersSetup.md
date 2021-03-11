To start spring boot application, we need to identify the what are all requited softwares

    mysql
    cassandra
    kafka
    
If you want to get all the docker images we can refer

    https://hub.docker.com/
    Here you can find all docker images like mysql.
    
    
Creating mysql docker container
   
    Pull mysql docker image
   
      docker pull mysql
      docker pull {image_name} 
      docker run -eMYSQL_ROOT_PASSWORD=root -p 1003:3306 --ip 192.168.56.133 -it -d  mysql
      Below line will be connected from any ip address
      docker run -eMYSQL_ROOT_PASSWORD=root -p 3306:3306 --ip 0.0.0.0 -it -d  mysql    


