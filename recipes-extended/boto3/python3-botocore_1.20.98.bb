SUMMARY = "Low-level, data-driven core of boto 3."
HOMEPAGE = "https://github.com/boto/botocore"
AUTHOR = "Amazon Web Services <>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2ee41112a44fe7014dce33e26468ba93"

SRC_URI = "https://files.pythonhosted.org/packages/28/f4/3dc9e36d0b73341f14a5112561f7540fd76f0a692c7dcc83a3be5d7436de/botocore-1.20.98.tar.gz"
SRC_URI[md5sum] = "05798450904b0d3d8fa5db24e2208e85"
SRC_URI[sha256sum] = "b2a49de4ee04b690142c8e7240f0f5758e3f7673dd39cf398efe893bf5e11c3f"

S = "${WORKDIR}/botocore-1.20.98"

RDEPENDS_${PN} = ""

inherit setuptools3
