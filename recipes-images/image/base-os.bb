SUMMARY = "Base OS image for Bachelor Project"
DESCRIPTION = "Base OS image for Bachelor Project"

# Sets the base OS from which a custom image is build
require recipes-core/images/core-image-minimal.bb

# Basic Libraries
IMAGE_INSTALL += "libstdc++ mtd-utils glibc"
IMAGE_INSTALL += "openssh openssl openssh-sftp-server"

# Installing swupdate
# needed to only setup the basic framework ; the .swu file contains all other needed information.
IMAGE_INSTALL += "swupdate"

# Installing custom startup script
IMAGE_INSTALL += "startup"

