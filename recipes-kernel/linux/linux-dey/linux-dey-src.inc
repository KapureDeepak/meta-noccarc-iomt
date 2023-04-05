LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

LOCALVERSION = "-dey"
SRCBRANCH = "V730i_linux_iomt"
SRCREV = "${AUTOREV}"

# Select internal or Github Linux repo
LINUX_GIT_URI = "git://github.com/Noccarc/linux_iomt.git;protocol=https"

SRC_URI = "${LINUX_GIT_URI};branch=${SRCBRANCH}"

S = "${WORKDIR}/git"
