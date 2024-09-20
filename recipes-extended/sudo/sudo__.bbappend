do_install:append(){
    install -d ${D}{sysconfdir}/sudoers.d/
    echo "fdi ALL=(ALL:ALL) ALL" >> ${D}{sysconfdir}/sudoers.d/fdi
}