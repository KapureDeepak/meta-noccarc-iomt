# Copyright (C) 2022, Noccarc Robotics - All Rights Reserved
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

#SUMMARY = "RSA and password authentication"
#DEPENDS = "systemd"
#LICENSE = "MIT"
#LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# There is no distro feature just for audit.
CONFIG_FILE = "config"
AUTH_FILE = "authorized_keys"
ID_RSA_FILE = "id_rsa"
SSHD_FILE = "sshd_config"

SRC_URI += " \
    file://${ID_RSA_FILE} \
    file://${AUTH_FILE}	\
    file://${CONFIG_FILE} \
    "   
#file://${SSHD_FILE} \
#    "

do_install_append() {
	
    install -d ${D}/home/root/.ssh/
    install -m 755 ${WORKDIR}/${CONFIG_FILE} ${D}/home/root/.ssh/
    install -m 600 ${WORKDIR}/${ID_RSA_FILE} ${D}/home/root/.ssh/
    install -m 600 ${WORKDIR}/${AUTH_FILE} ${D}/home/root/.ssh/

}

FILES_${PN} = "/home/root/.ssh/ ${sysconfdir}/ssh/"
