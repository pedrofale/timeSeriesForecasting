#!/bin/bash

# ok, compile all the source code
mvn -Dmaven.test.skip=true install

# clean-up
ant -f build_package.xml clean

# build the package
ant -f build_package.xml make_package -Dpackage=timeSeriesForecasting

