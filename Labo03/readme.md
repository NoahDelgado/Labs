# Labo03 - Run a first container

## Pedagogical intent

In this lab, you'll:

* Get to grips with the first Docker commands,
* Run your first Docker
* Familiarize yourself with port publishing

---

Note: the docker engine must be running

## Task 01 - Get to grips with the first Docker commands

* List all images present on your installation

[INPUT]
```bash
docker images
```

[OUTPUT]
```
$ docker images
REPOSITORY   TAG       IMAGE ID   CREATED   SIZE
```

* Get the official Nginx image using this command

[INPUT]
```bash
docker pull nginx
```

[OUTPUT]
```
Using default tag: latest
latest: Pulling from library/nginx
09f376ebb190: Pull complete
a11fc495bafd: Pull complete
933cc8470577: Pull complete
999643392fb7: Pull complete
971bb7f4fb12: Pull complete
45337c09cd57: Pull complete
de3b062c0af7: Pull complete
Digest: sha256:a484819eb60211f5299034ac80f6a681b06f89e65866ce91f356ed7c72af059c
Status: Downloaded newer image for nginx:latest
docker.io/library/nginx:latest

What's Next?
  View a summary of image vulnerabilities and recommendations → docker scout quickview nginx
```

Note : do you see the different layer uploaded ?

* List -again- all image present on your installation

[INPUT]
```bash
docker images
```

[OUTPUT]
```
$ docker images
REPOSITORY   TAG       IMAGE ID       CREATED       SIZE
nginx        latest    e784f4560448   2 weeks ago   188MB
```

Note : 188 MB is the size of your image... check it.

* List -again- all image present on your installation

[INPUT]
```bash
docker images
```

[OUTPUT]
```
//TODO
```

* List all Docker

[INPUT]
```
docker ps -a
```

[OUTPUT]
```
$ docker ps -a
CONTAINER ID   IMAGE     COMMAND   CREATED   STATUS    PORTS     NAMES
```

## Task 02 - Run the container

* Run Nginx Docker

[INPUT]
```
docker run nginx
```

[OUTPUT]
```
$ docker run nginx
/docker-entrypoint.sh: /docker-entrypoint.d/ is not empty, will attempt to perform configuration
/docker-entrypoint.sh: Looking for shell scripts in /docker-entrypoint.d/
/docker-entrypoint.sh: Launching /docker-entrypoint.d/10-listen-on-ipv6-by-default.sh
10-listen-on-ipv6-by-default.sh: info: Getting the checksum of /etc/nginx/conf.d/default.conf
10-listen-on-ipv6-by-default.sh: info: Enabled listen on IPv6 in /etc/nginx/conf.d/default.conf
/docker-entrypoint.sh: Sourcing /docker-entrypoint.d/15-local-resolvers.envsh
/docker-entrypoint.sh: Launching /docker-entrypoint.d/20-envsubst-on-templates.sh
/docker-entrypoint.sh: Launching /docker-entrypoint.d/30-tune-worker-processes.sh
/docker-entrypoint.sh: Configuration complete; ready for start up
2024/05/23 08:41:53 [notice] 1#1: using the "epoll" event method
2024/05/23 08:41:53 [notice] 1#1: nginx/1.25.5
2024/05/23 08:41:53 [notice] 1#1: built by gcc 12.2.0 (Debian 12.2.0-14)
2024/05/23 08:41:53 [notice] 1#1: OS: Linux 5.15.146.1-microsoft-standard-WSL2
2024/05/23 08:41:53 [notice] 1#1: getrlimit(RLIMIT_NOFILE): 1048576:1048576
2024/05/23 08:41:53 [notice] 1#1: start worker processes
2024/05/23 08:41:53 [notice] 1#1: start worker process 29
2024/05/23 08:41:53 [notice] 1#1: start worker process 30
2024/05/23 08:41:53 [notice] 1#1: start worker process 31
2024/05/23 08:41:53 [notice] 1#1: start worker process 32
2024/05/23 08:41:53 [notice] 1#1: start worker process 33
2024/05/23 08:41:53 [notice] 1#1: start worker process 34
2024/05/23 08:41:53 [notice] 1#1: start worker process 35
2024/05/23 08:41:53 [notice] 1#1: start worker process 36
2024/05/23 08:41:53 [notice] 1#1: start worker process 37
2024/05/23 08:41:53 [notice] 1#1: start worker process 38
2024/05/23 08:41:53 [notice] 1#1: start worker process 39
2024/05/23 08:41:53 [notice] 1#1: start worker process 40
2024/05/23 08:41:53 [notice] 1#1: start worker process 41
2024/05/23 08:41:53 [notice] 1#1: start worker process 42
2024/05/23 08:41:53 [notice] 1#1: start worker process 43
2024/05/23 08:41:53 [notice] 1#1: start worker process 44
```

* Can you reach the default page of nginx

Note : By default, Nginx is listening on port 80

[INPUT]
```
curl localhost
```

[OUTPUT]
```
//TODO
```

* Stop this first attempt

[INPUT]
```
docker stop <id>
```

[OUTPUT]
```
//TODO
```

## Task 03 - Familiarize yourself with port publishing

* Make it possible to reach nginx with this command

[Publish a port](https://docs.docker.com/network/#published-ports)

[INPUT]
```
curl localhost:8080
```

[OUTPUT]
```
//TODO
```

* Stop and delete the container

[INPUT]
```
//TODO delete the container
```

[OUTPUT]
```
//TODO
```

* Delete the image

[INPUT]
```
//TODO delete the image
```

[OUTPUT]
```
//TODO
```
