SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Custom application" 
SECTION = "examples" 
LICENSE = "CLOSED" 
PR = "r0" 

SRC_URI = "gitsm://github.com/waqqas/Catch2GMockDemo.git;protocol=https"
SRCREV = "c0714f912d499ad33234f5a9becb451b0170cc0b"

S = "${WORKDIR}/git"

inherit cmake

RPROVIDES_${PN} = "demo"

FILES_${PN} += "${bindir}"

do_install() {
        install -d ${D}${bindir}
        install -m 0755 demo ${D}${bindir}
}
