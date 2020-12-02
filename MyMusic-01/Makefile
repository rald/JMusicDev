MyMusic.dex: MyMusic.class
	dx --dex --output=MyMusic.dex MyMusic.class

MyMusic.class: MyMusic.java
	ecj -cp .:../jMusic/jMusic1.6.5.jar:../jMusic/inst MyMusic.java

.PHONY: clean,run,play

run: MyMusic.dex
	dalvikvm -cp .:../jMusic/jMusic1.6.5.dex:../jMusic/inst/SimpleSampleInst.dex:MyMusic.dex MyMusic

play: MyMusic.mid
	play-audio MyMusic.mid

clean:
	rm MyMusic.mid MyMusic.class MyMusic.dex

