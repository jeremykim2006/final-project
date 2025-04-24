User.class: User.java
	javac -g User.java

Meal.class: Meal.java
	javac -g Meal.java

Tracker.class: Tracker.java User.class Meal.class
	javac -g Tracker.java

CTCLI.class: CTCLI.java Tracker.class Meal.class User.class
	javac -g CTCLI.java

testCLI: CTCLI.class
	java CTCLI

clean:
	rm -f *.class
