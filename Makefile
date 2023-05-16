JCC = javac
JV  = java
SOURCE = Calculator.java


Calculator:Calculator.class
	$(JV) Caculator

Calculator.class:Calculator.java
	$(JCC) $(SOURCE)

clean:
	rm *.class *~
