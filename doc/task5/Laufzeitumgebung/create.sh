#!/bin/bash

function writeLog() {
        printf "\n$(date): $*"  >> /home/user/log/log.txt
}
function appendLog(){
        printf " - $*" >> /home/user/log/log.txt
}
writeLog "START"

# prepare env
export JAVA_HOME=/home/user/jdk1.8.0_191/

# goto directory
cd /home/user

# delete old files
writeLog "cleaning up old git"
rm -rf ch.bfh.btx8081.w2018.white
appendLog "done"

# get fresh data
writeLog "clone git"
git clone git@github.com:daleth/ch.bfh.btx8081.w2018.white.git
appendLog "done"

# enter folder
cd ch.bfh.btx8081.w2018.white

# compile package
writeLog "compiling war"
mvn compile war:war
appendLog "war created"

#stop tomcat
writeLog "stopping tomcat"
/opt/tomcat/bin/shutdown.sh
appendLog "tomcat stopped"

#delete old tomcat files
writeLog "delete old tomcat files"
rm -rf /opt/tomcat/webapps/*
appendLog "files deleted"

# send new war
writeLog "deploying .war"
cp /home/user/ch.bfh.btx8081.w2018.white/target/typer-1.0-SNAPSHOT.war /opt/tomcat/webapps/ROOT.war
appendLog "done"

# restart jetty
writeLog "restarting tomcat"
/opt/tomcat/bin/startup.sh
appendLog "tomcat started"
writeLog "FINISHED\n\n"






