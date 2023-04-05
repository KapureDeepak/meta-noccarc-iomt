# Copyright (C) 2022, Noccarc Robotics - All Rights Reserved

SUMMARY = "730i IOMT FOTA Service"
DEPENDS = "systemd"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

MOUNT_BASENAME = "fota"
TAR_FILE = "FOTA_IMX"

SRC_URI = " \
    file://${MOUNT_BASENAME}.service    \
    file://${TAR_FILE}.tar.gz	\
    "
S = "${WORKDIR}"

INSANE_SKIP_${PN} = "file-rdeps dev-so libdir already-stripped"

INSANE_SKIP_${PN}-dbg += "libdir"

inherit systemd 

SYSTEMD_SERVICE_${PN} = "${MOUNT_BASENAME}.service"
SYSTEMD_AUTO_ENABLE_${PN} = "enable"

do_install() {
    
    install -d ${D}/home/root/${TAR_FILE}
    install -d ${D}${systemd_unitdir}/system
    install -m 644 ${WORKDIR}/${MOUNT_BASENAME}.service ${D}/${systemd_unitdir}/system    
    cd ${WORKDIR}/${TAR_FILE} && find * -type f -exec install -Dm 755 "{}" "${D}/home/root/${TAR_FILE}/{}" \;

}

FILES_${PN} = "/home/root/${TAR_FILE} ${systemd_unitdir}/system"
