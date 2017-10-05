#!/bin/bash


for p in `ps -ef | grep 11211 | awk '{print $2}'`; do 
	kill -9 $p; 
done;

echo "memcached killed ..."
