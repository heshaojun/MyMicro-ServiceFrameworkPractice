FROM centos
MAINTAINER keepword_heshaojun@hotmail.com
RUN ["yum","install","-y","git"]
RUN ["yum","install","-y","maven"]
RUN ["mkdir","-p","/opt/jdk"]
RUN ["mkdir","-p","/opt/java/project"]
ADD jdk-8u202-linux-x64.tar.gz /opt/jdk/
LABEL version="1.8" description="jdk1.8镜像" by="heshaojun"
ENV PATH /opt/jdk/jdk1.8.0_202/bin:$PATH
WORKDIR /opt/java/project
#CMD ["java","-version"]
