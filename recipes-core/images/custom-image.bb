include recipes-core/images/core-image-base.bb

IMAGE_INSTALL:append = " packagegroup-rpi-test"
IMAGE_INSTALL:append = " nano"

IMAGE_FEATURES += " ssh-server-openssh"
CORE_IMAGE_EXTRA_INSTALL = " dhcpcd init-ifupdown"

inherit extrausers

# root:root & user:user
EXTRA_USERS_PARAMS += " usermod -p '\$6\$QyDfbtf0bY.rQ5eA\$aS0trGH/SikXyUh8Oeqy7xfaDQ4.uaxF31axsd6g3qjn1TCiscih2Uer9QhKSgxaEfs6Iq4MzlCexvqRjKHo11' root;"
EXTRA_USERS_PARAMS += " useradd -p '\$6\$TCkukmsVBbMm6QRq\$wZt/QAyawB/21CmmMoHvqJTSheXPjAsqKLXcrO1rxX6NgohGPT2sph4Q..pXDw688WPr58FPUyyctTnpBP331/' user;"