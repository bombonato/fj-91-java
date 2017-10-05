#!/bin/sh
haproxy -f haproxy-sticky.conf && echo "haproxy running ... [sticky]" 

