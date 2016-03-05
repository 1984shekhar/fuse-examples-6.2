#!/bin/sh

# prebuild.sh
#

#
# Build Variables
#
RELEASE_VERSION=$1

# Set the version number in pom.xml
xmlstarlet edit -L -u "/_:project/_:version" -v "$RELEASE_VERSION" pom.xml