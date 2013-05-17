#!/bin/bash
# vi: set textwidth=0:

version=$(xpath -e '/project/version/text()' pom.xml 2> /dev/null)
rm -rf client-src/
wsdl2java.sh -o client-src/ -uri http://localhost:8080/wsapp/services/Cities?wsdl
cd client-src
ant jar.client
