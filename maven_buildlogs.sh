#!/bin/bash
echo build logs to text file example. mvn *your parameters* --log-file,l log.txt
mvn --log-file  firstMethodLog.txt
mvn -l secondMethodLog.txt
