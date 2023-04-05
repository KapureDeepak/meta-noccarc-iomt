SUMMARY = "Jansson is a C library for encoding, decoding and manipulating JSON data"
SECTION = "libs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=afd92c4cfc08f4896003251b878cc0bf"

SRC_URI = "git://github.com/akheron/jansson.git \
	  "

SRCREV = "e9ebfa7e77a6bee77df44e096b100e7131044059"

S = "${WORKDIR}/git"

inherit autotools pkgconfig

FILES_${PN} += "${libdir}/libjansson.so.* \
		"

FILES_${PN}-dev += "${includedir}/jansson.h \
                    ${includedir}/jansson_config.h \
                    ${libdir}/libjansson.so \
                    ${libdir}/libjansson.la \
