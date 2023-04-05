FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

DEFCONFIG_FILE = "noccarc_ccimx8_defconfig"

SRC_URI += " file://linux-dey-src.inc \
	     file://${DEFCONFIG_FILE} \
	   "
KERNEL_DEFCONFIG = "${DEFCONFIG_FILE}"
