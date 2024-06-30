```text
mvn clean compile dependency:copy-dependencies package
```

Create a locator and two servers in gfsh
```
start locator --dir state/locator1
start server --server-port 0 --dir state/s1
start server --server-port 0 --dir state/s2
```

Create a region for the data
```
create region --name presidents --type=PARTITION
```

Examples of put and get commands
```
put --region presidents --key 1 --value "George Washington" --key-class=java.lang.Integer
put --region presidents --key 2 --value "John Adams" --key-class=java.lang.Integer
put --region presidents --key 3 --value "Thomas Jefferson" --key-class=java.lang.Integer
get --region presidents --key 2 --key-class=java.lang.Integer
```

Use this version on linux
```text
java -cp target/GemFireHello-1.0.jar:target/dependency/*  com.vmware.gemfire.GemFireHello
```

Use this version on Windows
```text
java -cp "target/GemFireHello-1.0.jar;target/dependency/*"  com.vmware.gemfire.GemFireHello
```

Test the program worked in Java
```
get --region presidents --key 4 --key-class=java.lang.Integer
get --region presidents --key 10 --key-class=java.lang.Integer
```
