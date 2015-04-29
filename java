#!/bin/bash
yum install -y java-1.6.0
echo "installed"
update-alternatives --set java /usr/lib/jvm/jre-1.6.0-openjdk.x86_64/bin/java
