## J

An easier way to write json strings inside java 8

## Code Example

```java
import static com.ericzumba.J.o;

o("a", 
  o("b", "c"))
.j();
```

stands for {"a": {"b": "c"}}

Of course, with static importing J.o this could be shortened a little bit more