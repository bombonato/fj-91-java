#!/bin/bash
echo "haproxy deve estar instalado, apt-get install haproxy"
haproxy -f haproxy-non-sticky.conf && echo "haproxy running ... [non-sticky]" 

