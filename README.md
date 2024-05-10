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

