include recipes-core/images/core-image-base.bb

COMPATIBLE_MACHINE = "^rpi$"

IMAGE_INSTALL:append = " packagegroup-rpi-test"
IMAGE_INSTALL:append = " nano"

LICENSE_FLAGS_ACCEPTED = "commercial"

IMAGE_FEATURES += " ssh-server-openssh"
CORE_IMAGE_EXTRA_INSTALL = " dhcpcd init-ifupdown"
