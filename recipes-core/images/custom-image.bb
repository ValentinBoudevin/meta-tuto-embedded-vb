include recipes-core/images/core-image-base.bb

COMPATIBLE_MACHINE = "^rpi$"

IMAGE_INSTALL:append = " packagegroup-rpi-test"
IMAGE_INSTALL:append = " nano"

IMAGE_FEATURES += " ssh-server-openssh"
CORE_IMAGE_EXTRA_INSTALL = " dhcpcd init-ifupdown"

INHERIT += "extrausers"

#MDP user:user root:root
EXTRA_USERS_PARAMS += "usermod  -p '\$5\$3/LBno27DA2Ry08M\$4MgLHUlu7LQKsuVwXbRzFZ1C2z43yYa0l3pZuJSSxb/' root;"
