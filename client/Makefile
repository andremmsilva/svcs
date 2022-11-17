JC := javac
EXEC := java
SRC := src
DST := target/classes
MAIN := com.svcs.app.App
JARNAME := prr-core

clean:
	rm -f $$(find $(DST) -name *.class)

compile:
	mkdir -p $(DST)
	$(JC) -d $(DST) $$(find $(SRC) -name *.java)

run:
	$(EXEC) -cp $(DST) $(MAIN)