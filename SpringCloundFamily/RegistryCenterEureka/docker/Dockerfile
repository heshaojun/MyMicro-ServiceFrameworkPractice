FROM jdk:1.8
ENV PROJECT_NAME RegistryCenterEureka
ENV PROJECT_PATH /opt/java/project/MyMicro-ServiceFrameworkPractice/SpringCloundFamily
ENV PROJECT_GIT https://github.com/heshaojun/MyMicro-ServiceFrameworkPractice.git
ADD clone_and_start.sh /bin/
RUN ["chmod","+x","/bin/clone_and_start.sh"]
RUN ["nohub","java","-jar","$PROJECT_PATH/target/$PROJECT_NAME.jar"]
WORKDIR /opt/java/project
RUN ["mkdir","logs"]
VOLUME /opt/java/project
EXPOSE 8761