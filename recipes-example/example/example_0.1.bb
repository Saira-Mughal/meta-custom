SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Custom application" 
SECTION = "examples" 
LICENSE = "CLOSED" 
PR = "r0" 

SRC_URI = "https://github.com/waqqas/Catch2GMockDemo.git;protocol=https;tag=v0.1"

S = "${WORKDIR}/git"

inherit pkgconfig cmake

do_compile() {

	oe_runmake

}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 custom ${D}${bindir}
}
