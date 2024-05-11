```text
mvn clean compile dependency:copy-dependencies package
```

Use this version on linux
```text
java -cp target/GemFireHello-1.0.jar:target/dependency/*  com.vmware.gemfire.GemFireHello
```

Use this version on Windows
```text
java -cp "target/GemFireHello-1.0.jar;target/dependency/*"  com.vmware.gemfire.GemFireHello
```

Create a locator and two servers in gfsh
```
start locator --dir state/locator1
start server --server-port 0 --dir state/s1
start server --server-port 0 --dir state/s2
```

Create a region for the data
```
create region --name petnames --type=PARTITION
```
