# [tgfx](https://github.com/hugoam/tgfx)

tgfx is a full-feature mid-level rendering library built on top of [bgfx](https://github.com/bkaradzic/bgfx)  
it is part of the encompassing [two](https://github.com/hugoam/two) library 

![styles](media/samples0.gif?raw=true)

# building
two is built with [GENie](https://github.com/bkaradzic/GENie) build system, which is based on premake and consists of a bunch of lua scripts. The GENie binaries needed by two for windows and linux are included for convenience in the `bin` folder.  
To get a headstart and build tgfx you should clone this repository, and run GENie which will generate projects for two libraries and for the examples.

The build instructions for linux and gcc look like:
- `git clone --recursive https://github.com/hugoam/tgfx`
- `cd tgfx`
- for linux (make):
  - `bin/linux/genie --gcc=linux-gcc gmake`
  - `cd build/projects/gmake-linux`
  - `make config=debug64 -j8`
- for osx (make): `bin/darwin/genie --gcc=osx gmake`
- for osx (xcode): `bin/darwin/genie --xcode=osx xcode9`
- for windows (visual studio): `bin/windows/genie vs2017`
