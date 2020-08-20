#!/bin/bash
echo maven offline mode. mvn -o,--offline *goal* or  mvn -o -llr *goal*      where llr stands for --legacy-local-repository 
mvn -o install
