JFLAGS = -Xlint:unchecked
JC = javac
JVM = java

SOURCES = $(wildcard src/o6167656e74323431/stupidjava/*.java)
CLASSES = $(SOURCES:.java=.class)

all: $(CLASSES)

%.class: %.java
	javac $(JFLAGS) $<
