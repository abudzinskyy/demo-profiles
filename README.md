Conditional Beans work when add configuration to application.yml.

It works with environments when use MICRONAUT_ENVIRONMENTS variable.
When pass environment as parameter, e.g. -Dmicronaut.environments=bar, it does not work:
```
No bean of type [com.example.service.MyService] exists.
```

https://docs.micronaut.io/latest/guide/index.html#conditionalBeans
