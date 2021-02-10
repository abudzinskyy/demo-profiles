Conditional Beans work when add configuration to application.yml.

But when use profiles, e.g. -Dmicronaut.environments=bar, it does not work:
```
No bean of type [com.example.service.MyService] exists.
```

https://docs.micronaut.io/latest/guide/index.html#conditionalBeans
