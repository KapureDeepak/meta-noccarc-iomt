# Copyright (C) 2022, Noccarc Robotics - All Rights Reserved

SUMMARY = "Network config Service"
DEPENDS = "systemd"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

MOUNT_BASENAME = "network-config"
NM_CONFIG_SCRIPT = "50-ethtool-autoneg-off"
ETH0_NM_FILE = "nm.eth0.v730i"
WLAN0_NM_FILE = "nm.wlan0.v730i"

SRC_URI = " \
    file://${MOUNT_BASENAME}.service    \
    file://${MOUNT_BASENAME}.sh         \
    file://${ETH0_NM_FILE}              \
    file://${WLAN0_NM_FILE}             \ 
    file://${NM_CONFIG_SCRIPT}          \
    "

inherit systemd 

SYSTEMD_SERVICE_${PN} = "${MOUNT_BASENAME}.service"
SYSTEMD_AUTO_ENABLE_${PN} = "enable"

do_install() {
   
    #Systemd scripts
    install -d ${D}${sysconfdir}/scripts
    install -d ${D}${systemd_unitdir}/system
    install -m 644 ${WORKDIR}/${MOUNT_BASENAME}.service ${D}/${systemd_unitdir}/system    
    install -m 755 ${WORKDIR}/${MOUNT_BASENAME}.sh ${D}/${sysconfdir}/scripts
    
    #Network manager scripts
    install -d ${D}${sysconfdir}/NetworkManager/dispatcher.d/
    install -d ${D}${sysconfdir}/NetworkManager/system-connections/
    install -m 0755 ${WORKDIR}/${ETH0_NM_FILE} ${D}${sysconfdir}/NetworkManager/system-connections/
    install -m 0755 ${WORKDIR}/${WLAN0_NM_FILE} ${D}${sysconfdir}/NetworkManager/system-connections/
    install -m 0755 ${WORKDIR}/${NM_CONFIG_SCRIPT} ${D}${sysconfdir}/NetworkManager/dispatcher.d/
}

RDEPENDS_${PN} += "bash"

FILES_${PN} += "${systemd_unitdir} ${sysconfdir}/scripts ${sysconfdir}/NetworkManager/system-connections/ ${sysconfdir}/NetworkManager/dispatcher.d/"
