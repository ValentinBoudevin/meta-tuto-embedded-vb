do_install:append(){
    install -d ${D}{sysconfdir}/ssh/sshd_config.d/
    echo "AllowUsers fdi root" >> ${D}{sysconfdir}/ssh/sshd_config.d/fdi.conf
}