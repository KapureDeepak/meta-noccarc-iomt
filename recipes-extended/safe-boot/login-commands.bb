# Copyright (C) 2022, Noccarc Robotics - All Rights Reserved

SUMMARY = "730i Login commands"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SOM_COMMAND = "som-login"
IOMT_COMMAND = "iomt-shutdown"

SRC_URI = " \
    file://${SOM_COMMAND}         \
    file://${IOMT_COMMAND}         \
    "

do_install() {

    install -d ${D}${sbindir}/
    install -m 755 ${WORKDIR}/${SOM_COMMAND} ${D}${sbindir}/
    install -m 755 ${WORKDIR}/${IOMT_COMMAND} ${D}${sbindir}/

}

RDEPENDS_${PN} += "bash"

FILES_${PN} += "${sbindir}/"
