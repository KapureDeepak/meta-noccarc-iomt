SUMMARY = "An Amazon S3 Transfer Manager"
HOMEPAGE = "https://github.com/boto/s3transfer"
AUTHOR = "Amazon Web Services <kyknapp1@gmail.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b1e01b26bacfc2232046c90a330332b3"

SRC_URI = "https://files.pythonhosted.org/packages/27/90/f467e516a845cf378d85f0a51913c642e31e2570eb64b352c4dc4c6cbfc7/s3transfer-0.4.2.tar.gz"
SRC_URI[md5sum] = "a6771f1bbff440e3c7f550357c3e5ee1"
SRC_URI[sha256sum] = "cb022f4b16551edebbb31a377d3f09600dbada7363d8c5db7976e7f47732e1b2"

S = "${WORKDIR}/s3transfer-0.4.2"

RDEPENDS_${PN} = ""

inherit setuptools3
