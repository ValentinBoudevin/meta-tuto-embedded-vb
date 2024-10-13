inherit kernel

SRC_URI:append = " file://bcm2711-rpi-4-b-custom.dts \
    file://bcm2711-rpi-4-b-custom-arm64.dts \
    file://bcm2711-rpi-4-b-overlay-led.dts \
    "

FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

KCONFIG_MODE = "alldefconfig"

do_configure:prepend() {
    cp ${WORKDIR}/bcm2711-rpi-4-b-custom.dts ${S}/arch/arm/boot/dts
    cp ${WORKDIR}/bcm2711-rpi-4-b-custom-arm64.dts ${S}/arch/arm64/boot/dts/broadcom/bcm2711-rpi-4-b-custom.dts
}